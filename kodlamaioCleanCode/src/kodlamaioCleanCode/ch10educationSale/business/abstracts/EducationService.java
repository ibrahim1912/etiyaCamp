package kodlamaioCleanCode.ch10educationSale.business.abstracts;

import java.util.List;

import kodlamaioCleanCode.ch10educationSale.entities.concretes.Education;

public interface EducationService {

	void add(Education education);
	List<Education> getAll();
	List<Education> getAllWithCampaign();
}
