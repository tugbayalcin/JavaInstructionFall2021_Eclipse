package day10_TernarySwitchCase;

import java.util.Locale;

public class C14_UpperCaseLoweCase {

	public static void main(String[] args) {
		
		// verilen stringin tamamini buyuk veya kucuk ahrfe cevirir
		
		String isim = "aLI";
		
		// Bunu Ali olarak yazdiralim
		System.out.println("" + isim.toUpperCase().charAt(0) + isim.toLowerCase().charAt(1) + isim.toLowerCase().charAt(2)); // 478 yazdirdi
		// basina hiclik koyduk ki charlarla matematiksel islem yapmasin
		
		
		// Local olanlar yerel ayar yapar. Turkiye'de baska, Avrupa'da baska, America'da baska ayarlar olabilir
		
		// turkce local harfler kullanarak  tamamini kucuk harfe cevirelim
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr"))); // bu methodlar pek sik kullanilmaz ama yine de aklinin bir kosesinde dursun

	}

}
