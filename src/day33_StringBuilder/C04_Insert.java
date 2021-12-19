package day33_StringBuilder;

public class C04_Insert {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java ogrendik");
		
		// araya 'cok iyi' ifadesini ekleyelim
		
		sb.insert(4, "yi cok iyi");
		System.out.println(sb);
		
		// sonuna ', yasasin' ekleyelim --> sonuna dedigimiz icin direk append de kullanabiliriz
		
		
		
		// verilen bir metnin icerisinden bir kisim eklemek istersek;
		
		sb.insert(7, "cok iyiyim", 0, 4); // 7. indekse verilen stringin 0-4 indeksleri arasini ekleyecek
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
