package day31_DateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {
		
		LocalTime saat = LocalTime.now();
		
		System.out.println(saat); // 23:03:46.024 --> Saat-dakika-saniye-salise yazdi
		
		int sayi=10;
		
		System.out.println("Baslangic Saati: " + saat);
		for(int i=0; i<10000; i++) 
		{
			sayi++;
		}
		System.out.println("Bitis Saati: " + saat);
		
		
		// bu sekilde yaparsak baslangic ve bitis saati ayni cikar
		// Bunun sebebi saat tee ustte bir kere zaten olustu ve digerlerinde de onu yazdiriyor
		// Eger ben bir kiyas yapacak isem bir saat objesi olusturmam gerekir 

		System.out.println();
		// integer icin bakalim ---------------------------------------------------------
		
		LocalTime saatBaslangic = LocalTime.now();
		System.out.println("Baslangic Saati: " + saatBaslangic);
		for(int i=0; i<100; i++) 
		{
			sayi++;
		}
		LocalTime saatBitis = LocalTime.now();
		System.out.println("Bitis Saati: " + saatBitis);

		double nano1 = saatBaslangic.getNano();
		double nano2 = saatBitis.getNano();
		
		System.out.println("int For Loop " + (nano2-nano1) + " nano saniyede tamamlandi.");
		System.out.println();
		
		// string icin bakalim ---------------------------------------------------------
		
		String str = "Asel";
		
		LocalTime saatBaslangicStr = LocalTime.now();
		System.out.println("Baslangic Saati: " + saatBaslangicStr);
		for(int i=0; i<100; i++) 
		{
			str += " ";
		}
		LocalTime saatBitisStr = LocalTime.now();
		System.out.println("Bitis Saati: " + saatBitisStr);
		
		double nano3 = saatBaslangicStr.getNano();
		double nano4 = saatBitisStr.getNano();
		
		System.out.println("String For Loop " + (nano4-nano3) + " nano saniyede tamamlandi.");
		
		
		double stringSure = nano4-nano3;
		double intSure = nano2-nano1;
		
		System.out.println("int String'den " + (stringSure-intSure) + " nano saniye daha hizli bitirdi.");
		
		
		System.out.println(saat.getMinute()); // 28
		System.out.println(saat.plusMinutes(10000)); // 
		System.out.println(saat.minusHours(20)); 
		
		LocalTime yerelSaat = LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(yerelSaat);
		
		
	}

}
