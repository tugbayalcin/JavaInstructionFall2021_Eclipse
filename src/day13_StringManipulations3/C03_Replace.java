package day13_StringManipulations3;

public class C03_Replace {

	public static void main(String[] args) {
		
		String str = "Java ogrenmek cok zevkli";
		
		System.out.println(str.replace(" ", "")); // atama yapilmadi, sadece yazdirdik
		
		System.out.println(str.replace("ogrenmek", "kod yazmak"));
		
		System.out.println(str.replace("e", "a"));
		
		

	}

}
