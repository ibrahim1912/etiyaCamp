package kodlamaioKosgebWorkshop.entities.concretes;


import java.util.List;

public class ApplicationType {

    private int id;
    private String name;
    
    private List<Application> applications;

    public ApplicationType() {
    }

    public ApplicationType(int id, String name, List<Application> applications) {
        this.id = id;
        this.name = name;
        this.applications = applications;
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

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

  
}
