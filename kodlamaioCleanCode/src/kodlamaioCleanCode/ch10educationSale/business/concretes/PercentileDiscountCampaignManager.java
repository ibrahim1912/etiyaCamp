package kodlamaioCleanCode.ch10educationSale.business.concretes;

import java.util.List;
import kodlamaioCleanCode.ch10educationSale.business.abstracts.CampaignService;
import kodlamaioCleanCode.ch10educationSale.entities.concretes.Education;

public class PercentileDiscountCampaignManager implements CampaignService {

	@Override
	public void updatePrice(List<Education> educations) {
		for (Education education : educations) {
			education.setPrice(calculatePercentileDiscount(education.getPrice(), getPercentileDiscount()));
		}

	}

	private double getPercentileDiscount() {
		// veri tabanına bağlan
		return 0.90;
	}

	private double calculatePercentileDiscount(double price, double percentile) {
		return price - (price * percentile);
	}

}
