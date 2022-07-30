package kodlamaioCleanCode.ch09nLayeredApp.core.adapters;

import kodlamaioCleanCode.ch09nLayeredApp.business.abstracts.PersonService;
import kodlamaioCleanCode.ch09nLayeredApp.entities.concretes.Person;

public class KpsServiceAdapter  implements PersonService{
	@Override
	public boolean checkPerson(Person person) {
		KpsService kpsService = new KpsService();
		return kpsService.checkPerson(person.getFirstName(), person.getLastName());
	}
}


//bu koda dokunulmuyor dışardan geliyor
class KpsService {
	public boolean checkPerson(String firstName, String lastName) {
		return true;
	}
}