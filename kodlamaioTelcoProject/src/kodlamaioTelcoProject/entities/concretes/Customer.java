package kodlamaioTelcoProject.entities.concretes;

import java.util.List;


public class Customer {


	private int id;
	private String customerNumber;
	
	private List<Subscription> subscriptions;
	private List<Address> addresses;
	
	public Customer() {
		
	}

	public Customer(int id, String customerNumber, List<Subscription> subscriptions,
			List<Address> addresses) {
		this.id = id;
		this.customerNumber = customerNumber;
		this.subscriptions = subscriptions;
		this.addresses=addresses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}
