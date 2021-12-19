package day05_MatematikselIslemler;

public class C02_MatematikselIslemler {

	public static void main(String[] args) {
		
		int sayi1 = 10;
		int sayi2 = 20;
		
		String str1 = "Ali";
		String str2 = "Can";
		
		System.out.println(sayi1+sayi2+str1); // 30Ali
		
		System.out.println(str1+sayi1+sayi2); // Ali1020
		
		System.out.println(str1+(sayi1+sayi2)); // Ali30
		
		System.out.println(sayi1*sayi2+str2); // 200Can
		
		System.out.println(str1+sayi1*sayi2); // Ali200
		
		System.out.println(str1+sayi1*sayi1); // Ali100
		
		System.out.println(str1+(sayi1+sayi2)); // Ali30
		
		

	}

}
