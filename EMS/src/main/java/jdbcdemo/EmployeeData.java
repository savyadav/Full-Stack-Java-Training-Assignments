package jdbcdemo;

import java.sql.Connection;
import java.util.List;

import jdbcdemo.entity.Employee;
//OpenClosedPrinciple
public interface EmployeeData {
 public void getData(Employee emp,Connection conn);
 
}
