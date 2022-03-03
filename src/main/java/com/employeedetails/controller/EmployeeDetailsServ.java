package com.employeedetails.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.employeedetails.handler.EmployeeDetailsHandler;
import com.employeedetails.model.EmployeeDetails;

@Controller
public class EmployeeDetailsServ 
{
	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException 
	{
		return new ModelAndView("employeeDetails");
	}
	
	@RequestMapping(value = "/EmployeeRegisterServ")
    public ModelAndView test1(HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
          EmployeeDetailsHandler employee = new EmployeeDetailsHandler();
          int i = employee.employeeRegisterHandler(request); 
          if(i == 1)
          {
              return new ModelAndView("searchEmployee");
          }
          else 
          {
              HttpSession session = request.getSession();
              session.setAttribute("add", "Not Inserted");
              return new ModelAndView("employeeDetails");
          }
	}
	
	@RequestMapping(value = "/EmployeeList")
    public String getList(ModelMap empList) 
	{
            EmployeeDetailsHandler empHandler = new EmployeeDetailsHandler();
            List<EmployeeDetails> list = empHandler.listDetails();
            empList.addAttribute("employeeList",list);
            return ("employeeList");
    }
}
