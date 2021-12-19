package day05_MatematikselIslemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		
		// Kullanicidan 4 basamakli bir sayi alip rakamlar toplamini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		int sayi = scan.nextInt();
		
		//1
		int rakamlarToplami = 0;
		int rakam = sayi%10; 
		rakamlarToplami += rakam;
		sayi/=10;
		
		// bu islemi basamak sayisi kadar tekrar edersek rakamlar toplamini buluruz
		
		//2
		rakam = sayi%10; 
		rakamlarToplami += rakam;
		sayi/=10;
		
		//3
		rakam = sayi%10; 
		rakamlarToplami += rakam;
		sayi/=10;
		
		//4
		rakam = sayi%10; 
		rakamlarToplami += rakam;
		sayi/=10;
		
		System.out.println("Girdiginiz Sayinin Rakamlar Toplami: " + rakamlarToplami);
		scan.close();
	}

}
