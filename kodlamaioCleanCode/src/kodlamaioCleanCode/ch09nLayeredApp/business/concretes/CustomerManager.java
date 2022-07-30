package kodlamaioCleanCode.ch09nLayeredApp.business.concretes;

import kodlamaioCleanCode.ch09nLayeredApp.business.abstracts.CustomerService;
import kodlamaioCleanCode.ch09nLayeredApp.business.abstracts.PersonService;
import kodlamaioCleanCode.ch09nLayeredApp.dataAccess.abstracts.CustomerRepository;
import kodlamaioCleanCode.ch09nLayeredApp.entities.concretes.Customer;
import kodlamaioCleanCode.ch09nLayeredApp.entities.concretes.Person;

public class CustomerManager implements CustomerService {

	CustomerRepository customerRepository;
	PersonService personService;

	public CustomerManager(CustomerRepository customerRepository, PersonService personService) {
		this.customerRepository = customerRepository;
		this.personService = personService;
	}

	public void add(Customer customer) throws Exception {

		// validation kuralları
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);

		// iş kuralları
		checkPerson(customer);
		checkCustomerExists(customer); // müşteri var mı yok mu kontrol et

		System.out.println("Is kurallari");
		System.out.println("Is kurallari");
		System.out.println("Is kurallari");

		customerRepository.add(customer);

	}

	public void refactoredAddByOtherBusiness(Customer customer) throws Exception {

		// validation kuralları
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		validateFirstNameLength(customer);

		// iş kuralları
		checkPerson(customer);
		checkCustomerExists(customer);
		System.out.println("Is kurallari");
		System.out.println("Is kurallari");
		System.out.println("Is kurallari");
		;
		customerRepository.add(customer);
	}

	/**
	 * <h1>Kişi bilgilerinin doğruluğunu kontrol ediyoruz</h1>
	 * @param person Kişi bilgisi
	 * @throws Exception
	 */
	private void checkPerson(Person person) throws Exception {
		if (!personService.checkPerson(person)) {
			throw new Exception("Kisi bilgileri hatali");
		}
	}

	private void validateFirstNameIfEmpty(Customer customer) throws Exception {
		if ((customer.getFirstName().isEmpty())) {
			throw new Exception("isim bos gecilemez");
		}
	}

	private void validateFirstNameLength(Customer customer) throws Exception {
		if ((customer.getLastName().length() < 2)) {
			throw new Exception("Isim en az iki karakterli olmalıdır");
		}
	}

	private void validateLastNameIfEmpty(Customer customer) throws Exception {
		if ((customer.getLastName().isEmpty())) {
			throw new Exception("Soyisim bos gecilemez");
		}
	}

	private void checkCustomerExists(Customer customer) throws Exception {
		if (!customerRepository.customerExists(customer)) {
			throw new Exception("Musteri zaten var");
		}
	}
	
}
