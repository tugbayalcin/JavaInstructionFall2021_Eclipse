package day23_MultiDimentionalArrays;

import java.util.Arrays;

public class C05_Array {

	public static void main(String[] args) {
		
		// Soru 5: Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		
		String cumle = "Her sey Java ile kolay";
		
		String kelimeler[] = cumle.split(" "); // split icine yazilan seyi saga mi sola mi dahil edecegini secemez ve direk oldurur
		
		System.out.println(Arrays.toString(kelimeler)); 
		
		System.out.println("Girilen cumlede " + kelimeler.length + " adet kelime vardir .");

	}

}
