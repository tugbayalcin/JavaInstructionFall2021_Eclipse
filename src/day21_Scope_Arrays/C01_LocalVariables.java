package day21_Scope_Arrays;

public class C01_LocalVariables {
	
	// butuuun her yerde kullanmak istedigim bir variable'im varsa onu class seviyesinde tanimlamaliyim
	// hatta static yapsam daha guzel olur
	String okulIsmi; 

	public static void main(String[] args) {
		
		// Java Local Variable'lara default deger atamasi yapmaz 
		// kodlarimizda sorun yasamamak icin olusturdugumuz local variable'lara uygun bir deger atamasi yapmamizda fayda vardir
		
		// int sayi; // cte verir
		int sayi = 0; // --> hata vermeyi kesecek
		System.out.println(sayi); // hata verir --> ustune gelince "The local variable sayi may not have been initialized" der
		// yani deger atamasi yapmamis olabilirin diyor
		
		// bir localde ayni isimde birden fazla variable OLUSTURULAMAZ
		// data turu farkli olsa bile java buna izin vermez
		
		@SuppressWarnings("unused")
		String isim = "Ali";
		
		

	}
	
	public static void staticMethod() 
	{
		// sayi; 
		// bir localde olusturulan variable methodlarin olup olmamasina bakmaksizin farkli local'de kullanilama.
		@SuppressWarnings("unused")
		String isim = "Veli"; // main methodda isim adindan bir variable olmasina ragmen burada da isim adinda bir avriable olusturabildik
		// cunku ikisinin de locali yani scope alani farkli oldugu icin olusturabiliyoruz, 
		// bunlar birbirlerini etkilemiyorlar ve herhangi bir baglantilari yok
		
		
	}

}
