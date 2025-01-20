package in.nareshit.ajeet.hc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.nareshit.ajeet.hc.entity.Employee;
import in.nareshit.ajeet.hc.service.IEmployeeService;
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
	@GetMapping("/register")
	public String showRegister() {
		return "EmployeeRegister";
	}
	/*
	 * On form Submitt, read data as Object using as ModelAttribute
	 * call Service  layer Object by Useing Pk
	 */
	@PostMapping("/save")
public String saveEmployee(@ModelAttribute Employee employee,Model model) {
		System.out.println(model.getClass().getname());
		Integer id = service.saveEmployee(employee);
		String message="Employee'"+id+"'Created";
		model.addAttribute("message", message);
	return "EmployeeRegister";
}
	@GetMapping("/all")
	public String viewAllEmployees(Model model) {
		List<Employee> list = service.getAllEmployees();
		model.addAttribute("list", list);
		return "EmployeeData";
		
	}
	/*
	 * Read id From Request URL
	 * Call Service for Delete
	 * Get Latest Data
	 * Create Success Message
	 * Send Data to UI Useing Model
	 * Return Back to EmployeeData.html page*/
	@GetMapping("/delete")
	public String DeleteEmployee(
			@RequestParam Integer id,Model model) {
		//Call Service 
		service.deleteEmployee(id);
		//one Success Message Employee Deleted
		String message="Employee'"+id+"'Deleted";
		model.addAttribute(message, message);
		//get latest Data
		List<Employee> list = service.getAllEmployees();
	 model.addAttribute("list", list);
		return "EmployeeData";
	}
	/*Show Edit
*/
	//sending data back to ui is Model
	@GetMapping("/edit")
	public String showEmployeeEdit(
			@RequestParam Integer id,Model model) {
		//load Object From db
		Employee emp = service.getOneEmployee(id);
		//send Object data to ui
		model.addAttribute("employee", emp);
		//return to view Page
		return "EmployeeEdit";
	}
	/**
	 * do update
	 * Read FormData From Edit Page
	 * Call Service 
	 * Redirect getBack To All*/
	@PostMapping("/update")
	public String UpdateEmployee(@ModelAttribute Employee employee) {
		service.updateEmployee(employee);
		return"redirect:all";
	}
<<<<<<< Updated upstream
	//task-321
	public void m2(){
		//logic
	String name ="Ajeet";
	String inst="ashokit";
	//logic
	}
=======
	//public void m1(){
	int i=10;
int j=20;
>>>>>>> Stashed changes
}

