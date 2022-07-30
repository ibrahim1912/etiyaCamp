package kodlamaioCleanCode.ch09nLayeredApp.dataAccess.abstracts;

import kodlamaioCleanCode.ch09nLayeredApp.entities.concretes.Customer;

public interface CustomerRepository {

	/**
	 * <h1>Müşteri ekleme operasyonu</h1>
	 * @param customer
	 */
	void add(Customer customer);

	boolean customerExists(Customer customer);
}
