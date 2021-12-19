package day13_StringManipulations3;

public class C05_ReplaceAll {

	public static void main(String[] args) {
		
		// gir google a regular expressions yap arastir ve dene 
		
		String cumle = "Java        cok 		zevkli";
		
		// aradaki fazlalik bosluklari silelim
		cumle = cumle.replaceAll("\\s+", " "); // birden fazla space i tek space ile degistir
		
		System.out.println(cumle);
		
		
		System.out.println(cumle.replaceAll("[ak]", ""));  // a ve k yi yok etti
		
		System.out.println(cumle.replaceAll("[a-k]", "")); // a ile k arasindaki her seyi yok etti
		
		System.out.println(cumle.replaceAll("[a-z]", ""));  // a ile z arasindaki her seyi yok etti
		
		System.out.println(cumle.replaceAll("\\S", "*")); // **** *** ****** yazdi
		
		System.out.println(cumle.replaceAll("\\s", "*")); // Java*cok*zevkli
		
		
		

	}

}
