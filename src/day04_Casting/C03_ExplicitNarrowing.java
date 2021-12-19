package day04_Casting;

public class C03_ExplicitNarrowing {

	public static void main(String[] args) {
		
		// Eger buyuk data turundeki bir veriyi daha kucuk data turundeki variable'a atamak istersek
		// java bunu otomatik olarak yapmaz
		
		int sayi1 = 34;
		short sayi2 = (short) sayi1; // java dogrudan atamaya itiraz eder ve mismatch der.sonra da casting yapmayi onerir
		// biz gozumuzle goruyoruz ki 34 sayisi aslinda short icine sigar hicbir sikinti olmaz
		// ama java buyuk kovayi kucuk kovaya bosaltirken sorunlar OLABILECEGINI (olur degil olabilir) soyluyor
		// ve bizden atamaya devam edebilmek icin onay istiyor, sen bu sorumlulugu ustleneceksen ben devam edicem diyor
		// atanacak deger daima 74875936 gibi buyuk bir deger olsaydi kesinlikle sorun olurdu
		// ama 34 gibi icine sigabilecek degerler de atamak isteyebilecegimizden ve bu durumda sorun cikmayacagi icin 
		// casting yapmazsak sorun olabilir deriz.
		// 854769 gibi buyuk sayilari cast etsek bile sayimizda deger kaybi yasayabiliriz, buna birazdan deginecegiz  
		
		System.out.println("sayi2: " + sayi2); // 34 yazdirdi
		
		byte sayi3 = (byte) sayi2; // java kizdi, casting yap dedi
		System.out.println("sayi3: " + sayi3); // 34 yazdirdi
		
		int sayi4 = 140;
		short sayi5 = (short) sayi4;
		System.out.println("sayi5: " + sayi5); // sikinti yok 140 yazdi
		byte sayi6 = (byte) sayi5;
		System.out.println("sayi6: " + sayi6); // sikinti var -116 yazdirdi (hesaplamasini hoca ogretti)
		// burada deger byt'in sinirlarindan buyuk oldugu icin java int 140'i kendi yontemine gore 
		// byte'a donusturur ve bu arada bizim sayimiz DEGISIR
		
		double sayi7 = 87.3;
		int sayi8 = (int) sayi7;
		System.out.println("sayi8: " + sayi8); // 87 yazdirdi
		// Burada deger virgullu oldugundan ve integerda ondalikli kisim olmadigindan java ondalikli kismi keser
		// Dolayisi ile data kaybi olusur
		
		int sayi9 = 27;
		int sayi10 = 4;
		System.out.println(sayi9/sayi10); // burada sonucu bir degiskene atama islemi yapmadim
		// ancak isleme giren sayilarin her ikisi de int oldugundan java sonucu otomatik olarak int olarak yazar
		// burada sayilar tam bolunemese bile int'e cast edilmis gibi bir sonuc yazdirilir
		double sayi11 = 4;
		System.out.println(sayi9/sayi11); // 6,75 cikti
		// isleme giren sayilardan daha genis data turune sahip olan datanin turu sonuca verilir
		// double integerdan daha genis oldugundan sonuc double olarak cikacak
		
	}

}
