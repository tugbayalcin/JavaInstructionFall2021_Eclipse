package day12_StringManipulations2;

import java.util.Scanner;

public class C02_Question_IndexOf {

	public static void main(String[] args) {
		
		// Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		// - Girilen kelime cumlede kullanilmamis.
		// - Girilen kelime cumlede 1 kere kullanilmis.
		// - Girilen kelime cumlede 1’den fazla kullanilmis.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz:");
		
		String cumle = scan.nextLine();
		System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz:");
		String kelime = scan.next(); // burasi kullanicidan aldigim kelime
		
		int index = cumle.indexOf(kelime);
		if(index<0) // ==-1 de diyebiliriz, ayni seyi verir
		{
			System.out.println("Girilen kelime cumlede kullanilmamis.");
		}
		else if(cumle.indexOf(kelime,index+1)== -1) // bir oncekinin kelimeyi buldugu yerden sonrasina bakiyoruz ve kelimeyi ariyoruz, 
		{ //  +1 yazdik cunku index direk kendi indeksini verecekti,onun zaten var oldugunu biliyoruz, 
			System.out.println("Girilen kelime cumlede 1 kere kullanilmamis."); // ondan baska aradigimiz icin bir sonraki indexten devam ediyoruz
		}
		else 
		{
			System.out.println("Girilen kelime cumlede 1'den fazla kullanilmamis.");
		}
		scan.close();

	}

}
