package day3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Age {
public Period calculate(LocalDate birthday)
{
	LocalDate today = LocalDate.now();
	Period p = Period.between(birthday, today);
	return p;
}
	public static void main(String[] args) {
	Age age=new Age();
	LocalDate birthday = LocalDate.of(1991, Month.FEBRUARY, 11); // Birth date
	Period p=age.calculate(birthday); 
     System.out.println("You are "+p.getYears()+" years,"+p.getMonths()+" months and "+p.getDays()+" days old.");   

	}

}
