package day21_Scope_Arrays;

import java.util.Arrays;

public class C05_Arrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Soru1: Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin. 
		// Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
		
		int arr[] = {1,2,3,4,5,};
		int kova =arr[0]; // int kova =0; da diyebilirdik, sayi tutacagi icin integer bir deger olmasi yeterli
		
		for(int i=0; i<arr.length-1; i++) 
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1]=kova;
		System.out.println(Arrays.toString(arr)); 
		

	}

}
