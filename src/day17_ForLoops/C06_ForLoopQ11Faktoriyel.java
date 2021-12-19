package day17_ForLoops;

import java.util.Scanner;

public class C06_ForLoopQ11Faktoriyel {

	public static void main(String[] args) {
		
		// Interview Question 
		// Soru 11: Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Faktoriyel hesaplamak icin 10'dan kucuk bir tam sayi giriniz: ");
		int sayi = scan.nextInt();
		
		int faktoriyel = 1;
		
		System.out.print(sayi +"! = ");
		for(int i=sayi; i>1; i--) // >0 da olur ama biz sayialrin arasina * koymak istedigimiz ve son eleman olan 1'den sonra * olmasin istedigimiz icin boyle yaptik
		{
			faktoriyel*=i;
			System.out.print(i + "*");
		}
		System.out.println("1=" + faktoriyel); // * sız olsun diye 1'i buraya yazdik
		
		scan.close();
	}

}
