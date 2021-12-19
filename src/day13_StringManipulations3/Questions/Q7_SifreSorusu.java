package day13_StringManipulations3.Questions;

import java.util.Scanner;

public class Q7_SifreSorusu {

	public static void main(String[] args) {
		
		// Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        // isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234

		// kullanici hatasina dikkat etmeden, dogru girdigini varsayarak cozelim
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Isminizi Giriniz: ");
		String isim = scan.next(); // isminin tek kelime oldugunu kabul ediyorum
		
		System.out.println("Lutfen Soyisminizi Giriniz: ");
		String soyisim = scan.next(); // soyisminin tek kelime oldugunu kabul ediyorum
		scan.nextLine(); // hata verdigi icin bos calistirdim ve hata gitti
		
		System.out.println("Lutfen 16 karakterli Kredi Karti numaranizi dorderli gruplar halinde giriniz: ");
		String kkNo = scan.nextLine();
		
		String isimFormatli = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w","*"); 
		// ilk harfi buyuk hale getirdik ve ilk harf disindaki her seyi *** yaptik
		
		String soyisimFormatli = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w","*"); 
		
		String kkNoFormatli = "**** **** **** " + kkNo.substring(15);
		// zaten her ne girilirse girilsin benim bas kismim **** olacagi icin onu bir sabit olarak elimle yazdim ve kart nosunun son 4 rakamini sonuna ekledim
		
		
		System.out.println("İsim-Soyisim: " + isimFormatli + " " + soyisimFormatli);
		System.out.println("Kart No: " + kkNoFormatli);
		
		scan.close();
		
		
		
	}

}
