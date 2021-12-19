package day18_NestedForLoop_WhileLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		
		// Kullanicidan iki tam sayi isteyin
		// Ilk sayidan baslayarak ikinci sayiya kadar 3'er 3'er yazdirin
		// Ikinci sayi dahil olmak zorunda degil
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen aradaki sayilari 3'er 3'er yazdirmak icin iki tam sayi giriniz:");
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		
		if(sayi1>sayi2) // azalarak gidecek
		{
			for(int i=sayi1; i>=sayi2; i-=3) // 3'er 3'er azalacak
			{
				System.out.print(i + " ");
			}
		}
		else if(sayi1<sayi2) // artarak gidecek
		{
			for(int i=sayi1; i<=sayi2; i+=3) // 3'er 3'er artacak
			{
				System.out.print(i + " ");
			}
		}
		else 
		{
			System.out.println("Girilen Sayilar Esittir.");
		}
		
		scan.close();

	}

}
