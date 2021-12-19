package day07_IfStatementsQuestions;

import java.util.Scanner;

public class C05_Q05 {

	public static void main(String[] args) {
		
		// Q05: Kullanicidan bir gun alin ve eger gun "Cuma" ise ekrana "Muslumanlar icin kutsal gun" yazdirin.
		//      "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin.
		//      "Pazar" ise ekrana "Hristiyanlar icin kutsal gun" yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun adi giriniz: ");
		String gun = scan.next().toUpperCase();
		
		if(gun.equals("CUMA"))
		{
			System.out.println("Muslumanlar icin kutsal gun");
		}
		if(gun.equals("CUMARTESİ"))
		{
			System.out.println("Yahudiler icin kutsal gun");
		}
		if(gun.equals("PAZAR"))
		{
			System.out.println("Hristiyanlar icin kutsal gun");
		}
		
		scan.close();
		
		
	}

}
