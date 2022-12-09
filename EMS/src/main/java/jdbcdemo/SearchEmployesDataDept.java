package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbcdemo.entity.Employee;

public class SearchEmployesDataDept implements  EmployeeData{
	@Override
	public void getData(Employee emp, Connection conn) {
			List<Employee> employeeList = new ArrayList<Employee>();
			//int searchByID=Integer.parseInt(searchBy);
			
	    	try{
	    	PreparedStatement pstmt = conn.prepareStatement("select * from employees where department=(?)");
	    	pstmt.setString(1,emp.getDepartment());
	    	ResultSet rs = pstmt.executeQuery();
	    	
	    	while(rs.next()) {
	    		int id = rs.getInt("id");
	    		String first_name = rs.getString("first_name");
	    		String last_name = rs.getString("last_name");
	    		String email = rs.getString("email");
	    		String department = rs.getString(5);
	    		double sal = rs.getDouble(6);
	    		Employee e = new Employee();
	    		e.setId(id);
	    		e.setFirst_name(first_name);
	    		e.setLast_name(last_name);
	    		e.setEmail(email);
	    		e.setDepartment(department);
	    		e.setSalary(sal);
	    		employeeList.add(e);
	    		employeeList.stream().forEach(System.out::println);
	    	}
	    	}catch(Exception e) {
	    		System.out.println("Exception occurs: "+e.getMessage());
	    	}
	    	
	    }
	    
			
		}


