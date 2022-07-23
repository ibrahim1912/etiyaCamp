
package gameApp.business.concretes;

import java.util.ArrayList;
import java.util.List;

import gameApp.business.abstracts.CampaignService;
import gameApp.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	private List<Campaign> campaigns;
	
	public CampaignManager() {
		campaigns = new ArrayList<Campaign>(); 
	}
	@Override
	public void add(Campaign campaign) {
		campaigns.add(campaign);
		System.out.println(campaign.getName() + " : Kampanya eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " : Kampanya silindi");
		
	}

	@Override
	public List<Campaign> getAll() {
		return campaigns;
	}

}
