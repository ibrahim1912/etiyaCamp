package kodlamaioCleanCode.ch09nLayeredApp.business.abstracts;

import java.util.List;

import kodlamaioCleanCode.ch09nLayeredApp.entities.concretes.Employee;

public interface EmployeeService {

	List<Employee> getAll();
}
