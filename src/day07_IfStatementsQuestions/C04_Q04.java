package day07_IfStatementsQuestions;

import java.util.Scanner;

public class C04_Q04 {

	public static void main(String[] args) {
		
		// Q04: Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin
		
		// S04: 
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu giriniz: ");
		double kenar1 = scan.nextDouble();
		
		System.out.println("Lutfen dikdortgenin diger kenar uzunlugunu giriniz: ");
		double kenar2 = scan.nextDouble();
		
		// degiskenler double iken integer girmemiz sorun olmaz,  ama integer iken double girmek sorun olurdu
		
		if(kenar1 == kenar2) 
		{
			System.out.println("Girilen dikdortgen bir karedir");
		}

		if(kenar1 != kenar2) 
		{
			System.out.println("Girilen dikdortgen bir kare degildir");
		}
		
		scan.close();
		
		// burada ne yazik ki kullanici negatif deger de girince kare cikabiliyor, bunu duzeltmek icin ekstra kontroller yazabilirsin ;)
	}

}
