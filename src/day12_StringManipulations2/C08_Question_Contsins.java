package day12_StringManipulations2;

import java.util.Scanner;

public class C08_Question_Contsins {

	public static void main(String[] args) {
		
		//  Kullanicidan bir cumle isteyin. 
		// Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak, 
		// “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin, 
		// iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
		// iki kelimeyi de iceriyorsa "kucuk mu buyuk mu karar ver" yazdir
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine();
		
		if(cumle.contains("buyuk")) 
		{
			System.out.println(cumle.toUpperCase());
		}
		else if (cumle.contains("kucuk")) 
		{
			System.out.println(cumle.toLowerCase());
		}
		else if(cumle.contains("kucuk") && cumle.contains("buyuk")) // bu kosulun en basta olmasi gerekirdi
		{
			System.out.println("Kucuk mu buyuk mu karar ver"); // burada buyuk harfle yazacak, cunku java yukaridan asagiya calisiyor, 
		}
		else 
		{
			System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor.");
		}
		
		//----------------------- hem onu duzeltelim hem de biraz fantazi yapip hepsini kucuk harfe cevirerek cumleyi alalim
		
		
		String cumle2 = cumle.toLowerCase();
		
		if(cumle2.contains("kucuk") && cumle2.contains("buyuk")) 
		{
			System.out.println("Kucuk mu buyuk mu karar ver");
		}
		else if (cumle2.contains("kucuk")) 
		{
			System.out.println(cumle2.toLowerCase());
		}
		else if(cumle2.contains("buyuk")) 
		{
			System.out.println(cumle2.toUpperCase());
		}
		else 
		{
			System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor.");
		}
		scan.close();
		
		// 
		
		
		
		

	}

}
