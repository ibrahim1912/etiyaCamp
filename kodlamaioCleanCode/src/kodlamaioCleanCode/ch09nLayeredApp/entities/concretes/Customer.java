package kodlamaioCleanCode.ch09nLayeredApp.entities.concretes;


public class Customer extends Person {
	String creditCardNumber;

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

}
