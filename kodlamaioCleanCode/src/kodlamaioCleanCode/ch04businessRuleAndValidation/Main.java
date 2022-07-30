package kodlamaioCleanCode.ch04businessRuleAndValidation;

public class Main {

	public static void main(String[] args) throws Exception {

		CustomerManager customerManager = new CustomerManager();

		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("A");
		customer.setLastName("B");
		customer.setIdentyNumber("12");
		customerManager.add(customer);

		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setFirstName("g");
		customer2.setLastName("dff");
		customer2.setIdentyNumber("223424");
		customerManager.refactoredAddByOtherBusiness(customer2);

		Customer customer3 = new Customer();
		customer3.setId(3);
		customer3.setFirstName("Linux3");
		customer3.setLastName("Torvalds");
		customer3.setIdentyNumber("223424");

	}
}

class CustomerManager {

	public void add(Customer customer) throws Exception {
		//Tüm iş ve validation kurallarını parça parça ayırdık
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		// Validasyondan geçerse iş kuralları çalışır
		// iş kuralları
		checkCustomerExists(customer); //müşteri var mı yok mu kontrol et
		
		System.out.println("Is kurallari");
		System.out.println("Is kurallari");
		System.out.println("Is kurallari");

		CustomerDao customerDao = new CustomerDao();
		customerDao.add(customer);

	}

	public void refactoredAddByOtherBusiness(Customer customer) throws Exception {

		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		validateFirstNameLength(customer);

		// Validasyondan geçerse iş kuralları çalışır
		// iş kuralları
		checkCustomerExists(customer); //iş kuralı müşteri var mı yok mu kontrol et
		System.out.println("Is kurallari");
		System.out.println("Is kurallari");
		System.out.println("Is kurallari");

		CustomerDao customerDao = new CustomerDao();
		customerDao.add(customer);
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
		CustomerDao customerDao = new CustomerDao();
		if (customerDao.customerExists(customer)) {
			throw new Exception("Musteri zaten var");
		}
	}
}

class CustomerDao { // veriyi db ye ekleriz burda iş kuralları yok
	public void add(Customer customer) {
		System.out.println("Db ye eklendi");
	}

	public boolean customerExists(Customer customer) {
		return true;
	}

}

class Customer {
	int id;
	int cityId;
	String firstName;
	String lastName;
	String identyNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
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

	public String getIdentyNumber() {
		return identyNumber;
	}

	public void setIdentyNumber(String identyNumber) {
		this.identyNumber = identyNumber;
	}

}