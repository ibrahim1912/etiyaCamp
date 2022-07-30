package kodlamaioCleanCode.ch10educationSale.dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;
import java.util.List;

import kodlamaioCleanCode.ch10educationSale.dataAccess.abstracts.EducationRepository;
import kodlamaioCleanCode.ch10educationSale.entities.concretes.Education;

public class HibernateEducationRepository implements EducationRepository{

	List<Education> educations;
	public HibernateEducationRepository() {
		educations = new ArrayList<Education>();
	}
	@Override
	public void add(Education education) {
		educations.add(education);
		
	}
	@Override
	public List<Education> getAll() {
		return educations;
	}
	

}
