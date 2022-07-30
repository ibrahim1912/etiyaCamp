package kodlamaioCleanCode.ch10educationSale;

import kodlamaioCleanCode.ch10educationSale.business.abstracts.EducationService;
import kodlamaioCleanCode.ch10educationSale.business.concretes.EducationManager;
import kodlamaioCleanCode.ch10educationSale.business.concretes.StandardCampaignManager;
import kodlamaioCleanCode.ch10educationSale.dataAccess.concretes.hibernateImpls.HibernateEducationRepository;
import kodlamaioCleanCode.ch10educationSale.entities.concretes.Education;

public class Main {

	public static void main(String[] args) {
		
		Education education1 = new Education(1,"Java kursu",1000);
		Education education2 = new Education(2,"C# kursu",2000);
		Education education3 = new Education(3,"C++ kursu",100);
		
		EducationService educationService = new EducationManager(new HibernateEducationRepository(),
				new StandardCampaignManager());
		educationService.add(education1);
		educationService.add(education2);
		educationService.add(education3);

		System.out.println("Gercek fiyatlari:");
		for (Education education : educationService.getAll()) {
			System.out.println(education.getName() + " = " + education.getPrice());
		}
		
		System.out.println("--------------------");
		
		System.out.println("Kampanyali fiyatlari:");
		for (Education education : educationService.getAllWithCampaign()) {
			System.out.println(education.getName() + " = " + education.getPrice());
		}

		
	}
	

}
