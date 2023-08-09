package Assignment4;

public class Employee {
	public void getEmployeeInfo(int id,String name) {
		System.out.println("employee id:"+id+"   employee name:"+name);
	}
	public void getEmployeeInfo(String email,long phoneNo) {
		System.out.println("employee Nmae:"+email+"  employee phoneNo");
	}
	
 public static void main(String[] args) {
		Employee emp=new Employee();
		emp.getEmployeeInfo(109,"Ananthi");
		emp.getEmployeeInfo("20g109ananthi@gmail.com",8667625781L);

	}

}
