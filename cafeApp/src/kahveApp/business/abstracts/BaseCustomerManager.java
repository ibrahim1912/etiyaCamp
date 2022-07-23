package kahveApp.business.abstracts;

import java.rmi.RemoteException;

import kahveApp.entities.concretes.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException, Exception  {
		System.out.println("Saved to db : " + customer.getFirstName());
		
	}

}
