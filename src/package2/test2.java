package package2;

import package1.test1;

public class test2 extends test1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
test1 default1=new test1();

test2 obtest2=new test2();
System.out.println(obtest2.add(2, 4));//object of subclass can call protected members (variable,methods) using object of subclass in different package which is not possible with default modifiers
		
	}

}
