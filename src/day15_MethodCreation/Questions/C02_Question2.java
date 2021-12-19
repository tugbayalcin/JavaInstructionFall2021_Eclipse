package day15_MethodCreation.Questions;

import java.util.Scanner;

public class C02_Question2 {

	public static void main(String[] args) {
		
		// Kullaniciya kac sayi toplamak istedigini sorun. 
		// Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin. 
		// Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen toplamak istediginiz sour adetini 2,3 veya 4'den biri olacak sekilde giriniz: ");
		
		int tercih = scan.nextInt();
		
		if(tercih>4) 
		{
			tercih =5;
		}
		
		switch(tercih) 
		{
		case 2:
			ikiSayiTopla();
			break;
		case 3:
			ucSayiTopla();
			break;
		case 4:
			dortSayiTopla();
			break;
		case 5:
			System.out.println("Cok sayi girdiniz. Ben toplayamam.");
			break;
		default:
				System.out.println("Gecersiz Tercih.");
		}
		
		scan.close();

	}

	private static void dortSayiTopla() {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen dort sayi giriniz \nHer sayi Girisinden Sonra Enter'a Basarak Ilerleyiniz.");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double sayi3 = scan.nextDouble();
		double sayi4 = scan.nextDouble();
		
		System.out.println("Girdiginiz 4 Sayinin Toplami: " + (sayi1+sayi2+sayi3+sayi4));
		
		scan.close();
		
	}

	private static void ucSayiTopla() {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen uc sayi giriniz \nHer sayi Girisinden Sonra Enter'a Basarak Ilerleyiniz.");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double sayi3 = scan.nextDouble();
		
		System.out.println("Girdiginiz 3 Sayinin Toplami: " + (sayi1+sayi2+sayi3));
		
		scan.close();                                                         
		
		
	}

	private static void ikiSayiTopla() {
		
		Scanner scan = new Scanner (System.in); 
		// islemlerimdeki parametre sayisi farkli, 2 3 ve 4. 
		// oyuzden en basta kullanicidan hepsine uygun sayida parametre alamiyorum, 
		// dolayisi ile methodlerin icerisinde almaliyim.
		
		System.out.println("Lutfen iki sayi giriniz \nHer sayi Girisinden Sonra Enter'a Basarak Ilerleyiniz.");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		System.out.println("Girdiginiz 2 Sayinin Toplami: " + (sayi1+sayi2));
		
		scan.close();
	}

}
