package day08_IfElseStatement;

import java.util.Scanner;

public class C02_IfElseQuestion2 {

	public static void main(String[] args) {
		
		//  Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin
		
		// Solution: Hemmen ascii tablosunu ac, A-Z(65-90) ve a-z(97-122) araligina bak
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz: ");
		char karakter = scan.next().charAt(0);
		
		if((karakter >= 'A' && karakter <= 'Z' )|| (karakter >= 'a' && karakter <= 'z') ) 
		{
			System.out.println("Girdiginiz " + karakter + " bir harftir");
		}
		else 
		{
			System.out.println("Girdiginiz " + karakter + " bir harf degildir");
		}
		
		scan.close();
		
		// burada toLowerCase veya toUpperCase kullansa idik sonucu sout icerisinde kullaniciya gosterirken onun girdigi degeri kullanamzdik
		// yanlis gostermis olurduk
		// eger kullaniciya gosterme gibi bir kaygimiz veya ihtiyacimiz yoksa, yalnizca biz bilecek isek kullanabiliriz
		
		// NOTE: 'A' < karakter < 'a' gibi bir ifade matematikte mumkundur ancaj javada mumkun degildir
		// bir statementta iki karsilastirma ayni anda bu sekilde kullanilamaz, parcalanmali ve && isareti iel baglanmalidir
		

	}

}
