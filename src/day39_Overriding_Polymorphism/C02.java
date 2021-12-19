package day39_Overriding_Polymorphism;

public class C02 extends C01{

	public static void main(String[] args) {
		
		C02 obj1 = new C02();
		
		obj1.privateMethod(); // Child class private method calisti.
		obj1.staticMethod(); // Child class static method calisti.
		
		C01 obj2 = new C02();
		
		// obj2.privateMethod(); CTE, erisemiyorum bile 
		// data turu C01 oldugundan oncelikle C01 classindaki method'a bakmamiz gerekir
		// ancak private oldugundan ulasamayiz 
		// ulasamadigimiz bir methodu override yapamayiz
		// dolayisiyla signature ayni olmasina ragmen bu ikisi farkli iki method olarak calisir 
		obj1.staticMethod();
		// static methodlar override edilemez 
		// dolayisiyla signature ayni olmasina ragmen bu ikisi farkli iki method olarak calisir 

	}
	
	public static void staticMethod() 
	{
		System.out.println("Child class static method calisti.");
	}
	// @Override yazamiyorum, ben override edilemem diyor 
	private void privateMethod() 
	{
		System.out.println("Child class private method calisti.");
	}
	
	/* final demek bu son hali bir daha degistirilemez demektir
	   dolayisiyla final olarak tanimlanan bir method override edilemez 
	
	public final void finalMethod() 
	{
		System.out.println("Child class final method calisti.");
	}
	*/

}
