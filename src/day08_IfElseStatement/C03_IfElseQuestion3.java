package day08_IfElseStatement;

import java.util.Scanner;

public class C03_IfElseQuestion3 {

	public static void main(String[] args) {
		
		//Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”, 
		//65’den buyukse “Emekli olabilirsin” yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz: ");
		int yas = scan.nextInt();
		
		if(yas<65) 
		{
			System.out.println("Emekli olamazsin, biraz daha calismalisin :) ");
		}
		else 
		{
			System.out.println("Emekli olabilirsin. Tebrikler. Artik dunya turuna cikabilirsin ;) ");
		}
		
		scan.close();
		
		// 65 else kismina dahil oldu
		// if else de acikta kalan hicbir durum yoktur !

	}

}
