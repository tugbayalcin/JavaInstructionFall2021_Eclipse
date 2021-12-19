package day01_02_Variables;

public class C03_Variables {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		
		String sayi3 = "10";
		String sayi4 = "20";
		
		System.out.println(sayi1+sayi2); // 30 yazdirir
		System.out.println(sayi3+sayi4); // java buraya artik yazi gozuyle bakiyor 1020 yazdirir
		
		String harf1 = "A"; // buradaki A bir stringtir
		char harf2 = 'A'; // buradaki A bir chardir. Charlar ile matematiksel islemler yapilir !!!
		
		// farkli data tureri ayni degeri alabilir
		// burada onemli olan; degerin kendisini degil, deger ile yapilacak islemlerin degismesidir
		// benim icin onemli olan degerin kendisi degil turudur
		
		
		// yukaridaki degiskenleri kullanarak  30A yazdiralim:
		System.out.println(sayi1+sayi2+harf1); // 30A yazdirdi
		System.out.println(sayi1+sayi2+harf2); // 95 yazdirdi --> 30+ (A harfinin ascıı degeri:65)
		// bunun sebebi char type in ozel yapisidir
		// char type ile matematiksel islemler yapabiliriz 
		System.out.println(harf1+sayi1+sayi2); // A1020 yazdirdi, 
		// string kendinden sonra gelen her seyi stringe donusturur
		System.out.println(sayi1+harf1+sayi2); // 10A20 yazdirdi
		System.out.println(harf1+(sayi1+sayi2)); // A30 yazdirdi 
	

	}

}
