package gameApp.core.adapters;

import java.rmi.RemoteException;

import gameApp.business.abstracts.UserCheckService;
import gameApp.entities.concretes.Player;

public class UserFakeCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) throws NumberFormatException, RemoteException {
		return true;
	}
}
