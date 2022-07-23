package gameApp.business.concretes;

import java.util.ArrayList;
import java.util.List;

import gameApp.business.abstracts.GameService;
import gameApp.entities.concretes.Game;

public class GameManager implements GameService {

	private List<Game> games;
	public GameManager() {
		games = new ArrayList<Game>();
	}
	@Override
	public void add(Game game) {
		games.add(game);
		System.out.println(game.getName() + " : Oyunu eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " : Oyunu silindi");
		
	}

	@Override
	public List<Game> getAll() {
		return games;
	}

}
