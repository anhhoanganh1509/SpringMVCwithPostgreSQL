package stackjava.com.springmvcjdbc.entities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		e.setId(rs.getInt("id"));
		e.setFullName(rs.getString("fullName"));
		e.setAddress(rs.getString("address"));
		e.setEmail(rs.getString("email"));
		e.setPhone(rs.getString("phone"));
		e.setSalary(rs.getInt("salary"));
		return e;
	}
}
