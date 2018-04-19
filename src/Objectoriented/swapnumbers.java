package Objectoriented;

public class swapnumbers {

	int s;
	int t;
	
	public static void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		

	}
	
	public static void swap(swapnumbers p)//pass by reference 
	{
		
		int temp=p.s;
		p.s=p.t;
		p.t=temp;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapnumbers sw =new swapnumbers();
		sw.s=0;
		sw.t=40;
		swap(sw);
		System.out.println("Pass by reference swap numbers " + sw.s);
		System.out.println("Pass by reference numbers " + sw.t);


	}

}
