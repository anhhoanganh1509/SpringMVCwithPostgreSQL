package stackjava.com.springmvcjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import stackjava.com.springmvcjdbc.entities.Employee;
import stackjava.com.springmvcjdbc.entities.EmployeeMapper;

@Repository
@Transactional
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Employee> findAll() {
		String sql = "SELECT * FROM EMPLOYEES";
		return jdbcTemplate.query(sql, new EmployeeMapper());
	}
}
