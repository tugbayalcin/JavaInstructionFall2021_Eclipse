package day11_StringManipulations;

public class C03_Length {

	public static void main(String[] args) {
		
		String str1 = "Ali Kahyaoglu";
		System.out.println(str1.length()); // 13
		
		// verilen str1 degiskeninin son harfini yazdirin
		System.out.println(str1.charAt(12)); // yazabilirim 
		// ancak eger ben daha sonradan str1 in tuttugu seyi degistirirsem Kahyaoglu yerine Kahya yazsam artik son harf 12. indexte olmayacak
		// yani dinamik bir yapi olmadi
		
		System.out.println(str1.charAt(str1.length()-1)); // boyle yazaresam stringi ne kadar degistirirsem degistireyim daima son harfi yazdiracak
		// dinamik bir yapi oldu
		
		String str2 = "";
		System.out.println(str2.length()); // 0
		
		String str3 = null;
		// System.out.println(str3.length()); // Null Point Exeption Error
		
		//String str4;
		System.out.println(str3); // null --> null degeri: bizim bu variablei bilerek olusturdugumuzu ve bilerek deger atamadigimizi belirtiyor
		//System.out.println(str4); // error --> Eger Stringi olusturur ama deger atamazsak yazdirdigimizda hata aliriz
		
		// bazen bir string ifade olusturmak isteyip daha sonra kullanmak isteyebilirim
		// bu degiskene deger atamayi unutup yazdirmaya kalksam veya bir islemde kullanmaya calissam hata alirim
		// ancak olustururken null atayip, kardesim ebn sana daha sonra deger atayacagim dersek ileride hata almayiz
		
		// null pointer: olusturdugumuz fakat sonra kullanacagimiz bir stringi isaretlemek icin kullanilir
		// Bir stringi yazdirdigimizda null cikiyorsa turkce olarak "ben bu degiskeni olusturdum ama henuz bir deger atamadim" demek istiyor
		// Eger Stringi olusturur ama deger atamazsak yazdirdigimizda hata aliriz
		

	}

}
