package Objectoriented;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department d =new Department();
		d.dept_id=10;
		d.dept_name="telecom";
		d.no_of_emp =400;
		d.add_dept();
		d.change_dept();
		
		System.out.println("Department id :" + d.dept_id);
		System.out.println("Department name :" + d.dept_name);
		System.out.println("Department number :" + d.no_of_emp);
	}

}
