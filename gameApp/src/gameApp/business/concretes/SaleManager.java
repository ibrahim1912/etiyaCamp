package gameApp.business.concretes;

import java.util.List;

import gameApp.business.abstracts.SaleService;
import gameApp.entities.concretes.Campaign;
import gameApp.entities.concretes.Game;
import gameApp.entities.concretes.Player;
import gameApp.entities.concretes.Sale;

public class SaleManager implements SaleService{

	@Override
	public void sale(Sale sale) {
		Player player = sale.getPlayer();
		Game game = sale.getGame();
		double discountedPrice = calculateDiscountedPrice(sale);
		System.out.println("Satış yapılan oyuncu: " +player.getFirstName() + " " + player.getLastName());
		System.out.println("Satış yapılan oyun: " +game.getName() + "\nFiyatı: " + game.getPrice());
		System.out.println("Kampanyadan sonraki fiyatı: " +discountedPrice + "\n");
		
	}
	
	private double calculateDiscountedPrice(Sale sale) {
		Campaign campaign = sale.getCampaign();
		Game game = sale.getGame();
		double campaignDiscount = campaign.getDiscount();
		double discountedPrice = game.getPrice() - (game.getPrice()*(campaignDiscount/100));
		return discountedPrice;
	}

	@Override
	public List<Sale> getAll() {
		return null;
	}

}
