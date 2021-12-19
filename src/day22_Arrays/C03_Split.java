package day22_Arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		
		// "Java ogrendim,  #cok para ?kazandim.,"
		// cumlesinin kelimelerini, ozel karakterler ve noktalama isaretleri olmadan harf sirasina gore yazdiralim
		
		String cumle = "Java ogrendim,  #cok para ?kazandim.,";
		
		// 1) oncelikle cumlemizi kelimelere bolelim:
		String kelimeler[] = cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler)); // [Java, ogrendim,, , #cok, para, ?kazandim.,]
		// console daki virguller benim elemanlarima ait degil, 
		// her bir elemani birbirinden ayirmak icin konulmus array yazdirma formati olarak dusun
		
		// 2) simdi kelimeleri teker teker yazdiralim
		for(int i=0; i<kelimeler.length; i++) 
		{
			kelimeler[i] = kelimeler[i].replaceAll("\\W", ""); // kelimemizi modifiye ettik, regex kullandik
			System.out.println(kelimeler[i]);
		}
		// cıktımızda bir tane hiclik var (hiclik secilemez, bosluk secilebilir, buradan hangisi oldugunu anlayabilirsin)
		// bunun sebebi split() methodunun bosluklari oldurup arada kalan seyi yazdirmasindan kaynaklanir
	    // iki tane pes pese bosluk koydugumuzda bosluk|hiclik|bosluk olarak gorur, boslklari oldurur ve yazdiracak yalnizca hiclik kalir
		
		System.out.println(Arrays.toString(kelimeler)); // kelimeleri yeniden array olarak yazdiralim
		Arrays.sort(kelimeler);
		System.out.println(Arrays.toString(kelimeler)); // array olarak yazdirdi
		
		
		for(int i=0; i<kelimeler.length; i++) 
		{
			System.out.print(kelimeler[i] + " ");
		}
		
		
		
		
		

	}

}
