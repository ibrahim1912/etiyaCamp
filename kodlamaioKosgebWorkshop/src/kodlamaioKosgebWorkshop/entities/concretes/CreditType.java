package kodlamaioKosgebWorkshop.entities.concretes;

import java.time.LocalDate;

public class CreditType {

	  private int id;
	    private LocalDate startedDate;
	    private LocalDate dueDate;
	    private CreditVariety creditVariety;
	    private Credit credit;

	    public CreditType() {
	    }

	    public CreditType(int id, LocalDate startedDate, LocalDate dueDate, CreditVariety creditVariety, Credit credit) {
	        this.id = id;
	        this.startedDate = startedDate;
	        this.dueDate = dueDate;
	        this.creditVariety = creditVariety;
	        this.credit = credit;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public LocalDate getStartedDate() {
	        return startedDate;
	    }

	    public void setStartedDate(LocalDate startedDate) {
	        this.startedDate = startedDate;
	    }

	    public LocalDate getDueDate() {
	        return dueDate;
	    }

	    public void setDueDate(LocalDate dueDate) {
	        this.dueDate = dueDate;
	    }

	    public CreditVariety getCreditVariety() {
	        return creditVariety;
	    }

	    public void setCreditVariety(CreditVariety creditVariety) {
	        this.creditVariety = creditVariety;
	    }

	    public Credit getCredit() {
	        return credit;
	    }

	    public void setCredit(Credit credit) {
	        this.credit = credit;
	    }
}
