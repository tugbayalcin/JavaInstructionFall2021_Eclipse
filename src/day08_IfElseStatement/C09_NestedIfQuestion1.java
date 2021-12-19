package day08_IfElseStatement;

import java.util.Scanner;

public class C09_NestedIfQuestion1 {

	public static void main(String[] args) {
		
		// Bir ulkedeki emeklilik yasi kadin ve erkek icin farklilik gostermektedir
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir
		// Calisan erkekse 65 yasindan buyukse emekli olabilir
		// Bu ulkede calisan bir kisinin yasi girildiginde emekli olup olamayacagini soyleyen programi yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen cinsiyetinizi giriniz: \nErkek icin E, Kadin icin K ");
		char cinsiyet = scan.next().toUpperCase().charAt(0);
		System.out.println("Lutfen yasinizi giriniz: ");
		double yas = scan.nextDouble();
		
		if(cinsiyet == 'E') 
		{
			if(yas >= 65) 
			{
				System.out.println(" Emekli olabilirsiniz. ");
			}
			else 
			{
				System.out.println(" Emekli olamazsiniz. ");
			}
		}
		else if (cinsiyet == 'K') 
		{
			if(yas >= 60) 
			{
				System.out.println(" Emekli olabilirsiniz. ");
			}
			else 
			{
				System.out.println(" Emekli olamazsiniz. ");
			}
		}
		else 
		{
			System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz: ");
		}
		scan.close();

	}

}
