package kodlamaioKosgebWorkshop.entities.concretes;

import java.util.List;

public class Entrepreneur extends Customer{

    private String firstName;
    private String lastName;
    private String nationalIdentity;

    public Entrepreneur(){

    }

    public Entrepreneur(int id, String email, String password, List<AuthorityOfUser> authorityOfUsers, String customerNumber,
    		List<Application> applications, String firstName, String lastName, String nationalIdentity) {
        super(id, email, password, authorityOfUsers, customerNumber, applications);
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
