package day01_02_Variables;

public class C01_Variables {
	public static void main(String[] args) 
	{
		// variable olusturmak ve deger atamak farkli islemlerdir
		// istersek variable olusturma ve deger atamayi tek satirda yapabiliriz
		
		String ogrenciIsim = "Tugba"; 
		// esittirin sol tarafi declaration, sag tarafi assingment, esittirin kendisi atama operatorudur
		
		System.out.println(ogrenciIsim); // tugba yazacak
		
		// istersek de once olusturur, istedigimiz zaman da deger atayabiliriz
		int sayi; // declaration yapildi
		// System.out.println(sayi); // atama yapilmadigi icin yazdiramayiz, hata verir
		sayi = 10;
		System.out.println(sayi); // 10 yazacak
		
		
		// biz daha once olusturulmus ve deger atamasi yapilmis bir degiskene yeni deger atamasi yapabiliriz
		// bu durumda java variablein eski degerini silip yeni degeri variable'a atar
		sayi = 25;
		System.out.println(sayi); // sayi artik 25 oldu, 25 yazacak
		// java balik hafizalidir, en son ne soylediysen onu tutar 
		// ; ilr statement sonlandirilir
		
		ogrenciIsim = "Asel";
		System.out.println(ogrenciIsim); // ogrencinin adi artik asel, asel yazdiracak
		
		
		/*
		 * Variable(degisken) olusturma ve tanimlama islemini su sekilde dusunebilirsin
		 * Variable dedsigimiz sey bir containerdir
		 * Yani bir koli
		 * Data typeimiz koli çesidimizdir
		 * Variable adimiz koliye yapistirdigimiz isim etiketi
		 * ismin tuttugu deger ise kutunun icine koydugumuz seydir
		 * Kutu ici bos iken kullanilamaz
		 * ve her kutu ceisid yalnizca kendine ozel olan seyi saklayabilir, baska bir sey saklamaz
		 * Deger saklamak icin kutuya ihtiyacimiz vardir
		 * Bunun icin once declaration islemi yapariz
		 * Degeri kutuya yerlestirmek ise atama-assignment islemidir
		 * atama yapilmadan bos kutu ile islem yapilamaz
		 *
		 */
		
		
		
		
		
	
		

		
	}
	
	

}
