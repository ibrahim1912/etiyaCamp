package gameApp.business.abstracts;

import java.rmi.RemoteException;

import gameApp.entities.concretes.Player;

public interface UserCheckService {

	boolean checkIfRealPerson(Player player) throws NumberFormatException, RemoteException;
}
