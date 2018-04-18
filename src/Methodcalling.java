
public class Methodcalling {


	public  static void main(String[] args) 
	
	{
		Methodcalling m1= new Methodcalling();
		// TODO Auto-generated method stub
//		m1.go();
		m1.go1();
//		m1.go2();
		System.out.println("after calling go1 method");
	}

	
	public  void go()
	{	
		System.out.println("inside go method");

	go2();

		System.out.println("after calling go2 method");
	}

	public void go1()
	{
		System.out.println("inside go1 method");

		go();
		System.out.println("after calling go method");


	}
	
	public void go2()
	{
		
		System.out.println("in go2 method");
	}
	
}
