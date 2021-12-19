package day06_07_WrapperClasses;

public class C02_Concatenation {

	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = "Guzel";
		int sayi1 = 5;
		int sayi2 = 4;
		
		// Yukaridaki variablelari kullanarak asagidaki metinleri yazdiralim
		
		// 1. Java Guzel 54
		System.out.println(str1 + " " + str2+ " " + sayi1 + sayi2);
		
		// 2. Java 5 Guzel
		System.out.println(str1 + " " + sayi1 + " " + str2);
		
		// 3. Java 94
		System.out.println(str1 + " " + (sayi1+sayi2) + sayi2);
		
		// 4. Java 19
		System.out.println(str1 + " " + (sayi1-sayi2) + (sayi1+sayi2));
		
		// 5. 54 Guzel
		System.out.println("" + sayi2 + sayi1 + " " + str2); 
		// soldaki iki sayiyi yan yana yazdirmak istiyorsam basina hiclik koymaliyim ki toplama islemi yapmasin

	}

}
