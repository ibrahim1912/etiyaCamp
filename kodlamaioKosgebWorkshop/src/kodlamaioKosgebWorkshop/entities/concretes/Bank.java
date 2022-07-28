package kodlamaioKosgebWorkshop.entities.concretes;

import java.util.List;

public class Bank {

	private int id;
	private String name;
	private List<CustomerOfBank> customerOfBanks;

	public Bank() {
	}

	public Bank(int id, String name, List<CustomerOfBank> customerOfBanks) {
		this.id = id;
		this.name = name;
		this.customerOfBanks = customerOfBanks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CustomerOfBank> getCustomerOfBanks() {
		return customerOfBanks;
	}

	public void setCustomerOfBanks(List<CustomerOfBank> customerOfBanks) {
		this.customerOfBanks = customerOfBanks;
	}
}
