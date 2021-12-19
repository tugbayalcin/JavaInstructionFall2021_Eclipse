package day13_StringManipulations3;

import java.util.Scanner;

public class C01_StartWith_EndWith {

	public static void main(String[] args) {
		
		// Kullanicidan bir cumle ve bir char sequence alin
		// verilen cumlenin verilen kelime ile baslayip baslamadigini
		// ve bitip bitmedigini kontrol edin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz: ");
		String cumle = scan.nextLine();
		System.out.println("Lutfen bir char sequance giriniz: ");
		String kelime = scan.next();
		
		// hocanin yaptigi --------------------------------------------------------------------
		
		if(cumle.startsWith(kelime)) 
		{
			System.out.println("Girilen cumle: " + kelime + " ile basliyor.");
		}
		else 
		{
			System.out.println("Girilen cumle: " + kelime + " ile baslamiyor.");
		}
		
		
		if(cumle.endsWith(kelime)) 
		{
			System.out.println("Girilen cumle: " + kelime + " ile bitiyor.");
		}
		else 
		{
			System.out.println("Girilen cumle: " + kelime + " ile bitmiyor.");
		}
		// benim yaptigim -------------------------------------------------------------------
		 
		System.out.println("");
		System.out.print("Girilen cumle girilen kelime ile basliyor mu: ");
		System.out.println(cumle.startsWith(kelime));
		
		
		System.out.print("Girilen cumle girilen kelime ile bittiyor mu: ");
		System.out.println(cumle.endsWith(kelime));
		
		scan.close();
		

	}

}
