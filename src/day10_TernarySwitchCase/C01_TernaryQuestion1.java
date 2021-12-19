package day10_TernarySwitchCase;

import java.util.Scanner;

public class C01_TernaryQuestion1 {

	public static void main(String[] args) {
		
		// Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz: \n(Ilk sayiyi girdikten sonra enter'a basarak ikinci sayi girisini yapiniz)");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		double istenenSayi = (sayi1<sayi2) ? sayi1 : sayi2 ;
		System.out.println("Buyuk Olmayan Sayi: " + istenenSayi);
		
		scan.close();
	

	}

}
