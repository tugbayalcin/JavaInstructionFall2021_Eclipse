package day40_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {
		
		// Kullanicidan istedigi kadar sayi alip bu sayilari toplayan bir program yapiniz
		// sayi girisini bitirmek icin Q ya basiniz
		
		
		int sayi =0;
		int toplam =0;
		//String secim = "";
		int count =0;
		
		Scanner scan = new Scanner(System.in);
		
		try 
		{
			while(count <10000)  // eskiden  !secim.equalsIgnoreCase("Q") yapardik ve hata aliyorduk
			{
				System.out.println("Lutfen Toplamak Icin Bir Sayi Giriniz : \nBitirmek Icin Sayi Disinda Bir Tusa Basiniz.");
				sayi = scan.nextInt();
				
				toplam += sayi;
				count++;
			}
			
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Girdiginiz " + count + " Adet Sayinin Toplami: " + toplam);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
