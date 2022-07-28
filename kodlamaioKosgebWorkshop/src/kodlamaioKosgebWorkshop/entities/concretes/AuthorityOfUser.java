package kodlamaioKosgebWorkshop.entities.concretes;

public class AuthorityOfUser {

	private int id;
    private Authority authority;
    private User user;

    public AuthorityOfUser() {
    }

    public AuthorityOfUser(int id, Authority authority, User user) {
        this.id = id;
        this.authority = authority;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
