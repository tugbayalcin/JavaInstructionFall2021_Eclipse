package day36_Inheritance;

import day35_Encapsulation_Inheritance.Isci;

public class Ustabasi extends Isci{
	
	Ustabasi() 
	{
		System.out.println("Ustabasi parametresiz constructor calisti");
	}

	public static void main(String[] args) {
		
		Ustabasi ust1 = new Ustabasi();
		
		// java'da her class olusturuldugunda otomatik olarak default constructor olustugu gibi
		// child class'da olusturulan her bir constructor'in ilk satirinda gizli super() constructor olusturulur

	}

}
