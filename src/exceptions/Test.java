package exceptions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Begining");
		
		try{
		int divide =10/0;
		System.out.println(divide);
		System.out.println("Ending error");

		
		} catch(Exception e)
		{
			System.out.println("error occured");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
