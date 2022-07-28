package kodlamaioKosgebWorkshop.entities.concretes;

public class BannedList {

	private int id;
    private Customer customer;
    private String cause;

    public BannedList() {
    }

    public BannedList(int id, Customer customer, String cause) {
        this.id = id;
        this.customer = customer;
        this.cause = cause;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}
