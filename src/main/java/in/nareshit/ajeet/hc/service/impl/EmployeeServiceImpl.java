package in.nareshit.ajeet.hc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.ajeet.hc.entity.Employee;
import in.nareshit.ajeet.hc.repo.EmployeeRepository;
import in.nareshit.ajeet.hc.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Integer saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
	employee  = repo.save(employee);
		return employee.getId();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> list = repo.findAll();
		return list;
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> opt = repo.findById(id);
		if(opt.isPresent()) {
			Employee e=opt.get();
			return e;
		}
	//todo :else Throw Excepetion Employee Not Found	
		return null;
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		repo.save(e);
	}

}
