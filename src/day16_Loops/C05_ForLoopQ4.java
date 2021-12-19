package day16_Loops;

import java.util.Scanner;

public class C05_ForLoopQ4 {

	public static void main(String[] args) {
		
		// Soru 4: Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 100'den kucuk bir tam sayi giriniz: ");
		int sayi = scan.nextInt();
		
		for (int i =1; i<=sayi; i++) 
		{
			if(i%3==0) 
			{
				System.out.print(i + " ");
			} 
		}
		System.out.println();
		
		
		//  sayi negatifse veya tam sayi degilse uyari verecek sekilde yazalim
		
		double num = scan.nextDouble();
		int number = (int)num;
		if(num<0) 
		{
			System.out.print("Negatif Sayi Girisi Yapilamaz!");
		}
		else if(num != number) // kullanici 5 girdiginde num = number olur, ben tam sayi gir diye uyari vermek istiyorum, o zaman bu durumda veremem
		{
			System.out.print("Lutfen Tamsayi Girisi Yapiniz: ");
		}
		else if(sayi>100) 
		{
			System.out.print("100'den Buyuk Sayi Girisi Yapilamaz!");
		}
		else 
		{
			for (int i =1; i<=sayi; i++) 
			{
				if(i%3==0) 
				{
					System.out.print(i + " ");
				} 
			}
		}
		
		
		
		
		scan.close();

	}

}
