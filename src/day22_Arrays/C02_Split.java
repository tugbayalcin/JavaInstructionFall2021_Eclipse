package day22_Arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		
		// "Java ogrenmek cok guzel"
		// cumlesinin kelimelerini ters sirada yazdirin
		
		String cumle = "Java ogrenmek cok guzel";
		
		String kelimeler[] = cumle.split(" "); // cumlemi space ile ayir ve her bir elemani arrayin bir indeksine koy dedim
		System.out.println(Arrays.toString(kelimeler)); // ne yaptigini gormek icin yazdiralim, yoksa yazdirmak zorunda degiliz
		
		for(int i=kelimeler.length-1; i>=0; i--) 
		{
			System.out.print(kelimeler[i] + " ");
		}
		

	}

}
