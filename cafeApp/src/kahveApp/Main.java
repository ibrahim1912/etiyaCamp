package kahveApp;

import java.rmi.RemoteException;

import kahveApp.business.abstracts.BaseCustomerManager;
import kahveApp.business.concretes.NeroCustomerManager;
import kahveApp.business.concretes.StarbucksCustomerManager;
import kahveApp.core.adapters.CustomerFakeCheckManager;
import kahveApp.core.adapters.MernisKpsAdapter;
import kahveApp.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException, Exception {
		Customer customer = new Customer(1,"ibrahim","Kaplan","121212",1992);
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerFakeCheckManager());
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisKpsAdapter());
		neroCustomerManager.Save(customer);
		starbucksCustomerManager.Save(customer);
	}

}
