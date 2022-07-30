package kodlamaioCleanCode.ch05referenceTypes;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Ibo");

		Customer customer2 = customer;
		System.out.println(customer2.getFirstName());

		customer.setFirstName("ddv");
		System.out.println(customer2.getFirstName());
		
		Person person1 = customer;
		Person person2 = new Employee();
		
		PersonDao personDao = new PersonDao();
		personDao.add(new Customer());
		personDao.add(new Employee());
		
		
		

	}
}

class Person{
	int id;
	String firstName;

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
}
class Customer extends Person {
	String creditCardNo;
	
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	
	public String getCreditCardNo() {
		return creditCardNo;
	}
}

class Employee extends Person {
	double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}


class PersonDao{
	public void add(Person person) {
		
	}
}