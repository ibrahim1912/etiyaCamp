package kodlamaioCleanCode.ch10educationSale.business.abstracts;

import java.util.List;

import kodlamaioCleanCode.ch10educationSale.entities.concretes.Education;

public interface CampaignService {

	void updatePrice(List<Education> educations);
}
