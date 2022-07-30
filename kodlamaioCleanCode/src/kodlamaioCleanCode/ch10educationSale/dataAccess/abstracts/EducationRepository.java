package kodlamaioCleanCode.ch10educationSale.dataAccess.abstracts;

import java.util.List;

import kodlamaioCleanCode.ch10educationSale.entities.concretes.Education;

public interface EducationRepository {

	void add(Education education);
	List<Education> getAll();
}
