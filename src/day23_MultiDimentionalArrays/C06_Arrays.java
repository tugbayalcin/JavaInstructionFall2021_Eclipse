package day23_MultiDimentionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		
		// Verilen iki arrayi birlestiren ve sonucu birlesikArray isminde bir arraya kaydeden bir method olusturunuz
		
		int arr1[] = {3,5,7,10};
		int arr2[] = {2,4,6,8,9};
		
		int birlesikArray[] = birlestir(arr1,arr2);
		System.out.println(Arrays.toString(birlesikArray)); 
		
		// sirali olarak yazdiralim
		Arrays.sort(birlesikArray);
		System.out.println(Arrays.toString(birlesikArray)); 

	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikArray[] = new int[arr1.length+arr2.length];
		
		for(int i=0; i<arr1.length; i++) // 1. arrayin elemanlarini birlesik arraye atadik
		{
			birlesikArray[i] = arr1[i];
		}
		for(int i=0; i<arr2.length; i++) // 2. arrayin elemanlarini birlesik arraye atadik
		{
			birlesikArray[i+arr1.length] = arr2[i]; 
		}
 		
		
		return birlesikArray;
	}

	

}
