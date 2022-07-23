package gameApp.business.abstracts;

import java.util.List;

import gameApp.entities.concretes.Game;

public interface GameService {

	void add(Game game);
	void delete(Game game);
	
	List<Game> getAll();
}
