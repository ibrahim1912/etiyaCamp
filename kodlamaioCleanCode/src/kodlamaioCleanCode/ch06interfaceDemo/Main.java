package kodlamaioCleanCode.ch06interfaceDemo;


public class Main {

	public static void main(String[] args) throws Exception {
		CustomerManager customerManager = new CustomerManager(new HibernateCustomerRespository());

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

class CustomerManager {

	CustomerRepository customerRepository;
	
	public CustomerManager(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public void add(Customer customer) throws Exception {
		
		// validation kuralları
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
	
		// iş kuralları
		checkCustomerExists(customer); //müşteri var mı yok mu kontrol et
		
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
		checkCustomerExists(customer); 
		System.out.println("Is kurallari");
		System.out.println("Is kurallari");
		System.out.println("Is kurallari");
;
		customerRepository.add(customer);
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


interface CustomerRepository {
	void add(Customer customer);
	boolean customerExists(Customer customer);
}


class HibernateCustomerRespository implements CustomerRepository{

	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate kullanılarak veritabanına eklendi.");
		
	}

	@Override
	public boolean customerExists(Customer customer) {
		return true;
	}
	
}

class JdbcCustomerRepository implements CustomerRepository{

	@Override
	public void add(Customer customer) {
		System.out.println("Jbdc kullanılarak veritabanına eklendi.");
		
	}

	@Override
	public boolean customerExists(Customer customer) {
		return true;
	}
	
}
class Customer{
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
