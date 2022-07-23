package kahveApp.business.abstracts;

import java.rmi.RemoteException;

import kahveApp.entities.concretes.Customer;

public interface CustomerService {

	void Save(Customer customer)throws NumberFormatException, RemoteException, Exception ;
}
