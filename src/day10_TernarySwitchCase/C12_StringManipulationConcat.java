package day10_TernarySwitchCase;

public class C12_StringManipulationConcat {

	public static void main(String[] args) {
		
		// String olarak verilen bir degisken + isareti ile baska bir degiskenle isleem sokulursa
		// java bunlari yan yana ekler. Buna concatination denir
		
		String isim = "John";
		String soyisim = "Smith";
		
		System.out.println(isim + " " + soyisim); // John Smith
		
		// ayni silemi + sembolu yerine concat() methodu ile de yapabiliriz
		
		isim.concat(soyisim); // burasi bir sey ayzdirmaz, cunku yazdirma komutu yok
		System.out.println(isim.concat(soyisim)); // burada JohnSmith yazar
		
		// ben hem aralarinda bosluklu yazdirmak hem de bunu concat methodu ile yapmak istersem
		System.out.println(isim.concat(" ").concat(soyisim)); // John Smith
		
		// string methodlari arka arkaya istenildigi kadar kullanilabilir
		
		
	}

}
