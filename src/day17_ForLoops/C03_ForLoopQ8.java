package day17_ForLoops;

import java.util.Scanner;

public class C03_ForLoopQ8 {

	public static void main(String[] args) {
		
		// Interview Question 
		// Soru 8: Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak istediginiz yazi dizisini giriniz: ");
		String str = scan.nextLine();

		tersineCevir(str);
		System.out.println(tersineCevir(str));
		
		scan.close();

	}
	public static String tersineCevir(String str) 
	{	
		// ters kelime icin yepyeni bir kelime olusturalim
		String ters = "";  // ilk once ters kelimeyi hiclik olarak tanimladik, sirayla elemanlari alip ekleyecegiz
			
		for(int i=str.length()-1; i>=0; i--) 
		{
			ters +=str.substring(i,i+1); // += ile her elemani sona ekliyoruz
		}
	
		return ters;
	} 

}
