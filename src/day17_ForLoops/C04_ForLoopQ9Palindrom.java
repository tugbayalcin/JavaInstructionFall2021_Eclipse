package day17_ForLoops;

import java.util.Scanner;

public class C04_ForLoopQ9Palindrom {

	public static void main(String[] args) {
		
		// Interview Question 
		// Soru 9: Kullanicidan bir String isteyin. Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak istediginiz yazi dizisini giriniz: ");
		String str = scan.nextLine();
		
		if(str.equals(tersineCevir(str))) 
		{
			System.out.println("Girdiginiz String Palindromdur.");
		}
		else 
		{
			System.out.println("Girdiginiz String Palindrom Degildir.");
		}
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
