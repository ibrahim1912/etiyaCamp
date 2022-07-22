package ucuncuGunIkınciOdev;

public class Student extends User{

	private String firstName;
	private String lastName;
	private String department;
	private int birthYear;

	public Student() {

	}

	public Student(int id,String email,String password,String firstName, String lastName, String department, int birthYear) {
		super(id,email,password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.birthYear = birthYear;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}
