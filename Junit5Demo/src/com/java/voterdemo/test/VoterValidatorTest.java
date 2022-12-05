package com.java.voterdemo.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.java.voterdemo.VoterValidator;

public class VoterValidatorTest {
	
	@Test    
	public void validateVoterAgeValidTest() throws Exception {
		    int age = 19;
		    VoterValidator voterValidator = new VoterValidator();
	        boolean expectedResult = true;
		    boolean result = voterValidator.validateVoterAge(age);
		    Assertions.assertTrue(result);
	    }
	@Test    
	public void validateVoterAgeInvalidTest() throws Exception {
		    int age = 10;
		    VoterValidator voterValidator = new VoterValidator();
	        boolean expectedResult = false;
		    boolean result = voterValidator.validateVoterAge(age);
		    Assertions.assertFalse(result);
	    }
	
	@Test
	public void validateVoterAgeInvalidTest2() throws Exception {
		int age = -14;
		VoterValidator voterValidator = new VoterValidator();
		
		Exception exception = Assertions.assertThrows(Exception.class, () -> voterValidator.validateVoterAge(age));
	}

	@ParameterizedTest
	@CsvSource(value = {"19, true","20,true","17,false","16,false"})
	public void validateVoterAgeTestParameter(int age, boolean expected) throws Exception {
		VoterValidator voterValidator = new VoterValidator();
		boolean actual = voterValidator.validateVoterAge(age);
		Assertions.assertEquals(expected, actual);
	}


}