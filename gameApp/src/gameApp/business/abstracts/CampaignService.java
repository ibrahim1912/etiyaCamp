package gameApp.business.abstracts;

import java.util.List;

import gameApp.entities.concretes.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	
	List<Campaign> getAll();
}
