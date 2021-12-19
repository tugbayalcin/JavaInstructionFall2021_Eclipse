package day21_Scope_Arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		
		// Soru2: Verilen bir arrayin tum elemanlarini topalayan bir program yazalim.
		
		int arr[] = {3,5,8,65,32,34};
		
		int toplam =0;
		
		for(int i=0; i<arr.length; i++) 
		{
			toplam += arr[i];
		}
		System.out.println("Elemanlarin toplami: " + toplam);
		
		//---------------------------------------------------------
		
		// Arrayin tum elemanlarini once kucukten buyuge, sonra da buyukten kucuge yazdirin
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// buyukten kucuge siralamak icin ya for looptan yardim alacagiz
		
		for(int i = arr.length-1; i>0; i--) 
		{
			System.out.print(arr[i] + " ");
		}
		// ancak bu bir array degil yan yana yazilmis elemanlar veriri
		
		// eger tam anlamiyla bir array istiyorsam, ayni uzunlukta bir array olusturup elamanlari ters sirada yeni arraya tasiyabiliriz
		
		int tersArray[] = new int[arr.length];
		System.out.println(Arrays.toString(tersArray)); // [0,0,0,0,0,0,0] yazdirdigini goreceksin
		
		for(int i=0; i<tersArray.length; i++) 
		{
			tersArray[i] = arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(tersArray)); 
		
		

	}

}
