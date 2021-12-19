package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		
		// Scanner isleminde String icin 2 method vardir
		// scan.next() dedigimizde sadece 1 kelime alir (ilk space e kadar)
		// eger kullanicidan daha fazla kelimeli bir veri gelme ihtimali varsa
		// scan.nextLine() methodunu kullanmaliyiz
		
		// Kullanicidan isim ve soyismini ayri ayri isteyip girilen ismi asagidaki gibi yazdiriniz:
				// girilen isim: Tugba Yalcin
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Lutfen Adinizi Giriniz: ");
				String isim = scan.nextLine();
				System.out.println("Lutfen Soyadinizi Giriniz: ");
				String soyisim = scan.nextLine();
				
				System.out.println("Girilen Isim: " + isim +" " + soyisim);
				scan.close();
			

	}

}
