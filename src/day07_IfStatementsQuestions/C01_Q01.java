package day07_IfStatementsQuestions;

import java.util.Scanner;

public class C01_Q01 {

	public static void main(String[] args) {
		
		// Q1: Kullanicidan bir tam sayi isteyin ve sayinin tek veya cift oldugunu yazdirin
		
		// S1:
				Scanner scan = new Scanner(System.in);
				System.out.println("Lutfen bir tam sayi giriniz");
				int sayi = scan.nextInt();
				
				if(sayi %2 == 0) 
				{
					System.out.println("Girdiginiz sayi cift sayidir");
				}
				if(sayi %2 == 1) 
				{
					System.out.println("Girdiginiz sayi tek sayidir");
				}
				
				scan.close();
				
		//  Peki benim kullanicim ondalikli yani double sayi girmeye kalkarsa ne olur
		//  Program hata verir mismatch der, cunku scanner integer bekliyor ancak double girildi
		// casting yaparsak olur mu bakalim:
		//  int sayi = (int)scan.nextInt();   --> olmadi. burada manuel narrowing yapamayiz, java kabul etmez 
		// zaten ondalikli sayinin ciftligi tekligi belirlenemez 
	}

}
