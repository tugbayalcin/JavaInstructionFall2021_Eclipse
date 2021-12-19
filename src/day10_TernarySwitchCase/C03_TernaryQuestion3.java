package day10_TernarySwitchCase;

import java.util.Scanner;

public class C03_TernaryQuestion3 {

	public static void main(String[] args) {
		
		// Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz: ");
		int sayi = scan.nextInt();
		
		int mutlak = (sayi<0) ? -sayi : sayi;
		System.out.println("Mutlak: " + mutlak);
		
		scan.close();

	}

}
