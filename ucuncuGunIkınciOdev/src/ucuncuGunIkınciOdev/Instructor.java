package ucuncuGunIkınciOdev;

public class Instructor extends User{

	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private String phoneNumber;
	
	public Instructor() {
		
	}

	public Instructor(int id,String email,String password,String firstName, String lastName, String nationalIdentity, String phoneNumber) {
		super(id,email,password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.phoneNumber = phoneNumber;
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

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
	
}
