package kodlamaioKosgebWorkshop.entities.concretes;

import java.util.List;

public class User {
    private int id;
    private String email;
    private String password;

    private List<AuthorityOfUser> authorityOfUsers;

    public User() {
    }

    public User(int id, String email, String password, List<AuthorityOfUser> authorityOfUsers) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.authorityOfUsers = authorityOfUsers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<AuthorityOfUser> getAuthorityOfUsers() {
        return authorityOfUsers;
    }

    public void setAuthorityOfUsers(List<AuthorityOfUser> authorityOfUsers) {
        this.authorityOfUsers = authorityOfUsers;
    }
}