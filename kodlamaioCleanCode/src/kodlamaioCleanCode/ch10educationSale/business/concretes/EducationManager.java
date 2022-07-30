package kodlamaioCleanCode.ch10educationSale.business.concretes;

import java.util.List;

import kodlamaioCleanCode.ch10educationSale.business.abstracts.CampaignService;
import kodlamaioCleanCode.ch10educationSale.business.abstracts.EducationService;
import kodlamaioCleanCode.ch10educationSale.dataAccess.abstracts.EducationRepository;
import kodlamaioCleanCode.ch10educationSale.entities.concretes.Education;

public class EducationManager implements EducationService {

	EducationRepository educationRespository;
	CampaignService campaignService;

	public EducationManager(EducationRepository educationRespository,CampaignService campaignService) {
		this.educationRespository = educationRespository;
		this.campaignService = campaignService;
	}

	@Override
	public void add(Education education) {
		educationRespository.add(education);

	}

	@Override
	public List<Education> getAllWithCampaign() {
		List<Education> educations = educationRespository.getAll();
		campaignService.updatePrice(educations);
		return educations;
	}

	@Override
	public List<Education> getAll() {
		return educationRespository.getAll();
	}


}
