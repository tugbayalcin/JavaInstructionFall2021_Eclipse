package day07_IfStatementsQuestions;

import java.util.Scanner;

public class C02_Q02 {

	public static void main(String[] args) {
		
		// Q02: Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfler baslayan gun isimlerini yazdirin
		// Example: ilkHarf = P  -->  output = "Pazar, Pazartesi veya Persembe"
		//			ilkHarf = S  -->  output = "Sali"
		
		// Note: Buyuk kucuk harf duyarliliginin problem olmamasi icin toUpperCase veya toLowerCase methodlarindan yararlanin
		
		// S02: Kullanicidan 1 harf almam gerek 
				// Bunun icin once Scanner objesi olusturmaliyim
				// Kullanicinin girdigi verinin tamamini kucuk harf veya buyuk harf yapmaliyim
				// Ardindan String bir ifadenin icinden yalnizca 1 harf almami saglayan charAt methodundan yararlanmaliyim
				
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Lutfen gun isimlerinden birinin ilk harfini giriniz: ");
				
				char ilkHarf = scan.next().toUpperCase().charAt(0);
				// 			 = ilk kelime alindi, hepsi buyuk harf yapildi, ilk harfi alindi (3 method kullandik)
				
				if(ilkHarf == 'P') 
				{
					System.out.println("Pazar, Pazartesi veya Persembe");
				}
				if(ilkHarf == 'S') 
				{
					System.out.println("Sali");
				}
				if(ilkHarf == 'C') 
				{
					System.out.println("Carsamba, Cuma veya Cumartesi");
				} 
				
				
		// Burada buyuk harf kucuk harf duyarliligi icin cozum uretmemiz lazim
				
				// Solution 1: Yalnizca ilk harfle ilgilendigimiz icin, ve de bir harf ya buyuk ya da kucuk olabilecegi icin
				// condition kismina sunu yazabiliriz
				if(ilkHarf == 'C' || ilkHarf == 'c') {}
				
				// Eger kelimenin tamamini kullanicidan alsa idim, buyuklu kucuklu her kombinasyon icin tek tek or kosulu yazmam 
				// mantikli olmayacaktir, boyle durumlarda ise toUpperCase() veya toLowerCase() methodlarini kullaniriz
				
				// ayrica kullanici kosulalrimizda olmayan bir harf girdiginde program hicbir cikti vermiyor
				// buraya da bir kontrol yazarak kullaniciyi bilgilendiren bir uyari yazdirmaliyiz ki kodumuz temiz ve guzel olsun
				
				if(ilkHarf != 'P' && ilkHarf != 'S' && ilkHarf != 'C' ) 
				{
					System.out.println("Gecersiz harf girdiniz. \nLutfen gun isimlerinden birinin bas harfini giriniz: ");
				}
				
				scan.close();
				
				
	}

}
