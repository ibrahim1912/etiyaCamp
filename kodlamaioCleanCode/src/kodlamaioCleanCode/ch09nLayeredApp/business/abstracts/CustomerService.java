package kodlamaioCleanCode.ch09nLayeredApp.business.abstracts;

import kodlamaioCleanCode.ch09nLayeredApp.entities.concretes.Customer;

public interface CustomerService {

	void add(Customer customer) throws Exception;
}
