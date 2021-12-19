package day03_Scanner;

public class C01_VariablesHomework {

	public static void main(String[] args) {
		/*
		 * 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
		 * 2- isim ve soyisim icin iki variable olusturun ve bunlari 	
		 * 	  isminiz : Mehmet
		 * 	  soyisminiz : Bulutluoz 
		 * 	  seklinde yazdirin
		 * 3- Iki farkli tamsayi data turunde 2 variable
		 * 	  olusturun bunlarin toplamini yazdirin
		 * 4- Bir tamsayi ve bir ondalikli
		 *    variable olusturun ve bunlarin toplamini yazdirin
		 * 5– char data turunde bir variable olusturun ve yazdirin
		 * 6- Bir tamsayi, bir de char degisken olusturun
		 *    ve bunlarin toplamini yazdirin.
		 */
		
		// SORU1
		String isim = "Tugba Yalcin";
		System.out.println(isim);
		
		char ilkHarf = 'T';
		System.out.println(ilkHarf);
		
		boolean anlasildiMi = true;
		System.out.println(anlasildiMi);
		
		
		// SORU2
		String isminiz = "Tugba";
		String soyisminiz = "Yalcin";
		System.out.println("Isminiz: "+ isminiz);
		System.out.println("Soyisminiz: "+ soyisminiz);
		
		
		// SORU3
		int a = 10;
		short b = 20;
		System.out.println(a+b); // 30
		
		
		// SORU4
		int tamsayi = 7;
		float ondalikli = 3.14f;
		System.out.println(tamsayi + ondalikli); // 10.14
		
		
		// SORU5
		char harf = 'E';
		System.out.println(harf);
		
		
		// SORU6
		int sayi =25;
		char karakter = 'a';
		System.out.println(sayi + karakter); // cikti: 122 --> charlar ile matematiksel islem yapilabilir
		// char ascii tablosuna gore numeric degerler alir ve bu extra ozeelligi sayesinde islem yapilabilmesine olanak tanir
		// int + String olarak yapsa idik 25a yazardi 

	}

}
