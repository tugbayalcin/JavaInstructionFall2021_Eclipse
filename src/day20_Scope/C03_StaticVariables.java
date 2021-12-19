package day20_Scope;

public class C03_StaticVariables {

	static int no=20;
	static int sayi;
	
	static String adres = "Ankara";
	static String cadde;
	
	static boolean aktifMi = true;
	static boolean tatildeMi;
	
	// static variable okul adi gibidir, yapilan degisiklik herkesi etkiler 
	// class variable da denir, cunku her yere erisilebilir, ve her yerden erisilebilirler
	
	
	public static void main(String[] args) {
		
		// static variable'lara main methodda direkt ulasilabilir mi --> EVET
		// cunku main method da ststic club uyesi ;)
		
		System.out.println(no); // 20
		no++;
		System.out.println(no); // 21
		staticMethod(); // direkt ulastim 
		
		System.out.println(no); // 22
		
		C03_StaticVariables obje = new C03_StaticVariables();
        obje.staticOlmayanMethod();
        System.out.println(no);// 23
		
	
	}
	
	public static void staticMethod() 
	{
		// static variable'lara static methodda direkt ulasilabilir mi --> EVET
		no++;
		System.out.println("static method'da sayi: "+no);
		
	}
	
	public void staticOlmayanMethod()
	{
		// static variable'lara static olan ya da olmayan her turlu methoddan ulasilabilir
		// bu yuzden static variable'lara class variable denir
		
		 no++;
	     System.out.println("static olmayan method'da sayi : " + no);
		
		
		
		
	}
}
