
public class IFElseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= (int)(Math.random()*20);
		System.out.println(num);

		if(num>10)
		{
			System.out.println("number is greater than 10");

		}
		
		else if(num<10 && num>5)
		{
			System.out.println("number is between 5 and 10");
		}
		
		else if(num==10)
		{
			System.out.println("number is eqaul to 10");
		}
		
		
		else 
		{
			System.out.println("number is lesser than 10");
		}
	}

}
