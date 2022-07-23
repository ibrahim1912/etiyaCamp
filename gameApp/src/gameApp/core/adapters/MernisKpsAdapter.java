package gameApp.core.adapters;

import java.rmi.RemoteException;

import gameApp.business.abstracts.UserCheckService;
import gameApp.entities.concretes.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisKpsAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalIdentity()),
				player.getFirstName().toUpperCase(),
				player.getLastName().toUpperCase(),
				player.getBirthYear());
		return result;
	}

}


