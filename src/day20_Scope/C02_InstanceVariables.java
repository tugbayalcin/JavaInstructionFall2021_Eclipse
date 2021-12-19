package day20_Scope;

public class C02_InstanceVariables {

	String adres = "Ankara";
	String dogumYeri;
	
	double notOrtalamasi;
	double yasOrtalamasi = 12.3;
	
	char cinsiyet = 'E';
	char karakter;
	
	boolean ogrenciMi = true;
	boolean izinliMi;
	
	
	public static void main(String[] args) {
		
	    // instance variable'lara main methoddan direkt olarak ulasilabilir mi? --> HAYIR
		// Peki nasil ulasilabilir --> Obje olusturarark
		
		C02_InstanceVariables boru = new C02_InstanceVariables();
		System.out.println(boru.adres); // Ankara ( instance variable, class icinde deger atanmadi ise, olusturuldugu zamanki deger var ise onu yazayim dicek
		System.out.println(boru.dogumYeri); // null ( instance variable, ne class iicnde ne de olusturuldugu yerde deger atanmis, java defaultu atanir
		
		System.out.println(boru.notOrtalamasi); // 0.0
		System.out.println(boru.yasOrtalamasi); // 12.3
		
		System.out.println(boru.cinsiyet); // E
		System.out.println(boru.karakter); // space yazdiracak (bosluk)
		
		System.out.println(boru.ogrenciMi); // true
		System.out.println(boru.izinliMi); // false
		
		

	}
	
	public static void staticMethod() 
	{
		
	}
	
	public void staticOlmayanMethod() 
	{
		
	}

}
