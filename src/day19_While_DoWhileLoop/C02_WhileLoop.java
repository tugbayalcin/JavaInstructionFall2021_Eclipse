package day19_While_DoWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
		
		// Soru 7: Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Rakamlari Toplamini Bulmak Icin Pozitif Bir Tam Sayi Sayi Giriniz: ");
		int sayi = scan.nextInt();
		
		int rakamlarToplami = 0;
		int rakam =0;
		
		while(sayi>0) 
		{
			rakam = sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
		}
		System.out.println("Girilen Sayinin Rakamlar Toplami: " + rakamlarToplami);
		
		scan.close();
	}

}
