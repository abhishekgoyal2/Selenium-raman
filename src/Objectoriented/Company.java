package Objectoriented;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department d =new Department();
		Department d1 =new Department();
		Department.compname="google" ;
		Department.holiday();
		
		d.dept_id=10;
		d.dept_name="telecom";
		d.no_of_emp =400;
		d.add_dept();
		d.change_dept();
		
		d1.dept_id=10;
		d1.dept_name="telecom";
		d1.no_of_emp =400;
		d1.add_dept();
		d1.change_dept();
		
		System.out.println("Department id :" + d.dept_id);
		System.out.println("Department name :" + d.dept_name);
		System.out.println("Department number :" + d.no_of_emp);
		
		System.out.println("for dep2 " );
		
		System.out.println("Department id :" + d1.dept_id);
		System.out.println("Department name :" + d1.dept_name);
		System.out.println("Department number :" + d1.no_of_emp);
	}

}
