
public class Loops_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		
//		do
//		{
//			System.out.println("number is :" +i);
//			i++;
//
//	}
//		while(i<10);
		
//		while (i<10)
//		{
//			System.out.println("number is :" +i);
//			i++;
//		}
		
//		for (i=1;i<10;i++)
//		{
//			System.out.println("number is :" +i);
//			
//		}
		
		for (int table =1;table<=10;table++)
		{
			System.out.println("table of --->" + " " + table + " ");
			
			for (i=1;i<=10;i++)
			{
				System.out.println("table of --->" + table   + "*" + i + "= " +table*i);

			}
			
			if(table==5)
				break;
		}
		int post=1;
		System.out.println(post++);
		
	System.out.println(post);
		
		int pre=1;
System.out.println(++pre);
		
		System.out.println(pre);

}
	
}
