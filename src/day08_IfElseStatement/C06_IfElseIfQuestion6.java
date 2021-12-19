package day08_IfElseStatement;

import java.util.Scanner;

public class C06_IfElseIfQuestion6 {

	public static void main(String[] args) {
		
		// Kullanicidan iki sayi isteyin, 
		// sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin, 
		// sayilarin ikisi de negative ise sayilarin carpimini yazdirin, 
		// sayilarin ikisi farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin, 
		// sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir iki sayi giriniz.\nIlk sayiyi girdikten sonra enter'i tuslayarak ikinci sayi girisini yapiniz:");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		if((sayi1>0) && (sayi2>0)) 
		{
			System.out.println("Her iki sayi da pozitiftir. Sayilarin toplami:  " + (sayi1 + sayi2));
		}
		else if((sayi1<0) && (sayi2<0)) 
		{
			System.out.println("Her iki sayi da negatiftir. Sayilarin carpimi:  " + (sayi1 * sayi2));
		}
		else if(((sayi1<0) && (sayi2>0)) || ((sayi1>0) && (sayi2<0))) // burada condition kismina (sayi1*sayi2<0) da yazabilirdin
		{
			System.out.println("Sayilar farkli isaretlere sahiptir. Farkli isaretli sayilarla islem yapamazsin.");
		}
		else if(sayi1==0 || sayi2==0)  // bu durum geriyen kalan tek ihtimal oldugu icin condition yazman gerekmez, bos birakabilirsin 
		{
			System.out.println("Sifir carpmaya gore yutan elemandir.");
		}

		scan.close();
		
		// else if yapisi mutlaak else ile biter. 
	}

}
