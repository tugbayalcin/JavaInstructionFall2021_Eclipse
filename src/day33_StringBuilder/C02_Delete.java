package day33_StringBuilder;

public class C02_Delete {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java Candir Can");
		
		sb.deleteCharAt(11); // sadece 11. indexteki karakteri siler
		System.out.println(sb);
		
		sb.delete(11,sb.length()); // 11. indeksten sonrasini sil demek --> ilk index inclusive ikinci index exclusive oldugundan -1 yapmiyoruz ki son karakter de silinsin
		System.out.println(sb);
	}

}
