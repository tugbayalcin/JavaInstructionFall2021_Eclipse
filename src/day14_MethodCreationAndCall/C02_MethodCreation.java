package day14_MethodCreationAndCall;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		
		// kullanicidan iki sayi isteyin
		// sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
		// kullaniciya us sorun
		// 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamin yazan method calissin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz \n(Ilk sayiyi girdikten sonra entera basarak ikinci sayiyi giriniz)");
		
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		// kareTopla(sayi1, sayi2); --> burasi method call'dur. Method olustururken kullandik
		// kupTopla(sayi1,sayi2);  --> ama sonradan burada durmasina gerek yok. kullanmayacaksak silerbiliriz.
		
		System.out.println("Girilen Sayialrin Kareler Toplamini Istiyorsaniz 2'ye"
				+ "\nKupler Toplamini istiyorsaniz 3'e Basiniz.");
		int secim = scan.nextInt();
		
		switch(secim) 
		{
		case 2:
			kareTopla(sayi1,sayi2);
			break;
		case 3:
			kupTopla(sayi1,sayi2);
			break;
		default:
			System.out.println("Lutfen gecerli bir secim giriniz: ");
		}
		
		/* 	             REQUIREMENT
		 * Bir methodu 4 adimda olustururuz:
		 * Adim 1: Methodu javaya olusturtabilmek icin method call yapariz
		 * Adim 2: Arguman ihtiyaci var mi belirleriz
		 * Adim 3: Javadan ayrdim alarak methodu olustururuz
		 * Adim 4: Access modifier ve return type'a karar veririz
		 * Bundan sonra methodun yapacagi isleri gerceklestirecek kodlari yazariz
		 * 
		 * yazdirma varsa void kullanabilirsin, yazdirma yok ise dondurme yapman lazim, return type yapman lazim
		 */
		scan.close();
				
	}

	public static void kupTopla(double sayi1, double sayi2) {
		double kuplerToplami = sayi1*sayi1*sayi1 + sayi2*sayi2*sayi2;
		System.out.println("Girilen Sayilarin Kupleri Toplami = " + kuplerToplami);
		
	}

	public static void kareTopla(double sayi3, double sayi4) {
		
		// bizim arguman isimlerimiz ile parametre siimlerimiz ayni olmak zorunda degildir
		// java isimlere degil degerlere bakar
		// bu bir zorunluluk degil imkandir, istedigimizi tercih edebiliriz
		
		double karelerToplami = sayi3*sayi3 + sayi4*sayi4 ;
		System.out.println("Girilen Sayilarin Kareleri Toplami = " + karelerToplami);
		
	}

}
