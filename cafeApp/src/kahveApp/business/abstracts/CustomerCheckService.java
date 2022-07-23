package kahveApp.business.abstracts;

import java.rmi.RemoteException;

import kahveApp.entities.concretes.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
