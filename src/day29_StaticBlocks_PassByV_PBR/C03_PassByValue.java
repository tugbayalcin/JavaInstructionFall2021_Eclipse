package day29_StaticBlocks_PassByV_PBR;

public class C03_PassByValue {

	public static void main(String[] args) {
		
		// main method'dan diger memthodlara veya diger methodşardan main method'a bir variable gonderirsek, java orjinal variable'i degil
		// onun tuttugu degeri(value) goturur. bundan dolayi yapilan islemler sonrasi olusan degisiklikler variable'in degerini degistirmez
		// 
		
		// Biz 100 tl'ye satilan bir urun icin 2 farkli indirim uygulayan iki method olusturslim
		
				int fiyat =100;
				// bu degiskeni kalici olarak degistirmek istiyorsak static olarak tanimlayabiliriz v eya main method icinde atama yapabiliriz
				
				System.out.println(indirimYap25(fiyat)); // 75
				// ancak main method icerisinde atama yapmadigim icin maindeki fiyat degiskeni hala 100
				
				fiyat = indirimYap10(fiyat); // artik fiyat degiskeni kalici olarak degisti
				
				indirimYap25(fiyat);
				System.out.println("Methoddan sonra main methoddaki fiyat: " + fiyat); // 100
				
				indirimYap10(fiyat);
				System.out.println("Methoddan sonra main methoddaki fiyat: " + fiyat); // 100
				// degisim yalnizcxa method scope'unda kalmis oluyor, degeri aldigimiz yerde bir degisiklik yapamamis oluyoruz

			}

			private static int indirimYap25(int fiyat) // main memthoddaki fiyat degiskeninin tuttugu 100 degerini(value) alıp buraya getirmis olduk
			{
				
				fiyat *= 0.75;
				System.out.println("%25 indirimli fiyat : " + fiyat);
				
				return fiyat;  // artik bize degisen fiyati dondurecek
				
			}

			private static int indirimYap10(int fiyat) {
				
				fiyat *= 0.90;
				System.out.println("%10 indirimli fiyat : " + fiyat);
				
				return fiyat;
				

	}

}
