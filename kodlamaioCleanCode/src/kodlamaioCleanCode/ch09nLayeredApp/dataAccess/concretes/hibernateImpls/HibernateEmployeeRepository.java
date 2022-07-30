package kodlamaioCleanCode.ch09nLayeredApp.dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;
import java.util.List;

import kodlamaioCleanCode.ch09nLayeredApp.dataAccess.abstracts.EmployeeRepository;
import kodlamaioCleanCode.ch09nLayeredApp.entities.concretes.Employee;

public class HibernateEmployeeRepository implements EmployeeRepository {

	@Override
	public List<Employee> getAll() {
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setFirstName("ibo");
		employee1.setSalary(300);
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setFirstName("ibo2");
		employee2.setSalary(3300);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		
		return employees;
		
		
		
	}

}
