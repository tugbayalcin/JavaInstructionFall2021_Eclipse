package day08_IfElseStatement;

import java.util.Scanner;

public class C01_IfElseQuestion1 {

	public static void main(String[] args) {
		
		// Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin bir kenar uuznlugunu giriniz: ");
		double kenar1 = scan.nextDouble();
		System.out.println("Lutfen dikdortgenin diger kenar uuznlugunu giriniz: ");
		double kenar2 = scan.nextDouble();
		
		if(kenar1==kenar2) 
		{
			System.out.println("Girilen dikdortgen bir karedir");
		}
		else 
		{
			System.out.println("Girilen dikdortgen bir kare degildir");
		}
		
		scan.close();
		
		// if-else statement birbirine baglidir, ya bir sonucu ya da diger sonucu calismak zorundadir,
		// bu sonuclar ayni anda calismazlar
	

	}

}
