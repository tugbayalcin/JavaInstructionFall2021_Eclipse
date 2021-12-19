package day19_While_DoWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		
		// Soru 6: Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Bolenlerini Bulmak Icin Pozitif Bir Tam Sayi Sayi Giriniz: ");
		int sayi = scan.nextInt();
		
		int sayac =0;
		int bolen =1;
		
		while(bolen<=sayi) 
		{
			if(sayi%bolen==0) 
			{
				System.out.print(bolen + " ");
				sayac++;
			}
			bolen++;
		}
		System.out.println();
		System.out.print(sayi +" sayisinin "+ sayac +" adet tam boleni vardir.");

		scan.close();
	}

}
