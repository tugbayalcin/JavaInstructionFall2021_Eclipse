package Day43_Interface;

public abstract class C01_AbstractClass {
	
	// Abstract Class'lardan obje olusturulamaz
	// peki o zaman bu class'in constructor'i var midir
	
	// vardir
	// cunku abstract class'lar class olduklari icin ve java her class olustugunda ona bir default constructpr hediye ettigi icin
	// onun da constructor'i vardir ancak abstract class'lardan obje OLUSTURULAMAZ 
	// interface'in constructor'i yoktur, adi bile class degil zaten, ona class demeyiz basli basina farkli bir yapidir, interface'dir 
	
	C01_AbstractClass(){} // default constructor yerine olusturdugumuz parametresiz constructor
	
	public abstract void method();

}
