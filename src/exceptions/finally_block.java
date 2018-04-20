package exceptions;

public class finally_block {
	
	public  final int display()
	{
		System.out.println("final method 1 with no parameter ");
		return 0;
	}
	
	public  final int display(int i)
	{
		
		System.out.println("final method 2 with  parameter ");//overlaoding possible with final but not overiding
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finally_block fb =new finally_block();
	fb.display();
	fb.display(4);
		
		try{
			//DB connection
			//excecuting some code 
			//validation the data
			
			int i[]=new int[4];
			i[5]=200;
		} catch(Exception e)
		{
			System.out.println("error occured ");
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		finally
		{
			System.out.println("Data base connection closed in final block");
		}
	}

}
