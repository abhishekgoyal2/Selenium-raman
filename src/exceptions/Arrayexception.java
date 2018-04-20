package exceptions;

public class Arrayexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
		int i[]=new int[4];
		i[5]=200;
	}
	catch(Exception e)
{
		System.out.println("error occured");
		System.out.println(e.getMessage());
		e.printStackTrace();
}
}
}
