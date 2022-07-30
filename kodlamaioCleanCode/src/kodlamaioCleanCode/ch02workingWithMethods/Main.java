package kodlamaioCleanCode.ch02workingWithMethods;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(); //değişken ismi class ismi ile aynı olmalıdır
		//sonradan cityId özelliği geldi hata verir tek tek eklememiz gerekir
//		customerManager.add(1,"İbrahim","Kaplan","12121");
//		customerManager.add(2,"İbrahim2","Kaplan","12121",23);
//		customerManager.add(3,"İbrahim3","Kaplan","12121");
//		customerManager.add(4,"İbrahim4","Kaplan","12121");
//		customerManager.add(5,"İbrahim5","Kaplan","12121");
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Linux");
		customer.setLastName("Torvalds");
		customer.setIdentyNumber("223424");
		
		Customer customer2 = new Customer();
		customer.setId(2);
		customer.setFirstName("Linux2");
		customer.setLastName("Torvalds");
		customer.setIdentyNumber("223424");
		
		Customer customer3 = new Customer();
		customer.setId(3);
		customer.setFirstName("Linux3");
		customer.setLastName("Torvalds");
		customer.setIdentyNumber("223424");
		
		//sonradan cityId özelliği geldi.Nesneye eklendiği için hata vermedi.
		customerManager.refactoredAdd(customer);
		customerManager.refactoredAdd(customer2);
		customerManager.refactoredAdd(customer3);
		
		
	}

}

class CustomerManager{
	
	public void add(int id,String firstName,String lastName,String identyNumber,int cityId) {
		System.out.println("Eklendi");
	}
	
	public void refactoredAdd(Customer customer) {
		System.out.println("Eklendi");
	}
}

class Customer {
	int id;
	int cityId; //foreign key primary key'in altına yazılır
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
