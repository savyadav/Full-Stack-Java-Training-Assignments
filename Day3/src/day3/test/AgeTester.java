package day3.test;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day3.Age;

public class AgeTester {
	@Test    
	public void validateVoterAgeValidTest() throws Exception {
		   
		    Age age = new Age();
	        boolean expectedResult = true;
	        LocalDate birthday = LocalDate.of(1991, Month.FEBRUARY, 11);
		    Period result =age.calculate(birthday);
		    Assertions.assertNotNull(result);
		   
	    }
	@Test    
	public void validateVoterAgeInValidTest() throws Exception {
		   
		    Age age = new Age();
		   LocalDate birthday = LocalDate.of(1991, Month.FEBRUARY, 13);
		    Period result =age.calculate(birthday);
		    if(result.getMonths()>=13)
		    Assertions.assertThrows(Exception.class, () -> age.calculate(birthday).getMonths());
		   
	    }
	
	

}
