package day15_MethodCreation;

public class C02_MethodOverloading {

	public static void main(String[] args) {
		
		// Javada ayni isimde birden fazla method olur mu?
		// Cevap: Evet olur.
		
		// Ayni isimde birden fazla method olursa Java hangisini calistiracagina nasil karar verir?
		// Cevap: Isimi ayni olan methodlarda oncelikle parametre sayisina bakar
		// Ardindan parametre sayisi ile arguman sayisi esit olanlardan arguman data turleri ile parametre data turleri arasindaki uyuma bakar
		// tamamen uyusan varsa onu kullanir
		// tamamen uyusan yoksa, kapsayan var mi bakar ve onu kullanir
		// birden fazla secenek oldugunda java her zaman en optimum olani secer 
		
		// overloading olmasi icin methodlarin isimlerinin ayni olmasi ve temelde ayni isi yapmasi gerekir
		int sayi1=4;
		int sayi2=5;
		int sayi3=10;
		int sayi4=20;
		
		topla(sayi1,sayi2);
		topla(sayi1,sayi2,sayi3); // burada yazilan arguman
		topla(sayi1,sayi2,sayi3,sayi4);
		
		// java arguman ve parametrelerle bunlarin uyumuna bakarak ayni isimli methodlardan hangisini cagiracagina karar verir
		
		topla(2,4); // hangisi calisir? --> int-int olan calisti, int-int methodu olmasa idi 
		
		

	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("Dort Sayinin Toplami: " + sayi1+sayi2+sayi3+sayi4);
		
	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println("Uc Sayinin Toplami: " + sayi1+sayi2+sayi3);
		
	}

	private static void topla(int sayi1, int sayi2) { // burada yazilan parametre
		System.out.println("Iki Sayinin Toplami int-int: " + sayi1+sayi2);
		
	}
	@SuppressWarnings("unused")
	private static void topla(double sayi1, double sayi2) { // burada yazilan parametre
		System.out.println("Iki Sayinin Toplami double-double: " + sayi1+sayi2);
	}
	
	@SuppressWarnings("unused")
	private static void topla(double sayi1, int sayi2) { // burada yazilan parametre
		System.out.println("Iki Sayinin Toplami double-int: " + sayi1+sayi2);
	}
	
	@SuppressWarnings("unused")
	private static void topla(int sayi1, double sayi2) { // burada yazilan parametre
		System.out.println("Iki Sayinin Toplami int-double: " + sayi1+sayi2);
	}

}
