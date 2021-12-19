package day29_StaticBlocks_PassByV_PBR;

public class C02_PassBy {

	public static void main(String[] args) {
		
		// Biz 100 tl'ye satilan bir urun icin 2 farkli indirim uygulayan iki method olusturslim
		
		int fiyat =100;
		// bu degiskeni kalici olarak degistirmek istiyorsak static olarak tanimlayabiliriz v eya main method icinde atama yapabiliriz
		
		indirimYap25(fiyat);
		System.out.println("Methoddan sonra main methoddaki fiyat: " + fiyat); // 100
		
		indirimYap10(fiyat);
		System.out.println("Methoddan sonra main methoddaki fiyat: " + fiyat); // 100
		// degisim yalnizcxa method scope'unda kalmis oluyor, degeri aldigimiz yerde bir degisiklik yapamamis oluyoruz

	}

	private static void indirimYap25(int fiyat) // main memthoddaki fiyat degiskeninin tuttugu 100 degerini(value) alıp buraya getirmis olduk
	{
		
		fiyat *= 0.75;
		System.out.println("%25 indirimli fiyat : " + fiyat);
		
	}

	private static void indirimYap10(int fiyat) {
		
		fiyat *= 0.90;
		System.out.println("%10 indirimli fiyat : " + fiyat);
		
	}

}
