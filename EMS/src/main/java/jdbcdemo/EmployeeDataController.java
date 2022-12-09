package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbcdemo.entity.Employee;

public class EmployeeDataController {

	
	public EmployeeDataController(AllEmployeeData allEmployeeData) {
		// TODO Auto-generated constructor stub
	}

	public static void getData(EmployeeData empd,Employee emp,Connection conn) {
		empd.getData(emp,conn);
 }

	
	

}
