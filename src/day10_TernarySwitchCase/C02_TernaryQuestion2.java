package day10_TernarySwitchCase;

import java.util.Scanner;

public class C02_TernaryQuestion2 {

	public static void main(String[] args) {
		
		// Kullanicidan bir tam syai alin ve sayinin tek veya cift oldugunu yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz: ");
		int sayi = scan.nextInt();
		
		String sonuc = (sayi%2 == 0) ? "Sayi Cifttir" : "Sayi Tektir";
		System.out.println("Sonuc: " + sonuc);
		
		scan.close();

	}

}
