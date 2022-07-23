package kahveApp.core.adapters;

import java.rmi.RemoteException;

import kahveApp.business.abstracts.CustomerCheckService;
import kahveApp.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisKpsAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),
				customer.getBirthYear());
		return result;
	}

}
