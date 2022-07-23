package gameApp.business.concretes;

import java.util.ArrayList;
import java.util.List;

import gameApp.business.abstracts.PlayerService;
import gameApp.business.abstracts.UserCheckService;
import gameApp.entities.concretes.Player;

public class PlayerManager implements PlayerService {

	private List<Player> players;
	private UserCheckService userCheckService;
	public PlayerManager(UserCheckService userCheckService) {
		players = new ArrayList<Player>();
		this.userCheckService = userCheckService;
	}
	@Override
	public void add(Player player) throws Exception {
		if(userCheckService.checkIfRealPerson(player)) {
			players.add(player);
			System.out.println(player.getFirstName() + player.getLastName() + " : kullanıcı eklendi");
		}else {
			throw new Exception("Kullancı bilgileri hatalıdır");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + player.getLastName() + " : kullanıcı silindi");
		
	}

	@Override
	public List<Player> getAll() {
		return players;
	}
	
	

}
