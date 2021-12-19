package day29_StaticBlocks_PassByV_PBR;

import java.util.Arrays;

public class C05_PassByValueArray {

	public static void main(String[] args) {
		
		int[] sayilar = {3,4,5,6};
		
		elemanDegistir(sayilar);
		System.out.println("Eleman degistir Methodundan sonra main methodda: " + Arrays.toString(sayilar)); // [10, 4, 5, 6]
		
		arrayiDegistir(sayilar);
		System.out.println("Arrayi degistir Methodundan sonra main methodda: " + Arrays.toString(sayilar)); // [10, 4, 5, 6]
		// yani orjinal array degismedi
		// ancak array icindeki degerleri degistirebiliyoruz
		// array icin suna dikkat, eleman ekleme cikarma islemleri arrayin dogrudan reference'ini degistireceginden direk array degismis olur
		// bunu soyle dusunebiliriz: tugba hirka giyse de tugba, mont giyse de tugba. giydikleri degisebilir ancak tugba yine tugbadir, degismez

	}

	private static void arrayiDegistir(int[] sayilar) {
		
		sayilar = new int[6]; // sayilar arrayine 6 elemanli yeni bir array atadim
		System.out.println("Arrayi degistir Methodunda: " + Arrays.toString(sayilar)); // [0, 0, 0, 0, 0, 0]
		
	}

	private static void elemanDegistir(int[] sayilar) {
		
		sayilar[0] =10;
		System.out.println("Eleman degistir Methodunda: " + Arrays.toString(sayilar)); // [10, 4, 5, 6]
		
	}

}
