package gameApp;


import gameApp.business.concretes.CampaignManager;
import gameApp.business.concretes.GameManager;
import gameApp.business.concretes.PlayerManager;
import gameApp.business.concretes.SaleManager;
import gameApp.core.adapters.MernisKpsAdapter;
import gameApp.core.adapters.UserFakeCheckManager;
import gameApp.entities.concretes.Campaign;
import gameApp.entities.concretes.Game;
import gameApp.entities.concretes.Player;
import gameApp.entities.concretes.Sale;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		Player player1 = new Player(1,"email","password","İbrahim","Kaplan","1212",1992);
		Player player2 = new Player(2,"email2","password2","İbrahim2","Kaplan2","1212",1992);
		
		PlayerManager playerManager = new PlayerManager(new MernisKpsAdapter());
		playerManager.add(player1);
		playerManager.add(player2);
		
		PlayerManager playerManager2 = new PlayerManager(new UserFakeCheckManager());
		playerManager2.add(player1);
		
		Game game1 = new Game(1, "Game 1", 400);
		Game game2 = new Game(2, "Game 2", 200);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		
		Campaign campaign1 = new Campaign(1, "Kış Indirimi", 20);
		Campaign campaign2 = new Campaign(2,"Karne Indirimi", 50);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		
		SaleManager saleManager = new SaleManager();
		
		Sale sale1 = new Sale(1, player1, game1, campaign1);
		Sale sale2 = new Sale(2,player1,game2,campaign2);
		
		saleManager.sale(sale1);
		saleManager.sale(sale2);
		
	}

}
