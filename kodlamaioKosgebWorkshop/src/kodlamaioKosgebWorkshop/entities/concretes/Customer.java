package kodlamaioKosgebWorkshop.entities.concretes;

import java.util.List;

public class Customer extends User{

	private String customerNumber;
	
	private List<Application> applications;
	private List<BannedList> bannedLists;

	public Customer() {

	}

	public Customer(int id, String email, String password, List<AuthorityOfUser> authorityOfUsers,
			String customerNumber, List<Application> applications) {
		super(id, email, password, authorityOfUsers);
		this.customerNumber = customerNumber;
		this.applications = applications;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}
}
