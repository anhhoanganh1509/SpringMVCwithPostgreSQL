package stackjava.com.springmvcjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stackjava.com.springmvcjdbc.service.EmployeeService;


@Controller
public class CustomerController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String employees(Model model) {
		model.addAttribute("list", employeeService.findAll());
		return "employees";
	}
}
