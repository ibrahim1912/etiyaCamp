package kodlamaioKosgebWorkshop.entities.concretes;

public class Authority {

	private int id;
	private String authorityType;
	
	

	public Authority() {

	}

	public Authority(int id, String authorityType) {
		this.id = id;
		this.authorityType = authorityType;
	
		
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

	

	
}
