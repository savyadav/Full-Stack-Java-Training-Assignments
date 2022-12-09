package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


import jdbcdemo.entity.Employee;


public class App{

   

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    
  public static void main(String[] args) {
    	DatabaseController controller = new DatabaseController(new MySQLDatabase());
    	Connection conn=controller.connect();
        App app = new App();
        Employee employee=new Employee();
        InputProcessor inputFromuser =new  InputProcessor();
        
        System.out.println("welcome admin:");
        System.out.println("[ \n 1. add a new Employee,\n2. see all employee,\n 3. search an employee,"
        		+ "\n 4. delete an employee,\n 5. update an employee\n]");
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        switch(number)
        {
        case 1:
        	System.out.println("Enter new Employee form");
             employee=inputFromuser.inputEmployeeData();
            AddEmployeeData data= new AddEmployeeData();
            int rowsInserted=data.addEmployeeDetails(employee,conn);
            System.out.println("Row inserted"+rowsInserted);
            break;
        case 2:
        	
        	 EmployeeDataController.getData(new AllEmployeeData(),employee, conn);
        	 break;
        	 
        case 3://OpenClosedPrinciple
        	System.out.println("Search Employee Form:\r\n"
        			+ "[\r\n"
        			+ "1.Search By ID\r\n"
        			+ "2.Search By Dept\r\n"
        			+ "3.Search By FirstName\r\n"
        			+ "4.Search By LastName\r\n"
        			+ "] ");
         int option=scanner.nextInt();
     	String empsearch = null;
         
         if(option==1)
         {
        	 System.out.println("Enter Emp id for Search operation ");
       	     employee.setId(scanner.nextInt());
       	  EmployeeDataController.getData(new SearchEmployesDataID(),employee, conn);
         }
         else if(option==2)
         {
        	  System.out.println("Enter Emp Dept for Search operation ");
       	employee.setDepartment(scanner.next());
       	EmployeeDataController.getData(new SearchEmployesDataDept(),employee, conn);
         }
         else if(option==3)
         {
        	 System.out.println("Enter Emp First Name for Search operation ");
       	      employee.setFirst_name(scanner.next());
       	   EmployeeDataController.getData(new SearchEmployesDataName(),employee, conn);
         }
         else if(option==4)
         {
        	 
       	 System.out.println("Enter Emp Last Name for Search operation ");
       	employee.setLast_name(scanner.next());
       	EmployeeDataController.getData(new SearchEmployesDataLastName(),employee, conn);
         }
        
		 
       	 
         break;
       	 
        case 4:
        	System.out.println("Enter Emp id for delete operation ");
			int empID=scanner.nextInt();
			DeleteEmployeeData delemp=new DeleteEmployeeData();
			delemp.deleteEmployee(empID, conn);
			break;
			
        case 5:
			System.out.println("Enter Emp id for for updation");
			employee.setId(scanner.nextInt());
			System.out.println("Enter Emp first name for for updation");
			employee.setFirst_name(scanner.next());
			System.out.println("Enter Emp last name for for updation");
			employee.setLast_name(scanner.next());
			System.out.println("Enter Emp email for for updation");
			employee.setEmail(scanner.next());
			System.out.println("Enter Emp department for for updation");
			employee.setDepartment(scanner.next());
			System.out.println("Enter Emp salary for for updation");
			employee.setSalary(scanner.nextDouble());
			UpdateEmployeeData updateData=new UpdateEmployeeData();
			int updatedId = updateData.updateEmployee(employee.getId(), employee, conn);
			if (updatedId > 0) {
				System.out
						.println("The Employeedetails details updated successfully with Emp Id" + employee.getId());
			} else {
				System.out.println(
						"The Employeedetails details not updated successfully with Emp Id" + employee.getId());
			}
        default:
			System.out.println("Exit from the app");
		}

      
     
     
    
   
    }
}