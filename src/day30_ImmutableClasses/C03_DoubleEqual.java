package day30_ImmutableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {
		
		// NOTE: Java'da String 2 turlu olusturulabilir: 
		
		// 1) Non-Primitive oldugu icin new keyword'u ile
		// Bu durumda java once esitligin sagina bakiyordu, new keywordunu goruyor
		// yani yeni bir obje olustur diyor ve olusturuyor
		// ardindan esitligin soluna bakiyor ve atama yapiyor
		// yani bu olusturma seklinde her zaman yeni bir obje olusur !!
		
		// 2) Bu gune kadar ogrendigimiz gibi (primitivelere benzer sekilde) olusturursak
		// String str2 = "Mustafa"; dersek (java bu yazimi String class'i cok kullanildigi icin kolaylik olsun diye yapmis)
		// Java bu durumda esitligin sag tarafina bakiyor ve orada gordugunden elinde var ise yani String Pool'da var ise yeniden olusturmuyor
		// stack'te bir referance deger daha olusturuyor ve iki tane referance heapte ayni kutuyu tutmus oluyor
		
		String str1 = "Mustafa";
		String str2 = "Mustafa";
		
		String str3 = new String("Mustafa");
		String str4 = new String("Mustafa");
		
		// --> stringler icin karsilastirma yaparken == kullanmayiz, equals emthodunu kullaniriz conku == ifadesi biza yanlis sonuc VEREBILIR
		System.out.println(str1 == str3); // false   --> hem degere hem referance'a bakar
		System.out.println(str1.equals(str3)); // true --> yalnizca degerlere bakar
		
		System.out.println(str4 == str3); // false  
		System.out.println(str4.equals(str3)); // true
		
		System.out.println(str1 == str2); // true ??? acaba neden, String Pool sebebi ile
		
		// !!!
		// Soru: Stringde == calisir mi?
		// Her zaman dogru calismaz
		// string new kelimesi ile olusmussa == calismaz equals calisir
		// string primitive gibi olusturulmussa == dogru calisabilir (string pool'da ayni veriden varsa)
		
		
		
		
		
		
		
		
	}

}
