package day09_NestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElseQuestion3 {

	public static void main(String[] args) {
		
		// INTERVIEW QUESTION
		
		// Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. 
		// Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin. 
		// Son rakamı 0 ise ekrana “5’e bölünen  çift sayı” yazdırın. 
		// Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.  
		// Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi giriniz: ");
		
		int sayi = scan.nextInt();
		
		if (sayi<1000 || sayi>9999)  // iki alani birlestirmek istersen or kullanmalisin, tek bir alani tanimlamak istersen and kullanmalisin
		{
			System.out.println("4 Basamakli Pozitif Sayi Girmelisiniz.");
		}
		else // burasi kesinlikle 4 basamakli olan sayilari yakalayacak
		{
			if(sayi % 5 == 0)  // burasi 5'e tam bolunenleri yakalar
			{
				if((sayi%10) == 0) // burasi 5'e bolunup son rakami 0 olanalri yakalar
				{
					System.out.println("5'e Bolunen Cift Sayi.");
				}
				else  // burasi 5'e bolunup son rakami 5 olanlari yakalar
				{
					System.out.println("5'e Bolunen Tek Sayi.");
				}
			}
			else // burasi 5'e tam bolunemeyenleri yakalar
			{
				System.out.println("Tekrar deneyiniz.");
			}

		}
		
		scan.close();
		
		
		
		
		
	}

}
