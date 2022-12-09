package jdbcdemo;

import java.util.Scanner;

import jdbcdemo.entity.Employee;

public class InputProcessor {

	public static Employee inputEmployeeData() {
		
		// ask the user for any input
		Scanner scanner = new Scanner(System.in);
		
		// get the given values
		System.out.println("Enter the ID ");
		int ID = scanner.nextInt();
		
		System.out.println("Enter the first Name ");
		String first_name = scanner.nextLine();
		
		System.out.println("Enter the last Name: ");
		String last_name = scanner.nextLine();
		System.out.println("Enter the email: ");
		String email = scanner.nextLine();
		System.out.println("Enter the department: ");
		String department = scanner.nextLine();
		System.out.println("Enter the salary: ");
		double salary = scanner.nextInt();
		
		
		
		
		// container for the value pair
		Employee employee = new Employee(ID,first_name,last_name,email,department,salary);
		
		scanner.close();
		
		return employee;
	}
}