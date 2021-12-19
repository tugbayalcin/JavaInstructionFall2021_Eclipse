package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		
		// Kullanicidan isim ve soyismini ayri ayri isteyip girilen ismi asagidaki gibi yazdiriniz:
		// girilen isim: Tugba Yalcin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Adinizi Giriniz: ");
		String isim = scan.next();
		System.out.println("Lutfen Soyadinizi Giriniz: ");
		String soyisim = scan.next();
		
		System.out.println("Girilen Isim: " + isim +" " + soyisim);
		
		// NOTE: isim kısmına direk tugba yalcin yazdigimda program sonlaniyor
		// bu istedigim bir sey degil
		// bu durum string e ozel bir durumdur
		// bir sonraki classta cozumunu gorecegiz
		scan.close();
		

	}

}
