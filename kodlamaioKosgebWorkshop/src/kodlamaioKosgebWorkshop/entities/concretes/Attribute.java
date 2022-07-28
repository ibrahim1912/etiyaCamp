package kodlamaioKosgebWorkshop.entities.concretes;

public class Attribute {

	private int id;
    private String name;
    private String value;
    

    public Attribute(){

    }

    public Attribute(int id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

 
}
