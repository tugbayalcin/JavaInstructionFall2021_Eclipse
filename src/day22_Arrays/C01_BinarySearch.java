package day22_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		
		String isimler[] = { "Hacer", "ainagul", "Emine", "Murat", "Kutlu"};
		
		// Isimler arrayinde Murat ismi var mi?
		
		// Array'de arama yapmadan once siralama yapmaliyiz
		//	soru1: siralama neye gore yapildi
		//	soru2: atama yapmadigimiz halde sort yaptiktan sonra degisiklik kalici oldu mu
		
		Arrays.sort(isimler);
		// Arrays class'i ile sort yaptigimizda arrayimiz kalici olarak degisir
		System.out.println(Arrays.toString(isimler)); // [Ainagul, Emine, Hacer, Kutlu, Murat]
		// sort methodu elemanlari natural order'a gore siralar (ascii'ye gore ve dogal siralamada)
		// ascide buyuk harfin kodu kucuk harfin kodundan once gelir
		
		isimler[4] = "Ainagul";
		System.out.println(Arrays.toString(isimler)); // [Emine, Hacer, Kutlu, Murat, Ainagul] sort kullanmadigimiz icin istedigimiz seyi vermedi
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler)); // [Ainagul, Emine, Hacer, Kutlu, Murat]
		
		System.out.println(Arrays.binarySearch(isimler, "Murat")); // 4
		
		System.out.println(Arrays.binarySearch(isimler, "Mehmet")); // -5
		
		System.out.println(Arrays.binarySearch(isimler, "Tugba")); // -6
		
		System.out.println(Arrays.binarySearch(isimler, "Kursat")); // -4
		
		// Aranilan eleman var ise index, yok ise sira numarasinin negatifini dondurur (sira numaralari 1'den baslar)
		
		
		// 

	}

}
