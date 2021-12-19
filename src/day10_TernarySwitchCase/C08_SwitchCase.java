package day10_TernarySwitchCase;

public class C08_SwitchCase {

	public static void main(String[] args) {
		
		// gun numarasina gore gun isimlerini yazdiralim
		
		int gunNo = 2;
		
		switch(gunNo) // switch neye gore, hangi degiskene gore calisacak onu yaziyoruz, buraya yazdigim sayi compiler a baslangic noktasini soyler
		{
		case 1: 
			System.out.println("Pazartesi");
			break; // compiler a nerede durmasi gerektigini soyleyen komut
		case 2: 
			System.out.println("Sali");
			break; // eger case 2 ye girdiysen buraya geldiginde switch'den cik diyor
		case 3: 
			System.out.println("Carsamba");
			break;
		case 4: 
			System.out.println("Persembe");
			break;
		case 5: 
			System.out.println("Cuma");
			break;
		case 6: 
			System.out.println("Cumartesi");
			break;
		case 7: 
			System.out.println("Pazar");
			break; 
		default:
			System.out.println("Lutfen Gecerli Bir Gun Numarasi Giriniz: ");
			// buraya break yazmana gerek yok, cunku switch icinde baska kod kalmadi, burasi calisinca zaten switch bitecek	
			// default olmasa idi de case 7 ye break yazmana gerek olmayacakti
			
			// kod cok temiz ve anlasilir oldu :)
				
				
		} // switch case sonu

	} // main method sonu

} // class sonu 
