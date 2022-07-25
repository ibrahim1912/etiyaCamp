package kodlamaioDbWorkshop;

import java.time.LocalDate;

public class CommercialActivity {

	private int id;
	private IndividualCustomer individualCustomer;
	private LocalDate startingDate;
	
	public CommercialActivity() {
		
	}

	public CommercialActivity(int id, IndividualCustomer individualCustomer, LocalDate startingDate) {
		this.id = id;
		this.individualCustomer = individualCustomer;
		this.startingDate = startingDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IndividualCustomer getIndividualCustomer() {
		return individualCustomer;
	}

	public void setIndividualCustomer(IndividualCustomer individualCustomer) {
		this.individualCustomer = individualCustomer;
	}

	public LocalDate getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}
}
