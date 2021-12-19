package day15_MethodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		
		// Kullanicidan ismini ve soyismini isteyin
		// Iki farkli method olusturun
		// Methodlardan biri girilen kelimeleri, ilk harf buyuk digerleri kucuk olacak sekilde birlestirsin
		// Ikinci method isim ve soyismin ilk harfleri buyuk harf, kalan harfler * olacak sekilde birlestirsin
		
		// Kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihini sorun
		// Ve programin kalan kisminda isim ve soyismi kullanicinin istedigi sekilde kullanin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Isminizi Giriniz: ");
		String isim = scan.nextLine();
		
		System.out.println("Lutfen Soyisminizi Giriniz: ");
		String soyisim = scan.nextLine();
		
		System.out.println("Isminizin Gizlenmesini Istiyorsaniz 1'e"
				+ "\nIstemiyorsaniz 2'ye Basiniz.");
		
		int tercih = scan.nextInt();
		// bu satira kadar kullanicinin ismini, soyismini ve tercihini aldik
				
		String birlesmisIsim = null; // **ONEMLİ** burada null kullanimi guzel ve onemli, ben deger atamasi yapmis oldum
		
		if(tercih ==1) 
		{
			birlesmisIsim = gizliIsim(isim,soyisim);
		}
		else if (tercih ==2) 
		{
			birlesmisIsim = acikIsim(isim,soyisim);
		}
		else 
		{
			System.out.println("Lutfen Gecerli Bir Secim Giriniz: ");
		}
		
		// Bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli olarak kaydedildi, ama yazdirilmadi
		// cunku method icinde yazdirma satiri yok, return edilen degeri gormek istiyorsan yazdirmalisin
		
		System.out.println("Tercih Edilen Isim Formati: " + birlesmisIsim + " Seklindedir.");
		
		scan.close();
	}

	public static String gizliIsim(String isim, String soyisim) {
		
		isim = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w","*");
		soyisim = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w","*");
		
		return isim + " " + soyisim;
	}

	public static String acikIsim(String isim, String soyisim) {
		
		isim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		return isim + " " + soyisim;
		
	}

}
