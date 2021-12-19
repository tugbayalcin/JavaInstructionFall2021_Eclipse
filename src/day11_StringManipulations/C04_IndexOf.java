package day11_StringManipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		
		// parametre olarak girilen bir char veya stringin ILK indexini verir
		
		String str = "Calisirssaniz, Java ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s')); // 4
		System.out.println(str.indexOf("J")); // 14
		
		int index = str.indexOf("r"); // indexOf() methodu bize her zaman int bir deger dondurur
		System.out.println(index); // 6 
		
		// Peki olmayan bir harfin indeksi ne olur?
		System.out.println(str.indexOf('q')); // -1 --> buna biz karar veremiyoruz, javanin default final degerlerinden biri
		// bize integer deger dondurse bunu biz index olarak algilariz, 
		// null donse null bir integer degil
		
		// Bir string icinde olmayan bir karakter veya kelime ararsak java -1 sonucunu dondurur
		
		System.out.println(str.indexOf('A')); // -1 --> case sensitive'den dolayi
		      
		System.out.println(str.indexOf("Java")); // 14 --> Basladigi indexi bize verir
		
		System.out.println(str.indexOf('a',11)); // 11. indexten sonra aramaya baslar ve buldugu ilk a nin indeksini dondurur 
		
		System.out.println(str.indexOf("va og"));  // 16
		// aradigimiz charSquence anlamli veya anlamsiz bir kelime olabilir
		// bu durumda java aradigimiz charSquence'i tek bir paket gibi dusunur ve o paketin baslangic indexini bize dondurur
		
		
		

	}

}
