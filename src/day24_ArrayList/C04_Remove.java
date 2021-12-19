package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {
		
		List<String> harfler = new ArrayList<>();
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		System.out.println(harfler); // [A, Z, F, D]
		
		//System.out.println(harfler.remove(1)); // Z --> yani cikarilan elemani dondurur
		System.out.println(harfler); // [A, F, D] --> remove sonrasi harfler listini yazdirdik
		
		// ***onemli**
		// burada javanın mantigi su sekildedir: 
		// (methodun yaptigi sey ile bana dondurdugu sey ayni olmak zorunda degildi, biz bir methoddan bir is yapmasini bekliyoruz)
		// remove() methodunda da biz bir bir elemani kaldirmasini istiyoruz, bu method kaldirip kalanlari yazdiran bir method degil
		// o sekilde yazilmamis
		// kalanlari gormek istiyorsak yeniden gidip listemizi yazdirabiliriz
		
		harfler.remove(1); // bu satir gidip 1 index'indeki elemani remove eder
		// ve (delil olarak) remove ettigi elemani bize getirir
		
		// listenin kalanini gormek isterseniz listeyi yazdirabilirsiniz
		
		System.out.println(harfler); // [A, F, D]
		
		System.out.println(harfler.remove(2)); // D
		
		System.out.println(harfler); // A F 
		
		System.out.println(harfler.remove("F")); // gidip F yi remove eder ve true dondurur
		
		System.out.println(harfler.remove("B")); // listede B olmadigi icin remove yapamaz
												 // gorevi yapamadigi icin false doner
		
		System.out.println(harfler);  // [A]
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		
		System.out.println(harfler); // [A, A, Z, F]
		
		System.out.println(harfler.remove("A")); // true 
		
		System.out.println(harfler); // [A, Z, F]
		harfler.add("A");
		
		System.out.println(harfler); // [A, Z, F, A]
		
		harfler.removeAll(harfler); // verilen bir listeyi siler
		
System.out.println(harfler);
		
		
		
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		List<String> silinecekHarfler= new ArrayList<>();
		silinecekHarfler.add("A");
		silinecekHarfler.add("C");
		silinecekHarfler.add("F");
		
		System.out.println(harfler); // [A, Z, F, D]
		System.out.println(silinecekHarfler); // [A, C, F]
		
		System.out.println(harfler.removeAll(silinecekHarfler)); // true --> eger silecek tek bir sey bulsa bile true doner
		System.out.println(harfler); // [A, Z, F, D]
		System.out.println(silinecekHarfler); // [A, C, F]

	}

}
