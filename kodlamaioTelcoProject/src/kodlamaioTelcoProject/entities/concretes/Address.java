package kodlamaioTelcoProject.entities.concretes;

public class Address {
    private int id;
    private String addressText;
    private AddressType addressType;
    private Customer customer;

    public Address() {
    }

    public Address(int id, String addressText, AddressType addressType, Customer customer) {
        this.id = id;
        this.addressText = addressText;
        this.addressType = addressType;
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

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

  
}