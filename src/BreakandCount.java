
public class BreakandCount {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
BreakandCount b =new BreakandCount() ;

for(int i=0;i<10;i++)
{
	
	if(i>=6)
		continue;

	if(i<7)

	break;
	System.out.println(i);
	
}
b.go();
}
	public void go()
	{
		System.out.println("First");
//		break();
		System.out.println("Last");
	}

}
