package day13_StringManipulations3;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
		// replaceAll() methodunda Regular Expressions = regex  kullanilabilir
		
		String str = "*Java 98ogrenmek c..ok k876olay";
		
		// replaceAll methodlari kullanarak java ogrenmek cok kolay yazalim
		
		str = str.replaceAll("\\d", ""); // digit= rakam kısaltilmasi d --> butun rakamlari siler
		System.out.println(str); // *Java ogrenmek c..ok kolay 
		
		str = str.replaceAll("\\s", "x"); // space = bosluk kisaltmasi s --> butun bosluklari degistirir
		
		str = str.replaceAll("\\W", ""); // word = kelime kisaltilmasi w --> buyuk W butun harf olmayanlari siler 
		//str = str.replaceAll("\\w", ""); // word = kelime kisaltilmasi w --> kucuk w butun harfleri siler
		// ama boslugu da sildi, 
		// bunu cozmek icin once bosluklari cumlemde olmayan bir harf ile degistiririz sonra da silme isleminden sonra geri aliriz
		// turkcede kullanilmayan bir harf secelim
		
		str = str.replace("x", " ");
		System.out.println(str); // Java ogrenmek cok kolay yazacak
		
		

	}

}
