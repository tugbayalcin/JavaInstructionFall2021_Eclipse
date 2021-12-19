package day21_Scope_Arrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
		
		// Arrayin elemanlarini yazdirmak istersek loop ile yazdirabiliriz
		int arr[] = {2,4,5,6,78,89};
		
		// tum elemanlari yazdiralim
		
		for(int i=0; i<arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		// ya da aArrays classindan yardim alip toString() methodu yardimi ile direk array olarak yazdirabiliriz
		System.out.println(Arrays.toString(arr));
	}

}
