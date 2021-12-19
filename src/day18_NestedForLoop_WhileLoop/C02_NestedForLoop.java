package day18_NestedForLoop_WhileLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {
		
		// Kullanicidan 1'dan kucuk pozitif bir tam sayi girmesini isteyin
		// Girdigi sayiya gore asgidaki sekli ayzdirin
		// Ornek: 3 girilirse soyle yapsin
		// 1
		// 1 2
		// 1 2 3 
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen10'dan kucuk pozitif bir tam sayi giriniz:");
		int sayi= scan.nextInt();
		
		for(int satir=1; satir<=sayi; satir++) 
		{
			for(int i=1; i<=satir; i++) 
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		scan.close();

	}

}
