package day04_Casting;

public class C04_CastingHomework {

	public static void main(String[] args) {
		
		/* SORU1:
				 byte veri tipinde bir degisken olusturun, short, int, float ve double data tiplerinde birer degisken olusturup
				 adim adim widening yapin ve yazdirin
				 
		   SORU2:
		   		 int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
		   		 
		   SORU3:
		   		 float data turunde bir variable olusturun ve yazdirin 
		   
		   SORU4:
		   		 double 255.36 sayisini int'e ve sonra da olusturdugunuz int sayiyi byte'a cevirip yazdirin
		   		 
		   SORU5:
		   		 int 2 sayiyi birbirine boldurun ve sayiyi yazdirin.
		   		 
		   SORU6:
		   		 int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
		   		 
		   SORU7:
		   		 Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
		*/
		
		 //CEVAP1:
			byte sayi1 = 1;
			short sayi2 = sayi1;
			int sayi3 = sayi2;
			float sayi4 = sayi3;
			double sayi5 = sayi4;
			System.out.println(sayi5);
			
			// Auto Widening (Otomatik Genisletme)'de java hata varmeden kucuk veri turunu buyuk veri turune atadi
			
		//CEVAP2:
			int degisken = 10;
			short degisken2 = (short) degisken;
			byte degisken3 = (byte) degisken2;
			byte degisken4 = (byte) degisken;
			byte degisken5 = (byte)(short)degisken; // buna gerek yok aslinda 
			// Explicit Narrowing (Manuel Daraltma)'da java otomatik yapmaz, bizden onay ister, veri kaybi olabilir sorumlulugu ben almam sen al der
			System.out.println(degisken3);
			System.out.println(degisken4);
			System.out.println(degisken5);
			
		//CEVAP3:
			float ondalikli = 3.14f;
			System.out.println(ondalikli);
			
		//CEVAP4:
			double sayi = 255.36;
			int donusmusSayi = (int)sayi;
			byte tekrarDonusum = (byte)donusmusSayi;
			System.out.println(tekrarDonusum);
			
		//CEVAP5:
			int num1 = 30;
			int num2 = 4;
			System.out.println(num1/num2);
			// Burada bolum sonucunu herhangi bir degiskene atamadik
			// Peki veri tipinin nasil olmasini bekleriz
			// isleme giren sayilarin her ikisi de int oldugu icin java sonucu otomatik olarak int kabul edecektir
			// bu bolmenin sonucu ondalikli olsa bile int e cast edilmis sekilde bir sonuc yazdirilacak
			
		//CEVAP6:
			int num3 = 30;
			double num4 = 4.0d;
			System.out.println(num3/num4);
			// Burada ise isleme giren degiskenlerin data typelari farkli
			// boyle bir durumda java sonucu otomatik olarak daha buyuk olan veri tipine atayacaktir
			// yani sonuc double olarak yazdirilacaktir
			
		//CEVAP7:
			int rakam =5;
			int rakam2 =10;
			String kelime = "kelime";
			char harf = 'A';
			
			System.out.println(rakam + rakam2 + kelime);
			System.out.println(kelime + rakam + rakam2);
			System.out.println(rakam + kelime + rakam2);
			System.out.println(kelime + (rakam + rakam2));
			System.out.println(rakam + harf);
			System.out.println(rakam + kelime + harf);
			System.out.println(rakam + harf + kelime);
			System.out.println(kelime + (rakam + harf));
			System.out.println(harf + kelime);
			
			
			

	}

}
