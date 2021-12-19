package day36_Inheritance;


class Derived {
	
	public Derived(String temp) 
	{
		
	}
}

public class Test01 extends Derived {

	public Test01(String temp) 
	{
		super(temp);
		System.out.println("Test Class: " + temp);
	}
	
	public static void main(String[] args) {
		
		Test01 obj = new Test01("Tugba");
	}

}
