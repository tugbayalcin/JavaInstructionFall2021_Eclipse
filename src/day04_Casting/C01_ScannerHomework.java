package day04_Casting;

import java.util.Scanner;

public class C01_ScannerHomework {

	public static void main(String[] args) {
		
		
	// SORU1: Kullanicidan iki tam sayi alip bu sayilarin toplam, fark ve carpimlarini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Birinci Sayiyi Yaziniz: ");
		int sayi1 = scan.nextInt(); // integer deger almak istedigim icin nextInt() methodunu kullandim
		System.out.println("Lutfen Ikinci Sayiyi Yaziniz: ");
		int sayi2 = scan.nextInt();
		System.out.println("Girilen Sayilarin Toplami: " + (sayi1+sayi2));
		System.out.println("Girilen Sayilarin Farki: " + (sayi1-sayi2));
		System.out.println("Girilen Sayilarin Çarpimi: " + (sayi1*sayi2));
		scan.close();
		
	// SORU2: Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayin
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Karenin bir kenarinin uzunlugunu giriniz: ");
		int kenarKare = scan2.nextInt();
		int alanKare = kenarKare*kenarKare;
		int cevreKare = kenarKare*4;
		System.out.println("Kenari verilen karenin alani: " + alanKare);
		System.out.println("Kenari verilen karenin cevresi: " + cevreKare);
		scan2.close();
		
	// SORU3: Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin.
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Lutfen yaricap degerini giriniz: ");
		double yaricap = scan3.nextDouble();
		double cevreCember = 2*Math.PI*yaricap; // pi yerine direk 3,14 yazabilirdin
		double alanDaire = Math.PI*yaricap*yaricap; // ben Math classini bildigim icin bu sekilde kullandim
		System.out.println("Yaricap bilgisi girilen cemberin cevresi: " + cevreCember);
		System.out.println("Yaricap bilgisi girilen dairenin alani: " + alanDaire);
		// Note: Double dan kaynaklanan bir hassasiyet problemi vardir.
		// yaricap 10, pi 3,14 girseydik bile sonuc 32,8 olmasina ragmen 32,8000004 gibi bir deger yazdirir
		// 2*5 islemine 10 yazmak yerine 9,99999 gibi bir deger yazar
		// bunun cozumunu ilerleyen zamanlarda ogrenecegiz
		
		scan3.close();
		
	// SORU4: Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip 
	//        prizmanin hacmini hesaplayip yazdirin.
		Scanner scan4 = new Scanner(System.in);
		System.out.println("Lutfen kisa kenar uzunlugunu giriniz: ");
		int kisaKenar = scan4.nextInt();
		System.out.println("Lutfen uzun kenar uzunlugunu giriniz: ");
		int uzunKenar = scan4.nextInt();
		System.out.println("Lutfen yuksekligi giriniz: ");
		int yukseklik = scan4.nextInt();
		int hacim = kisaKenar*uzunKenar*yukseklik;
		System.out.println("Kenar ve yukseklik bilgileri verilen dikdortgenler prizmasinin hacmi :" + hacim);
		scan4.close();
		
	// SORU5: Kullanicidan ismini ve soyismini isteyip asagidaki gibi yazdirin:
	//		  Isminiz: Tugba
	//  	  Soyisminiz: Yalcin
	//		  Kursumuza katiliminiz alinmistir, tesekkur ederiz.
		Scanner scan5 = new Scanner(System.in);
		System.out.println("Lutfen Adinizi Giriniz: ");
		String isim = scan5.nextLine();
		System.out.println("Lutfen Soyadinizi Giriniz: ");
		String soyisim = scan5.nextLine();
		System.out.println("Isminiz: " + isim + "\n" + 
							"Soyisminiz: " + soyisim + "\n" + 
							"Kursumuza katiliminiz alinmistir, tesekkur ederiz.");
		scan5.close();
	
	// SORU6: Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin:
	//		  isim - soyisim: Tugba Yalcin
		Scanner scan6 = new Scanner(System.in);
		System.out.println("Lutfen Adinizi Giriniz: ");
		String isim1 = scan6.nextLine();
		System.out.println("Lutfen Soyadinizi Giriniz: ");
		String soyisim1 = scan6.nextLine();
		System.out.println("Isim-Soyisim: " + isim1 + " " + soyisim1);
		scan6.close();
		
	// SORU7: Kullanicidan ismini alip, isminin bas harfini yazdirin.
		Scanner scan7 = new Scanner(System.in);
		System.out.println("Lutfen Adinizi Giriniz: ");
		// String isim2 = scan7.nextLine(); // bu ve bir alt satiri kendim yazdimdi
		// System.out.println(isim2.substring(0,1)); Bunu bildigim icin ben yaptim
		char ilkHarf = scan7.next().charAt(0); // hocanin yaptigi
		// Ben bir char bekliyorum, ve degiskenimi buna gore olusturuyorum ancak uygun methodlar arasinda 
		// nextChar() yok.
		// String bir non-primitive dir. 
		// scan7.next() bir Stringtir. String non-primitivbe diye . koydugumda methodlari getiriyor
		// en basta charAt() geliyor ve icine index girmemiz isteniyor.
		// Bu su demek: girilen indexteki char'i getir (ingilizcede at kelimesi -de,-da demektir)
		// indexler 0'dan basladigi icin ve ilk harfi istedigimiz icin indexe 0 yazdik
		System.out.println("Isminizin Ilk Harfi: " + ilkHarf);
		scan7.close();
		
		
		
		
		
		
		
	}

}
