package day16_Loops;

import java.util.Scanner;

public class C06_ForLoopQ5 {

	public static void main(String[] args) {
		
		// Soru 5: Kullanicidan 100’den kucuk pozitif bir tamsayi isteyin. 
		// 		   1’den baslayarak girilen sayiya kadar 3’un veya 5”in kati olan sayilari yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 100'den kucuk pozitif bir tam sayi giriniz: ");
		int sayi = scan.nextInt();
		
		for (int i =1; i<=sayi; i++) 
		{
			if(i%3==0 || i%5==0) 
			{
				System.out.print(i + " ");
			} 
		}
		System.out.println();
		System.out.println();
		
		// ben 3'e ve 5' e bolunerek mi geldigini de yadirmak istiyorum 
		
		System.out.print("3'e Bolunen Sayilar:  ");
		for (int i =1; i<=sayi; i++) 
		{
			if(i%3==0) 
			{
				System.out.print(i + " ");
			} 
		}
		System.out.println();
		System.out.print("5'e Bolunen Sayilar:  ");
		for (int i =1; i<=sayi; i++) 
		{
			if(i%5==0) 
			{
				System.out.print(i + " ");
			} 
		}
		System.out.println();
		System.out.print("Hem 3'e Hem de 5'e Bolunen Sayilar:  ");
		for (int i =1; i<=sayi; i++) 
		{
			if(i%3 ==0 && i%5==0) 
			{
				System.out.print(i + " ");
			} 
		}
		
		scan.close();
	}

	
}
