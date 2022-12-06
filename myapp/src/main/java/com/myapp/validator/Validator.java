package com.myapp.validator;

import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.logging.LogFactory;

import com.myapp.dto.Employee;

public class Validator {
	
	public void validate(Employee employee) throws Exception {
		try {
			if(employee.getName()==null || employee.getName().isBlank())
				throw new Exception(new Configurations().properties("configuration.properties").getProperty("Validator.INVALID_EMPLOYEE_NAME").toString());
			if( employee.getId()<1000)
				throw new Exception(new Configurations().properties("configuration.properties").getProperty("Validator.INVALID_EMPLOYEE_ID").toString());
		}
		catch(Exception exception) {
			LogFactory.getLog(this.getClass()).error(exception.getMessage(), exception);
			throw exception;
		}
	}
	
}