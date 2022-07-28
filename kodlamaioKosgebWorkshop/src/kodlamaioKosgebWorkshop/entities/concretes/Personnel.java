package kodlamaioKosgebWorkshop.entities.concretes;

import java.util.List;

public class Personnel extends User{

    private String firstName;
    private String lastName;

    public Personnel(){

    }
    public Personnel(int id, String email, String password, List<AuthorityOfUser> authorityOfUsers, String firstName, String lastName) {
        super(id, email, password, authorityOfUsers);
        this.firstName = firstName;
        this.lastName = lastName;
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
}