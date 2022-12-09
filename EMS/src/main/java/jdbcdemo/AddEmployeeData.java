package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbcdemo.entity.Employee;

public class AddEmployeeData {
public int addEmployeeDetails(Employee employee,Connection conn) {
    	
    	int rowsInserted = 0;
    	try{
    	
    	String insertSqlQuery="INSERT INTO EMPLOYEES(ID,FIRST_NAME,LAST_NAME,EMAIL,DEPARTMENT,SALARY) "
        			+ "values(?,?,?,?,?,?)";	
    		
    	PreparedStatement pstmt  = conn.prepareStatement(insertSqlQuery);
    	pstmt.setInt(1,employee.getId());
    	pstmt.setString(2,employee.getFirst_name());
    	pstmt.setString(3,employee.getLast_name());
    	pstmt.setString(4,employee.getEmail());
    	pstmt.setString(5,employee.getDepartment());
    	pstmt.setDouble(6,employee.getSalary());
    	rowsInserted = pstmt.executeUpdate();
    	
    	if(rowsInserted>0) {
    		System.out.println("a new employee got added successfully");
    	}
    	}catch(SQLException ex) {
    		System.out.println("Error occured with cause : "+ex.getMessage());
    	}
    	return rowsInserted;
    }

}
