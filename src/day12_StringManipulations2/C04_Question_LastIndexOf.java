package day12_StringManipulations2;

import java.util.Scanner;

public class C04_Question_LastIndexOf {

	public static void main(String[] args) {
		
		// Kullanicidan bir cumle ve bir harf isteyin
		// harfin cumlede var olup olmadigini yazdirin
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz:");
				
		String cumle = scan.nextLine();
		System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz:");
		char krk = scan.next().charAt(0); // burasi kullanicidan aldigim harf
		
		int index = cumle.lastIndexOf(krk);
		
		if(index == (-1)) 
		{
			System.out.println("Harf cumlede kullanilmamis");
		}
		else 
		{
			System.out.println("Harf cumlede kullanilmis");
		}
		scan.close();

	}

}
