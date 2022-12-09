package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//Single responsibilty princple
public class DeleteEmployeeData {
	public void deleteEmployee(int employeeID,Connection conn) {
    
    	String deleteSql = "delete from employees where id=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(deleteSql );
			pstmt.setInt(1, employeeID);
			int rowsDeleted  = pstmt.executeUpdate();
			if(rowsDeleted>0) {
				System.out.println("The Employee details deleted for EmpId " + employeeID);
				
			}
			else
				System.out.println("The Employee details not found for EmpId " + employeeID);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
    	
    }

}
