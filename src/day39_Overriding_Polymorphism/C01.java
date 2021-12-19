package day39_Overriding_Polymorphism;

public class C01 {


	public static void staticMethod() 
	{
		System.out.println("Parent class static method calisti.");
	}
	
	private void privateMethod() 
	{
		System.out.println("Parent class private method calisti.");
	}
	
	// final demek bu son hali bir daha degistirilemez demektir
	// dolayisiyla final olarak tanimlanan bir method override edilemez 
	public final void finalMethod() 
	{
		System.out.println("Parent class final method calisti.");
	}
}

	// child class ile parent class ayni package'da oldugundan 
	// methodlarin access methodlari public, protected veya default olsa idi hicbir sorun olmazdi

	//