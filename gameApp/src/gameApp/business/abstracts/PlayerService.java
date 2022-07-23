package gameApp.business.abstracts;

import java.rmi.RemoteException;
import java.util.List;

import gameApp.entities.concretes.Player;

public interface PlayerService {

	void add(Player player) throws NumberFormatException, RemoteException, Exception;
	void delete(Player player);
	
	List<Player> getAll();
}
