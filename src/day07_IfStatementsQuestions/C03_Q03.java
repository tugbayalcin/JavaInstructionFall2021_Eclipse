package day07_IfStatementsQuestions;

import java.util.Scanner;

public class C03_Q03 {

	public static void main(String[] args) {
		
		// Q03:     Kullanicidan gun ismini alin ve haftaici veya haftasonu oldugunu yazdirin
		// Example: gun = Pazar   output = "Haftasonu"
		//			gun = Sali   output = "Haftaici"
		
		// Notes:   String icin equals methodunu kullanin
		
		// S03:
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun adi giriniz: ");
		String gun = scan.next().toLowerCase();
		
		if(gun.equals("pazar") || gun.equals("cumartesi")) 
		{
			System.out.println("Haftasonu");
		}
		if(gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) 
		{
			System.out.println("Haftaici");
		}
		
	    // yanlis girme ihtimmali ile ilgili if conditionu yazmiyoruz su anda, kafamiz karisabilir, daha sonra ogrenecegiz
		
		scan.close();
		
		// Stringler matematiksel islemler gibi karsilastirilamazlar, 
		// cunku non primitive ler == ile karsilastirilamazlar
		// Stringleri karsilastirabilmek icin ozel bir method kullanmaliyiz --> equals()

	} // main method sonu

} // class sonu
