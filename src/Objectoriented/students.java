package Objectoriented;

public class students {

	public students ()
	{
		System.out.println("calling constructor");
	}
	
	public students (String name,int age,int roll) // constructor with parameter can be used in selenium  Web driver constructor ,this can also be user for calling different constructor ex :shape
	

	{
		this.name=name;//refer to global variables 
		this.age=age;
		this.roll=roll;
		System.out.println("this is overloaded constructor");
	}
	
	String name;
	int roll;
	int age;
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
students s1=new students();
s1.age =20;
s1.name ="sharma";
s1.roll =1;

students s2=new students();
s2.age =20;
s2.name ="sharma";
s2.roll =1;

students s3=new students("raman",4,15);

//System.out.println(s3.name);
//System.out.println(s3.age);
//System.out.println(s3.roll);
	
	}

}
