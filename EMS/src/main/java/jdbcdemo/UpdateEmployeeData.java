package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import jdbcdemo.entity.Employee;
//Single responsibilty princple
public class UpdateEmployeeData {
	 public int updateEmployee(int id,Employee employee,Connection conn) {
	    	
 	
 		String updateSql = "update employees set first_name=?,last_name=?,email=?,department=?,salary=? where id=?";
 		int rowsUpdated=0;
 		try {
				PreparedStatement pstmt = conn.prepareStatement(updateSql );
				pstmt.setString(1,employee.getFirst_name() );
				pstmt.setString(2, employee.getLast_name());
				pstmt.setString(3,employee.getEmail());
				pstmt.setString(4,employee.getDepartment());
				pstmt.setDouble(5,employee.getSalary());
				rowsUpdated = pstmt.executeUpdate();
				if(rowsUpdated>0) {
					employee.setId(id);
					
					
				}
			} catch (SQLException e) {
				System.out.println("Exception occurs in deleting Company");
			}
 		return rowsUpdated;

 }

}
