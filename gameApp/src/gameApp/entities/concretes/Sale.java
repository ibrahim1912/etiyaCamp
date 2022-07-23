package gameApp.entities.concretes;

public class Sale {

	private int id;
	private Player player;
	private Game game;
	private Campaign campaign;
	
	public Sale() {
		
	}

	public Sale(int id, Player player, Game game, Campaign campaign) {
		super();
		this.id = id;
		this.player = player;
		this.game = game;
		this.campaign = campaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
}
