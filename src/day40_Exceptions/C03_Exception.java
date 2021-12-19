package day40_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {
		
		// Verilen bir int array icin kullanicidan sayi isteyin ve girilen sayiyi index olarak kabul edip, 
		// o indexteki elementi yazdirin
		
		int [] arr = {2,3,5,6,2,7,9,1};
		
		// ArrayIndexOutOfBoundsException
		//InputMismatchException
		
		
		
		try 
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Lutfen Elementi Yazdirmak Icin Bir Sayi Giriniz: ");
			int index = scan.nextInt();
			System.out.println("Girdiginiz Indexteki Element: " + arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Girdiginiz Index Array'de Yok.");
		}
		catch (InputMismatchException e)
		{
			System.out.println("Girdiginiz Index Pozitif Tam Sayi Olmalidir.");
		}
		
		
		

	}

}
