package kodlamaioKosgebWorkshop.entities.concretes;

public class CreditVariety {

	private int id;
    private String creditName;

    public CreditVariety() {
    }

    public CreditVariety(int id, String creditName) {
        this.id = id;
        this.creditName = creditName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }
}
