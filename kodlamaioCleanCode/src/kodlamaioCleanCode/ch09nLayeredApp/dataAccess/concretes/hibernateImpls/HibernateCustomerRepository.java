package kodlamaioCleanCode.ch09nLayeredApp.dataAccess.concretes.hibernateImpls;

import kodlamaioCleanCode.ch09nLayeredApp.dataAccess.abstracts.CustomerRepository;
import kodlamaioCleanCode.ch09nLayeredApp.entities.concretes.Customer;

public class HibernateCustomerRepository implements CustomerRepository{
	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate kullanilarak veritabanina eklendi.");

	}

	@Override
	public boolean customerExists(Customer customer) {
		return true;
	}
}
