package day05_MatematikselIslemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		
		// kullanicidan 3 basamakli bir sayi alip rakamlari toplamini yazdiran bir program yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		int sayi = scan.nextInt();
		
		// sayi 573 olsun
		
		int rakamlarToplami = 0;
		//-------------------------------------------------------------------------------------------------------------
		int rakam = sayi%10; // bana birler basamagini verir
		
		rakamlarToplami += rakam;
		
		// sayimiz hala 573
		// 3 ten kurtulmak istiyorum, cunku 3 ile isim bitti, sayiyi 57 haline getirmek istiyorum
		// bunun icin sayiyi 10'a bolmem yeterli
		
		sayi/=10; // --> kullandigim rakamdan kurtuldum, onu cope attim geriye diger basamaklari biraktim 
		//System.out.println(sayi); //  57yazdirir
		//----------------------------------------------------------------------------------------------------------- islem 1. kez yapildi
		// artik sayim 57 oldu, modul ile birler basamagini alalim
		rakam = sayi%10;
		rakamlarToplami += rakam;
		
		sayi/=10;
		//System.out.println(sayi);  // 5 yazdirir
		//----------------------------------------------------------------------------------------------------------- islem 2. kez yapildi
		// artik sayim 5 oldu 
		rakam = sayi;
		rakamlarToplami += rakam;
		//---------------------------------------------------------------------------- son rakam oldugunu bildigimiz icin islem yapilmadan eklendi
		System.out.println("Girdiginiz Sayinin Rakamlar Toplami: " + rakamlarToplami);
		scan.close();
		
		// bu kod yalnizca 3 basamakli sayilarda calisir
		// ancak kodlama mantiginda guzel olan sudur ki:
		// sayi 3 basamakli ise islem 3 kere yapilsin
		// sayi 4 basamakli ise islem 4 kere yapilsin 
		
		
		
		
	}

}
