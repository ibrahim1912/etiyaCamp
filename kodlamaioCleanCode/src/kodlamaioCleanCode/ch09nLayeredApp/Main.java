package kodlamaioCleanCode.ch09nLayeredApp;

import java.util.List;

import kodlamaioCleanCode.ch09nLayeredApp.business.abstracts.CustomerService;
import kodlamaioCleanCode.ch09nLayeredApp.business.abstracts.EmployeeService;
import kodlamaioCleanCode.ch09nLayeredApp.business.concretes.CustomerManager;
import kodlamaioCleanCode.ch09nLayeredApp.business.concretes.EmployeeManager;
import kodlamaioCleanCode.ch09nLayeredApp.core.adapters.KpsServiceAdapter;
import kodlamaioCleanCode.ch09nLayeredApp.dataAccess.concretes.hibernateImpls.HibernateCustomerRepository;
import kodlamaioCleanCode.ch09nLayeredApp.dataAccess.concretes.hibernateImpls.HibernateEmployeeRepository;
import kodlamaioCleanCode.ch09nLayeredApp.entities.concretes.Customer;
import kodlamaioCleanCode.ch09nLayeredApp.entities.concretes.Employee;

public class Main {

	public static void main(String[] args) throws Exception {

		//customerDemo();
		
		employeeDemo();
	
		

	}

	private static void employeeDemo() {
		EmployeeService employeeService = new EmployeeManager(new HibernateEmployeeRepository());
		List<Employee> result = employeeService.getAll();
		for (Employee employee : result) {
			System.out.println(employee.getFirstName());
		}
	}
	
	private static void customerDemo() throws Exception {
		CustomerService customerService = new CustomerManager(new HibernateCustomerRepository(),
				new KpsServiceAdapter());
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("ibo");
		customer1.setLastName("k");
		customer1.setCreditCardNumber("23221");
		customerService.add(customer1);
	}

}
