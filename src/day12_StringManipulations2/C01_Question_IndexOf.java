package day12_StringManipulations2;

import java.util.Scanner;

public class C01_Question_IndexOf {

	public static void main(String[] args) {
		
		// Kullanicidan bir cumle ve bir harf isteyin
		// harfin cumlede var olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz:");
		
		String cumle = scan.nextLine();
		System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz:");
		char krk = scan.next().charAt(0); // burasi kullanicidan aldigim harf
		
		// mantik su: eger aradigimiz harf cumlede var ise insexOf() bize indeksi dondurur, yoksa -1 dondurur
		
		int index = cumle.indexOf(krk); // aldigimiz harfin cumle icindeki ilk indeksi
		
		if(index < 0) // yani index -1 ise 
		{
			System.out.println("Gidiginiz harf verilen cumlede yok");
		}
		else 
		{
			System.out.println("Gidiginiz harf verilen cumlede var");
		}
		
		scan.close();
		

	}

}
