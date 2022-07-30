package kodlamaioCleanCode.ch10educationSale.business.concretes;

import java.util.List;
import kodlamaioCleanCode.ch10educationSale.business.abstracts.CampaignService;
import kodlamaioCleanCode.ch10educationSale.entities.concretes.Education;

public class StandardCampaignManager implements CampaignService{

	@Override
	public void updatePrice(List<Education> educations) {
		for (Education education : educations) {
			education.setPrice(getcurrentStandardPrice());
		}
		
	}
	
	private double getcurrentStandardPrice() {
		// veri tabanına bağlan
		return 25;

	}

}
