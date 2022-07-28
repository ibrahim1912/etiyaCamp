package kodlamaioKosgebWorkshop.entities.concretes;

import java.util.List;

public class KosgebPersonnel extends Personnel{

    private KosgebPersonnelTittle kosgebPersonnelTittle;


    public KosgebPersonnel(){

    }

    public KosgebPersonnel(int id, String email, String password, List<AuthorityOfUser> authorityOfUsers, String firstName, String lastName, KosgebPersonnelTittle kosgebPersonnelTittle) {
        super(id, email, password, authorityOfUsers, firstName, lastName);
        this.kosgebPersonnelTittle = kosgebPersonnelTittle;
    }

    public KosgebPersonnelTittle getKosgebPersonnelTittle() {
        return kosgebPersonnelTittle;
    }

    public void setKosgebPersonnelTittle(KosgebPersonnelTittle kosgebPersonnelTittle) {
        this.kosgebPersonnelTittle = kosgebPersonnelTittle;
    }
}