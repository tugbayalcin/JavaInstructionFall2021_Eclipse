package day17_ForLoops;

import java.util.Scanner;

public class C05_ForLoopQ10 {

	public static void main(String[] args) {
		
		// Soru 10: Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen birinci sayiyi giriniz: ");
		int sayi1 = scan.nextInt();
		System.out.println("Lutfen ikinci sayiyi giriniz: ");
		int sayi2 = scan.nextInt();
		
		int sonuc=0;
		if (sayi1<sayi2) 
		{
			for(int i=sayi1; i<=sayi2; i++) 
			{
				sonuc+=i;
			}
		}
		else 
		{
			for(int i=sayi2; i<=sayi1; i++) 
			{
				sonuc+=i;
			}
		}
		System.out.println("Girilen sayilar ve araalrindaki sayilarin toplami: " + sonuc);
		
		// hocanın cozumu
		
		int kucuk =0;
		int buyuk =0;
		if(sayi1>sayi2) 
		{
			buyuk = sayi1;
			kucuk= sayi2;
		}
		else 
		{
			buyuk = sayi2;
			kucuk = sayi1;
		}
		
		int toplam =0;
		
		for(int i=kucuk; i<=buyuk; i++) 
		{
			toplam+=i;
		}
		System.out.println("Girilen sayilar ve araalrindaki sayilarin toplami: " + toplam);
		

		scan.close();
	}

}
