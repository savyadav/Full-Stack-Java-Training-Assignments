package day4;

public class Employee  {
	private int empId;
	private String empName;
	private int salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	Employee(int EmpId,String empName,int salary)
	{
		 this.empId = EmpId;
         this.empName = empName;
         this.salary=salary;
	}
	 @Override
	    public String toString() {
	           return "Employee[empId=" + empId + ", name=" + empName +", salary="+salary +"] ";
	    }
	public Object compare(Employee i1,Employee i2) {
		 return i2.compare(i1, i2);
	}
	

}
