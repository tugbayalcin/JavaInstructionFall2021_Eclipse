package day05_MatematikselIslemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {
		
		System.out.println(4*(2+5)/2); // 14 yazdirdi
		
		System.out.println(4*(2+5)/3); // 9 yazdirdi virgulden sonraki kismi yazmadi integer olarak sonucu dondurdu 
									   // cunku isleme girenler int, java otomatik olarak sonucu da int yapar
		
		// sonucu ondalikli olarak yazdirnak istedigimde
		
		double sonuc = 4*(2+5)/3;
		System.out.println(sonuc); // 9.0 yazdi
		// assignement isleminde once dger hesaplanir sonra atama yapilir
		// yani once integer olarak sonucu bulup double degiskene atamis oldu, auto widening yapti
		// bizim islemi double degerler ile yaptirmamiz lazim
		
		sonuc = (double)(4*(2+5)/3); // burada islemin sonucu atama yapilmadan once hesaplanip cikan int deger double a casting edildi 9.0 yazdi
		System.out.println(sonuc);
		
		sonuc = (double)4*(2+5)/3; // burada yalnizca 4 u double yaptik, 4.0 da yazabilirdik
		// ancak genellikle verilerimizi kullanicidan aldigimiz icin kullanicinin 4.0 girdiginden emin olamayiz
		// bu yuzden kodumuzu bu sekilde yazmak daha kesin ve hatasiz sonuca goturur
		// iki farkli tipte veriyi isleme sokarsak sonuc buyuk veri tipinde olurdu
		// yani integer ile double i isleme sokarsak sonuc double olur
		System.out.println(sonuc); // 9.333333333334 yazdi

	}

}
