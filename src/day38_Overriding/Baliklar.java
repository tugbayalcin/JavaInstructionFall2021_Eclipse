package day38_Overriding;

public class Baliklar extends Animals {

	public static void main(String[] args) {
		
		Baliklar balik1 = new Baliklar();
		
		balik1.beslenme(); // Tum Hayvanlar Beslenir
		balik1.hareket(); // Baliklar Yuzerek Hareket Eder
		balik1.solunum(); // Baliklar Solungaclariyla Nefes Alir 

	}
	
	// Overriding - Override Eden
	@Override
	// child classtaki bir method parent class'dan bir methodu override ediyorsa bunu istersek @Override notasyonu ile declare edebiliriz 
	// declare etmesek de kodlarimiz calisir ancak declare ettigimizde java Overriden methodu(parent class'daki method) surekli kontrol eder 
	// ve o methodda overriding'e uymayan bir degisiklik olursa cte verir
	public void hareket() 
	{
		System.out.println("Baliklar Yuzerek Hareket Eder");
	}
	
	
	
	public void solunum() 
	{
		System.out.println("Baliklar Solungaclariyla Nefes Alir ");
	}

}
