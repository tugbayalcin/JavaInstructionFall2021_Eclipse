package day18_NestedForLoop_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		
		// Kullanicidan toplanmak uzere sayi isteyin.
		// Kullanici 0'a basincaya kadar sayilari alip toplamaya devam edin
		// Kullanici 0'a bastiginda, o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin
		
		// Bu soru for ile cozulemez
		
		// eger kullanicidan 5 sayi al dese for ile yapariz ancak bizim sorumuzda kullanicinin kac deger girecegi belli degil
		for(int i=1; i<=5; i++) 
		{
			// Kullanicidan bir deger alip, toplama eklerim
		}
		
		Scanner scan = new Scanner(System.in); 
		// her seferinde obje olusturmak istemedigimiz icin objeyi looptan once olusturup loop icerisinde kullaniriz
		// loop'un icinde kullanacagim object ve variable'lari looptan once olusturmak daha guzeldir.
		// Cunku loop icerisinde olusturursak loop her dondugunde yeni bir object veya variable olusturur ve bu da hafizayi doldurur
		
		int sayi =100; // 0 haricinde istedigin sayiyi gir, bizim icin kritik nokta 0 olmasi ya da olmamasi
		int toplam =0;
		int sayac=0;
		
		while(sayi !=0) 
		{
			System.out.println("Lutfen Toplama Eklemek Icin Bir Tamsayi Yaziniz:\nBitirmek Icin 0'a Basiniz.");
			sayi=scan.nextInt();
			toplam+= sayi;
			sayac++;
		}
		// kullanici 0'a bastiginda loop islevini son kez yapip basa donecek ve loop bitecek
		
		System.out.println(sayac-1 + " Adet Sayi Girisi Gerceklestirildi."); // 0' basisini saymamak icin -1 dedik
		System.out.println("Girilen Sayilarin Toplami = " + toplam);
		
		
		
		scan.close();
	}

}
