package stackjava.com.springmvcjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import stackjava.com.springmvcjdbc.dao.EmployeeDao;
import stackjava.com.springmvcjdbc.entities.Employee;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDAO;
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}
}
