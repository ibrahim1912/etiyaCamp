package kodlamaioCleanCode.ch03technicalDept;

public class Main {
	public static void main(String[] args) throws Exception {

		CustomerManager customerManager = new CustomerManager();

		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("A");
		customer.setLastName("B");
		customer.setIdentyNumber("12");
		//customerManager.refactoredAdd1(customer);
		
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setFirstName("g");
		customer2.setLastName("dff");
		customer2.setIdentyNumber("223424");
		
		// firstName min 2 karekter olmalı bu işleme özel
		//farklı businessı ve farklı bir operasyon olabilir
		customerManager.refactoredAddByOtherBusiness(customer2);

		Customer customer3 = new Customer();
		customer3.setId(3);
		customer3.setFirstName("Linux3");
		customer3.setLastName("Torvalds");
		customer3.setIdentyNumber("223424");

	}
}

class CustomerManager {

	public void add(Customer customer) {
		// teknik borç
		// validasyon ve iş kuralları iç içe olmamalıdır
		// İki operasyonu ayırmamız gerekir
		if (!customer.getFirstName().isEmpty() && !customer.getLastName().isEmpty() // validasyon
				&& !customer.getIdentyNumber().isEmpty()) {
			// iş kuralları
			System.out.println("İş kuralları");
			System.out.println("İş kuralları");
			System.out.println("İş kuralları");
			System.out.println("İş kuralları");

		}

	}

	public void refactoredAdd1(Customer customer) throws Exception {

		// validasyonu ayrı metot olarak yazdık.İş kurallarından ayırdık
		validate(customer); // validasyon
		
		// Validasyondan geçerse iş kuralları çalışır
		// iş kuralları
		System.out.println("Is kurallari");
		System.out.println("Is kurallari");
		System.out.println("Is kurallari");
		
		CustomerDao customerDao = new CustomerDao();
		customerDao.add(customer);
		
		
	}

	// 
	public void refactoredAddByOtherBusiness(Customer customer) throws Exception {

	
		// bunu artık kullanmıyoruz tüm kuralları ayırdık
		//validate(customer); // validasyon
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		validateFirstNameLength(customer);
		
		// Validasyondan geçerse iş kuralları çalışır
		// iş kuralları
		System.out.println("Is kurallari");
		System.out.println("Is kurallari");
		System.out.println("Is kurallari");
		
		CustomerDao customerDao = new CustomerDao();
		customerDao.add(customer);
	}

	//tüm logicler bir arada refactor edilmeli
	//farklı kural gelirse diger kullanılan yerler patlar
	private void validate(Customer customer) throws Exception {
		if ((customer.getFirstName().isEmpty() || customer.getLastName().isEmpty()
				|| customer.getIdentyNumber().isEmpty())) {
			throw new Exception("Validasyon hatasi oldu");
		}
	}
	
	//istediğimiz dogrulamayı tak çıkar yapıyoruz
	//bunun eksikliği çıkarmak istediğimiz dogrulamayı tüm operasyonlarda tek tek çıkarmalıyız
	
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
}

class CustomerDao{ //veriyi db ye ekleriz burda iş kuralları yok
	public void add(Customer customer) {
		System.out.println("Db ye eklendi");
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
