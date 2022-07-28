package kodlamaioKosgebWorkshop.entities.concretes;

public class Application {

	 private int id;
	    private ApplicationType applicationType;
	    private Customer customer;
	    private Credit credit;

	    public Application() {
	    }

	    public Application(int id, ApplicationType applicationType, Customer customer, Credit credit) {
	        this.id = id;
	        this.applicationType = applicationType;
	        this.customer = customer;
	        this.credit = credit;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public ApplicationType getApplicationType() {
	        return applicationType;
	    }

	    public void setApplicationType(ApplicationType applicationType) {
	        this.applicationType = applicationType;
	    }

	    public Customer getCustomer() {
	        return customer;
	    }

	    public void setCustomer(Customer customer) {
	        this.customer = customer;
	    }

	    public Credit getCredit() {
	        return credit;
	    }

	    public void setCredit(Credit credit) {
	        this.credit = credit;
	    }
}
