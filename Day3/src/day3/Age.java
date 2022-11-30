package day3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Age {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
	LocalDate birthday = LocalDate.of(1991, Month.FEBRUARY, 11); // Birth date
       Period p = Period.between(birthday, today);
       System.out.println("You are "+p.getYears()+" years,"+p.getMonths()+" months and "+p.getDays()+" days old.");   

	}

}
