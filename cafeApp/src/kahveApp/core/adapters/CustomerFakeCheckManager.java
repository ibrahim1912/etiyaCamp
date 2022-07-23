package kahveApp.core.adapters;

import java.rmi.RemoteException;

import kahveApp.business.abstracts.CustomerCheckService;
import kahveApp.entities.concretes.Customer;

public class CustomerFakeCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		return true;
	}

}
