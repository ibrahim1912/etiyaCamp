package kodlamaioCleanCode.ch09nLayeredApp.business.concretes;

import java.util.List;

import kodlamaioCleanCode.ch09nLayeredApp.business.abstracts.EmployeeService;
import kodlamaioCleanCode.ch09nLayeredApp.dataAccess.abstracts.EmployeeRepository;
import kodlamaioCleanCode.ch09nLayeredApp.entities.concretes.Employee;

public class EmployeeManager implements EmployeeService{

	EmployeeRepository employeeRepository;
	
	public EmployeeManager(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	
	@Override
	public List<Employee> getAll() {
		return employeeRepository.getAll();
	}

	
}
