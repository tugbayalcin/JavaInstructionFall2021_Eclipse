package day05_MatematikselIslemler;

import java.util.Scanner;

public class C05_Modulus {

	public static void main(String[] args) {
		
		// Kullanicidan 6 basamakli bir sayi alin ve rakamlar toplamini bulunuz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 6 basamakli bir sayi giriniz");
		int sayi = scan.nextInt();
		
		//1
		int rakamlarToplami = 0;
		int rakam = sayi%10; 
		rakamlarToplami += rakam;
		sayi/=10;
		
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
		
		//5
		rakam = sayi%10; 
		rakamlarToplami += rakam;
		sayi/=10;
						
		//6
		rakam = sayi%10; 
		rakamlarToplami += rakam;
		sayi/=10;
		
		System.out.println("Girdiginiz Sayinin Rakamlar Toplami: " + rakamlarToplami);
		scan.close();
		

	}

}
