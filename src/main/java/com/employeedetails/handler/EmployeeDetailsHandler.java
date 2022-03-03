package com.employeedetails.handler;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import com.employeedetails.daoimpl.EmployeeDetailsDao;
import com.employeedetails.model.EmployeeDetails;

public class EmployeeDetailsHandler 
{
	public int employeeRegisterHandler(HttpServletRequest request) {
		
		String empname = request.getParameter("empname");
		String empcode = request.getParameter("empcode");
		String emailid = request.getParameter("email");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		LocalDate dob = LocalDate.parse(request.getParameter("dob"));
		LocalDate doj = LocalDate.parse(request.getParameter("doj"));
	
		EmployeeDetails employee = new EmployeeDetails(empname, empcode, emailid, address1, address2, city, state, dob, doj);
		
		EmployeeDetailsDao employeedetails = new EmployeeDetailsDao();
		
		int i = employeedetails.insertEmployees(employee);
		return i;
	} 
	
	public List<EmployeeDetails> listDetails() 
	{
		EmployeeDetailsDao employee = new EmployeeDetailsDao();
		List<EmployeeDetails> list = employee.getEmployeeDetail();
     	return list;
	}
}
