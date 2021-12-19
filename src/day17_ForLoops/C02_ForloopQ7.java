package day17_ForLoops;

import java.util.Scanner;

public class C02_ForloopQ7 {

	public static void main(String[] args) {
		
		// Interview Question
		// Soru 7: Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak istediginiz yazi dizisini giriniz: ");
		String str = scan.nextLine();
		
		// Kullanici sunu yazmis olsun : cekoslavakyalilastiramadiklarimizdanmisiniz
		
		for (int i =str.length()-1; i>=0; i--) 
		{
			System.out.print(str.substring(i,i+1)); // direk i yazinca ascii yazdiriyor, i==0 deyinde calismiyor?
		}
		
		
		scan.close();
		
	}

}
