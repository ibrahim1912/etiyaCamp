package kodlamaioKosgebWorkshop.entities.concretes;

import java.util.List;

public class KosgebPersonnelTittle {

	private int id;
    private String tittle;
    private List<KosgebPersonnel> kosgebPersonnels;

    public KosgebPersonnelTittle(){

    }

    public KosgebPersonnelTittle(int id, String tittle, List<KosgebPersonnel> kosgebPersonnels) {
        this.id = id;
        this.tittle = tittle;
        this.kosgebPersonnels = kosgebPersonnels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public List<KosgebPersonnel> getKosgebPersonnels() {
        return kosgebPersonnels;
    }

    public void setKosgebPersonnels(List<KosgebPersonnel> kosgebPersonnels) {
        this.kosgebPersonnels = kosgebPersonnels;
    }
}
