package Objectoriented;

public class Bank {


	String name;
	static int accountbalance;
	Members mem;

	public static int interestgained(int increment)
	{
		accountbalance =accountbalance+increment;
		
		return increment;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


}
}