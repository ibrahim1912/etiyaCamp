package eTrade.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTrade.business.abstracts.GoogleAccountService;
import eTrade.business.abstracts.UserService;
import eTrade.business.abstracts.VerificationEmailService;
import eTrade.dataAccess.abstracts.UserRepository;
import eTrade.entities.concretes.User;

public class UserManager implements UserService {

	private UserRepository userRepository;
	private VerificationEmailService verificationEmailService;
	private GoogleAccountService googleAccountService;
	
	public UserManager(UserRepository userRepository,VerificationEmailService verificationEmailService,
			GoogleAccountService googleAccountService) {
		this.userRepository = userRepository;
		this.verificationEmailService=verificationEmailService;
		this.googleAccountService=googleAccountService;
	}

	@Override
	public void add(User user) throws Exception {
		checkIfUserPasswordIsShort(user.getPassword());
		checkIfUserEmailFormatWrong(user.getEmail());
		checkIfUserFirstNameIsShort(user.getFirstName());
		checkIfUserLastNameIsShort(user.getLastName());
		checkIfUserEmailExists(user.getEmail());
		checkIfVerificationEmailSended(user);
		checkIfGoogleAccountSignIn(user.getEmail());
		
		this.userRepository.add(user);
		System.out.println("Kullanıcı eklendi : " + user.getFirstName() + " " + user.getLastName());
		
	}
	
	@Override
	public void login(User user) throws Exception {
		
		checkIfUserEmailRegistered(user);
		checkIfUserPasswordCorrect(user);
		checkIfUserPasswordEmpty(user.getPassword());
		checkIfUserEmailEmpty(user.getEmail());
		
		System.out.println("Giriş yapıldı");
	}

	@Override
	public void delete(User user) {
		this.userRepository.delete(user);
		System.out.println("Kullanıcı silindi : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) throws Exception {
		checkIfUserPasswordIsShort(user.getPassword());
		checkIfUserEmailFormatWrong(user.getEmail());
		checkIfUserFirstNameIsShort(user.getFirstName());
		checkIfUserLastNameIsShort(user.getLastName());
		checkIfUserEmailIsSameForUpdate(user);
		
		this.userRepository.update(user);
		System.out.println("Kullanıcı güncellendi : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public User getById(int id) {
		return this.userRepository.getById(id);
	}

	@Override
	public List<User> getAll() {
	
		return this.userRepository.getAll();
	}
	
	private void checkIfUserPasswordIsShort(String password) throws Exception {
		if (password.length() < 6) {
			throw new Exception("Parola en az 6 karakterden oluşmalıdır.");
		}
	}

	private void checkIfUserEmailFormatWrong(String email) throws Exception {
		String regex = "^(?=.{1,64}@)[\\p{L}0-9_-]+(\\.[\\p{L}0-9_-]+)*@" 
		        + "[^-][\\p{L}0-9-]+(\\.[\\p{L}0-9-]+)*(\\.[\\p{L}]{2,})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		if (!matcher.matches()) {
			throw new Exception("E-posta alanı e-posta formatında olmalıdır.");
		}
		if (email.isEmpty()) {
			throw new Exception("E-posta alanı boş geçilemez");
		}
	}

	private void checkIfUserFirstNameIsShort(String firstName) throws Exception {
		if (firstName.length() < 3) {
			throw new Exception("Ad en az iki karakterden oluşmalıdır");
		}
	}

	private void checkIfUserLastNameIsShort(String lastName) throws Exception {
		if (lastName.length() < 3) {
			throw new Exception("Soyad en az iki karakterden oluşmalıdır");
		}
	}
	
	private void checkIfUserEmailExists(String email) throws Exception {
	
		for (User user : this.userRepository.getAll()) {
			if (user.getEmail()==(email)) {
				throw new Exception("E-Posta daha önce kullanılmamış olmalıdır.");
			}
		}
	}
	
	private void checkIfUserEmailIsSameForUpdate(User user) throws Exception{
		User userFromRepository = getById(user.getId());
		if(!userFromRepository.getEmail().equals(user.getEmail())) {
			checkIfUserEmailExists(user.getEmail());
		}
		
	}
	
	private void checkIfVerificationEmailSended(User user) throws Exception {
		if (!this.verificationEmailService.verificationEmail(user)) {
			throw new Exception("Doğrulama e-postası gönderilemedi");
		}
	}
	private void checkIfGoogleAccountSignIn(String email) throws Exception {
		if(!this.googleAccountService.googleLogin(email)) {
			throw new Exception("Google hesabı ile kayıt yapınız");
		}
	}
	
	private void checkIfUserEmailEmpty(String email) throws Exception {
		if (email==null) {
			throw new Exception("E-posta alanı boş geçilemez");
		}
	}
	
	private void checkIfUserPasswordEmpty(String password) throws Exception {
		if (password==null) {
			throw new Exception("Şifre alanı boş geçilemez");
		}
	}
	
	private void checkIfUserEmailRegistered(User user) throws Exception {
		User userFromRepository = getById(user.getId());
		if(!(userFromRepository.getEmail() == user.getEmail() && userFromRepository.getPassword() == user.getPassword())) {
			throw new Exception("Böyle bir kullanıcı bulunamadı");
		}
	}
	
	private void checkIfUserPasswordCorrect(User user) throws Exception {
		User userFromRepository = getById(user.getId());
		if(!(userFromRepository.getEmail() == user.getEmail() && userFromRepository.getPassword() == user.getPassword())) {
			throw new Exception("Böyle bir kullanıcı bulunamadı");
		}
	}
	
	
}
