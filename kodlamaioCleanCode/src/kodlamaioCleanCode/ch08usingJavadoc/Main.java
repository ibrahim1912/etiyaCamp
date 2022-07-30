package kodlamaioCleanCode.ch08usingJavadoc;


public class Main {
	public static void main(String[] args) throws Exception {
		CustomerManager customerManager = new CustomerManager(new HibernateCustomerRespository(),
				new KpsServiceAdapter());

		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("A");
		customer.setLastName("B");
		customerManager.add(customer);

		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setFirstName("g");
		customer2.setLastName("dff");
		customerManager.refactoredAddByOtherBusiness(customer2);

	}

}

//bu koda dokunulmuyor dışardan geliyor
class KpsService {
	public boolean checkPerson(String firstName, String lastName) {
		return true;
	}
}

interface PersonService {
	boolean checkPerson(Person person);
}

class KpsServiceAdapter implements PersonService { // adapter pattern

	@Override
	public boolean checkPerson(Person person) {
		KpsService kpsService = new KpsService();
		return kpsService.checkPerson(person.getFirstName(), person.getLastName());
	}

}

interface CustomerRepository {
	/**
	 * <h1>Müşteri ekleme operasyonu</h1>
	 * @param customer
	 */
	void add(Customer customer);

	boolean customerExists(Customer customer);
}

class CustomerManager {

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



class HibernateCustomerRespository implements CustomerRepository {

	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate kullanilarak veritabanina eklendi.");

	}

	@Override
	public boolean customerExists(Customer customer) {
		return true;
	}

}

class JdbcCustomerRepository implements CustomerRepository {

	@Override
	public void add(Customer customer) {
		System.out.println("Jbdc kullanilarak veritabanina eklendi.");

	}

	@Override
	public boolean customerExists(Customer customer) {
		return true;
	}

}

class Person {
	int id;
	String firstName;
	String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

class Customer extends Person {
	String creditCardNumber;

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

}
