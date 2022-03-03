package com.employeedetails.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class SpringMvcDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer
{	
	@Override
    protected String[] getServletMappings() {
        return new String[] {
            "/"
      };
    }
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class <?> [] getServletConfigClasses() {
	     return new Class[] {
	     MvcConfiguration.class
	   };
    }	 
}
