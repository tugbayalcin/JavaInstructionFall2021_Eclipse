package day13_StringManipulations3;

import java.util.Scanner;

public class C02_Replace {

	public static void main(String[] args) {
		
		// String olarak verilen 10.000 (on bin) sayisinin 1000'den (bin) buyuk olup olmadigini yazdirin
		// (java nokta gorunce bunu double 10 olarak algilar)
		
		//(amazonda java diye arattin ve cikan sonuc sayisinin 1000'den az veya cok olup olmadigina bakmak istiyoruz
		
		String sonuc = "10.000";
		
		Scanner scan = new Scanner(System.in);
		scan.close();
		
		// once noktadan kurtulmaliyiz
		sonuc = sonuc.replace(".", ""); // atama yapildigi icin kalici degisiklik oldu
		// birden fazla .(nokta) olsa idi hepsinden kurtulacakti
		sonuc = sonuc.replace("3", ""); // hata vermez, ama degisikli,k yapacak bir sey de bulamaz
		
		
		if(Integer.valueOf(sonuc) > 1000) // Integer.valueOf() ile string degiskeni integera cevirdik		
		{
			System.out.println("Bulunan Sonuc Sayisi 1000'den coktur.");
		}
		else 
		{
			System.out.println("Bulunan Sonuc Sayisi 1000'den azdir.");
		}
		
		
		

	}

}
