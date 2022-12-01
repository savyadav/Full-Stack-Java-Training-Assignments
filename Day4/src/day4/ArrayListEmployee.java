package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ArrayListEmployee {
	
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		     list.add(new Employee(1,"sam",20000));
		     list.add(new Employee(2,"amy",30000));
		     list.add(new Employee(3,"wil",10000));
		     list.add(new Employee(4,"cat",15000));
		     list.add(new Employee(1,"sam",12000));
		     list.add(new Employee(2,"amy",40000));
		     Comparator<Employee> compareByName = (Employee o1, Employee o2) -> o1.getEmpName().compareTo( o2.getEmpName() );
		     Collections.sort(list, compareByName);
		    //Collections.sort(list);
		    list.stream().forEach(System.out::println);
		    list.stream().map(l->l.getEmpName().toUpperCase()).forEach(System.out::println);
		OptionalDouble average=    list.stream().map(l->l.getSalary()).mapToDouble(s->s).average();
		System.out.println("average of salary="+average);
		   // list.stream().sorted( (i1, i2) -> i2.compare(i1,i2)).collect(Collectors.toList()).forEach(System.out::println);

	}

}
