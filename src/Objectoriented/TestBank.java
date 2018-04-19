package Objectoriented;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b1=new Bank();
		b1.name="HSBC";
		Bank.accountbalance=500;
		Bank.interestgained(300);
		
	
		System.out.println(b1.accountbalance);
		System.out.println(b1.name);
//		System.out.println(b1.interestgained(increment));
		
		Members m=new Members();
		m.add="203 -secondstreet Chandigarh";
		m.name="Agupta";
		
		b1.mem=m;
		System.out.println(b1.mem.add);
		System.out.println(b1.mem.name);
	
		Bank b2=new Bank();
		b2.name="HDFC";
		//calling second members -through passing members object to Bank object as Members is a data type in a Bank Class
		b2.mem =new Members();
		b2.mem.add ="204 -secondstreet Chandigarh";
		
		b2.mem.name ="VkSharma";
	
		System.out.println(b2.mem.add);
		System.out.println(b2.mem.name);
		
	}

	
}
