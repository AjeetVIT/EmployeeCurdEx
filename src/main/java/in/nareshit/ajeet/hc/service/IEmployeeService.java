package in.nareshit.ajeet.hc.service;

import java.util.List;

import in.nareshit.ajeet.hc.entity.Employee;

public interface IEmployeeService {
	Integer saveEmployee(Employee employee);
	List<Employee>getAllEmployees();
	void deleteEmployee(Integer id);
	Employee getOneEmployee(Integer id);
	//void updateEmployee();
	void updateEmployee(Employee e);
	

}
