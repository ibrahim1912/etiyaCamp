package kodlamaioKosgebWorkshop.entities.concretes;

import java.util.List;

public class BankPersonnel extends Personnel{

	private BankPersonnelTittle bankPersonnelTittle;

    public BankPersonnel(){

    }

    public BankPersonnel(int id, String email, String password, List<AuthorityOfUser> authorityOfUsers, String firstName, String lastName, BankPersonnelTittle bankPersonnelTittle) {
        super(id, email, password, authorityOfUsers, firstName, lastName);
        this.bankPersonnelTittle = bankPersonnelTittle;
    }

    public BankPersonnelTittle getBankPersonnelTittle() {
        return bankPersonnelTittle;
    }

    public void setBankPersonnelTittle(BankPersonnelTittle bankPersonnelTittle) {
        this.bankPersonnelTittle = bankPersonnelTittle;
    }
}
