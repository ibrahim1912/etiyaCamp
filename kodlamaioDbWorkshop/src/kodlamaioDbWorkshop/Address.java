package kodlamaioDbWorkshop;

public class Address {

	private int id;
	private String addressText;
	private Customer customer;
	
	public Address() {
		
	}

	public Address(int id, String addressText, Customer customer) {
		this.id = id;
		this.addressText = addressText;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressText() {
		return addressText;
	}

	public void setAddressText(String addressText) {
		this.addressText = addressText;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
