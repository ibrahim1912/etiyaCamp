package kodlamaioKosgebWorkshop.entities.concretes;

import java.util.List;

public class CustomerOfBank extends Customer {

	private String firstName;
	private String lastName;
	private Bank bank;

	public CustomerOfBank() {

	}

	public CustomerOfBank(int id, String email, String password, List<AuthorityOfUser> authorityOfUsers,
			String customerNumber, List<Application> applications, String firstName, String lastName,
			Bank bank) {
		super(id, email, password, authorityOfUsers, customerNumber, applications);
		this.firstName = firstName;
		this.lastName = lastName;
		this.bank = bank;
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

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
}
