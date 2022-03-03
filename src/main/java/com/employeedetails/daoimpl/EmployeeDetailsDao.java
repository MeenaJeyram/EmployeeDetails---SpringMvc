package com.employeedetails.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.employeedetails.config.MvcConfiguration;
import com.employeedetails.model.EmployeeDetails;

public class EmployeeDetailsDao 
{
	@Autowired
    private JdbcTemplate jdbcTemplate;

    public  EmployeeDetailsDao() 
    {
    		MvcConfiguration mvcConfig = new MvcConfiguration();
            jdbcTemplate = new JdbcTemplate(mvcConfig.getDataSource());
    }
    
    
    public int insertEmployees(final EmployeeDetails employee) 
    {
      return jdbcTemplate.update("insert into employeeDetails(emp_name, emp_code, email, address1, address2, city, state, date_of_birth, joining_date) values(?,?,?,?,?,?,?,?,?)",
              new Object[] { employee.getEmpName(), employee.getEmpCode(),employee.getEmail(),employee.getAddress1(), employee.getAddress2(),employee.getCity(),employee.getState(),java.sql.Date.valueOf(employee.getDateOfBirth()),java.sql.Date.valueOf(employee.getJoiningDate())});
    }
    
    public List<EmployeeDetails> getEmployeeDetail() {
        
        List<EmployeeDetails> employee = jdbcTemplate.query("select  emp_name,emp_code,email,address1,address2,city,state,date_of_birth,joining_date from employeeDetails", new Mapper());
        return employee;
    }
}
