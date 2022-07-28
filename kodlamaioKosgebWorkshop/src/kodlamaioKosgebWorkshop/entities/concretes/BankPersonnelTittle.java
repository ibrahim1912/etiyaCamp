package kodlamaioKosgebWorkshop.entities.concretes;

import java.util.List;

public class BankPersonnelTittle {

	private int id;
    private String tittle;
    private List<BankPersonnel> bankPersonnels;

    public BankPersonnelTittle() {
    }

    public BankPersonnelTittle(int id, String tittle, List<BankPersonnel> bankPersonnels) {
        this.id = id;
        this.tittle = tittle;
        this.bankPersonnels = bankPersonnels;
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

    public List<BankPersonnel> getBankPersonnels() {
        return bankPersonnels;
    }

    public void setBankPersonnels(List<BankPersonnel> bankPersonnels) {
        this.bankPersonnels = bankPersonnels;
    }
}
