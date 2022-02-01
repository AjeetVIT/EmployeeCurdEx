package in.nareshit.ajeet.hc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.ajeet.hc.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
