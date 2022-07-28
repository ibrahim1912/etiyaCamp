package kodlamaioKosgebWorkshop.entities.concretes;

import java.util.List;

public class CorporateCustomer extends Customer {

	private String taxNumber;
    private String companyName;

    public CorporateCustomer(){

    }

    public CorporateCustomer(int id, String email, String password, List<AuthorityOfUser> authorityOfUsers, String customerNumber, List<Application> applications, String taxNumber, String companyName) {
        super(id, email, password, authorityOfUsers, customerNumber, applications);
        this.taxNumber = taxNumber;
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
