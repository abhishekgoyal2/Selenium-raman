package Objectoriented;

public class DepartmentInterface implements Employee{
	
//	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e =new DepartmentInterface();
		e.department();
		e.salary();
		e.hrpolicy();
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.print("prints employee salary");
	}

	@Override
	public void department() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emplname() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hrpolicy() {
		// TODO Auto-generated method stub
		System.out.print("Hr policy applies");
	}

}
