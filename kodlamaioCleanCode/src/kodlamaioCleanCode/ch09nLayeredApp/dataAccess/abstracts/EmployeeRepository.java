package kodlamaioCleanCode.ch09nLayeredApp.dataAccess.abstracts;

import java.util.List;

import kodlamaioCleanCode.ch09nLayeredApp.entities.concretes.Employee;

public interface EmployeeRepository {

	List<Employee> getAll();
}
