package kodlamaioKosgebWorkshop.entities.concretes;

public class Authority {

	private int id;
	private String authorityType;
	private AuthorityOfUser authorityOfUser;

	public Authority() {

	}

	public Authority(int id, String authorityType, AuthorityOfUser authorityOfUser) {
		this.id = id;
		this.authorityType = authorityType;
		this.authorityOfUser = authorityOfUser;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthorityType() {
		return authorityType;
	}

	public void setAuthorityType(String authorityType) {
		this.authorityType = authorityType;
	}

	public AuthorityOfUser getAuthorityOfUser() {
		return authorityOfUser;
	}

	public void setAuthorityOfUser(AuthorityOfUser authorityOfUser) {
		this.authorityOfUser = authorityOfUser;
	}
}
