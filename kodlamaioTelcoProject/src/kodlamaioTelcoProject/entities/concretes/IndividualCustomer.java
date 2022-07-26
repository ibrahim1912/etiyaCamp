package kodlamaioTelcoProject.entities.concretes;

import java.util.List;


public class IndividualCustomer extends Customer{

	private String firstName;
	private String lastName;
	private String nationalIdentity;
	
	public IndividualCustomer() {
		
	}

	public IndividualCustomer(int id, String customerNumber,String firstName, String lastName,
			String nationalIdentity,List<Subscription> subscriptions,List<Address> addresses) {
		super(id,customerNumber,subscriptions,addresses);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
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
}
