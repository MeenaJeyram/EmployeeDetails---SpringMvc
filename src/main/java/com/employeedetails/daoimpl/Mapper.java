package com.employeedetails.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.employeedetails.model.EmployeeDetails;

public class Mapper implements RowMapper<EmployeeDetails>
{
	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		
		EmployeeDetails employee = new EmployeeDetails();
		employee.setEmpName(rs.getString("emp_name"));
		employee.setEmpCode(rs.getString("emp_code"));
		employee.setEmail(rs.getString("email"));
		employee.setAddress1(rs.getString("address1"));
		employee.setAddress2(rs.getString("address2"));
		employee.setCity(rs.getString("city"));
		employee.setState(rs.getString("state"));
		employee.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
		employee.setJoiningDate(rs.getDate("joining_date").toLocalDate());
		return employee;
	}
}
