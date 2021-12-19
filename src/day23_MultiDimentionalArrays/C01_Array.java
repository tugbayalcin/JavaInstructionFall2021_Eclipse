package day23_MultiDimentionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		
		// Verilen bir Array'den istenen degere sahip elemanlari silip, kalanlari yeni bir array olarak kaydedin 
		// ve sonra yeni array'i yazdirin
		
		int arr[] = {3,4,5,6,3,5,8,3,4,3,9};
		int silinecekEleman = 3;
		
		// array'e yeni eleman ekleyemeyiz veya var olan elemanlari silemeyiz
		// cunku array'in declare edilen uzunlugu DEGISMEZ
		
		// Bu soruda istenen eleman silindiginde geriye kac eleman kaliyor bulmamiz lazim
		
		// silinecek sayi adedini bulalim
		
		int sayac =0;
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i] == silinecekEleman) 
			{
				sayac++; // array icinde silinecek elemandan kac tane var onu buluyoruz
			}
			
		}
		System.out.println(sayac);
		int yeniArrayUzunluk = arr.length-sayac;
		
		// artik yeni array'i olusturabiliriz
		int yeniArr[] = new int[yeniArrayUzunluk];
		
		// simdi eski array'deki elemanlari birer birer alip silinecek elemana esit olmayanlari yeni array'e atamaliyiz
		
		int j=0; // ic ice iki tane for dongusu yerine tek for loopda iki indexle calismaya ahrika ornek !!!
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i] != silinecekEleman) 
			{
				yeniArr[j]=arr[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(yeniArr));

	}
	
	

}
