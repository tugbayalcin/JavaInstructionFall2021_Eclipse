package day19_While_DoWhileLoop;

import java.util.Scanner;

public class C03_ForLoopIleCozum {

	public static void main(String[] args) {
		
		// ayni soruyu bir de for loop ile cozelim
		// Soru: : Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Rakamlari Toplamini Bulmak Icin Pozitif Bir Tam Sayi Sayi Giriniz: ");
		int sayi = scan.nextInt();
		
		int rakamlarToplami = 0;
		int rakam =0;
		
		String sayiStr = ""+sayi; // integer sayimi stringe cevirmek icin basina "" ekleyerek concat yapiyorum
		// sayiStr.length() bize basamak sayisini verir 
		
		// integer olarak verilen bir sayinin basamak sayisini bulmak istersek kisa yoldan o sayiyi stringe cevirip
		// str.length() methodunu kullanabiliriz
		
		for(int i=0; i<=sayiStr.length(); i++)  // length methodu string class methodudur. stringler disinda kimse kullanamaz
		{
			rakam = sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
		}
		System.out.println("GirilenSayinin Rakamlar Toplami: " + rakamlarToplami);

		scan.close();
	}

}
