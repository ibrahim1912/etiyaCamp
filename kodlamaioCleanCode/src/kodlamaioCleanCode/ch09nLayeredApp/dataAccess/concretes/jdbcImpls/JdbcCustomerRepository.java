package kodlamaioCleanCode.ch09nLayeredApp.dataAccess.concretes.jdbcImpls;

import kodlamaioCleanCode.ch09nLayeredApp.dataAccess.abstracts.CustomerRepository;
import kodlamaioCleanCode.ch09nLayeredApp.entities.concretes.Customer;

public class JdbcCustomerRepository implements CustomerRepository {

	@Override
	public void add(Customer customer) {
		System.out.println("Jbdc kullanilarak veritabanina eklendi.");

	}

	@Override
	public boolean customerExists(Customer customer) {
		return true;
	}

}
