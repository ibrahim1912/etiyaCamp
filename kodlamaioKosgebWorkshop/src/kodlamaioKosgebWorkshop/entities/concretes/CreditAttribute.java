package kodlamaioKosgebWorkshop.entities.concretes;



public class CreditAttribute {

	private int id;
    private Credit credit;
    private Attribute attribute;
    

    public CreditAttribute() {
    }

    public CreditAttribute(int id, Credit credit,Attribute attribute) {
        this.id = id;
        this.credit = credit;
        this.attribute = attribute;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
}
