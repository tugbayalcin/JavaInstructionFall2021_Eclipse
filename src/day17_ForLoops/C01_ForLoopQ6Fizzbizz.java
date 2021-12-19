package day17_ForLoops;

import java.util.Scanner;

public class C01_ForLoopQ6Fizzbizz {

	public static void main(String[] args) {
		
		// ınterview sorusu (fizzbuzz sorusu)
		
		// Soru 6:  Kullanicidan 100’den kucuk bir tamsayi isteyin.
		//			1’den baslayarak girilen sayiya kadar TUM sayilari yazdirin. Ancak;
	    //			- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
		//			- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
		//			- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 100'den kucuk pozitif bir tam sayi giriniz: ");
		int sayi = scan.nextInt();
		
		for (int i =1; i<=sayi; i++) 
		{
			if(i%3==0 && i%5==0) 
			{
				System.out.println("Java Guzeldir");
			}
			else if(i%3==0) 
			{
				System.out.println("Java");
			}
			else if(i%5==0) 
			{
				System.out.println("Guzeldir");
			}
			else 
			{
				System.out.println(i);
			}
			
		}
		scan.close();

	}

}
