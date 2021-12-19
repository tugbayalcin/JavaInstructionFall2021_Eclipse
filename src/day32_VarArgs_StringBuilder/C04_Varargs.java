package day32_VarArgs_StringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
		
		kafanaGoreIslemYap(5,10,13,0);
		
		// varargs'da hic eleman olmasa da java itiraz etmez 
		// once int olarak tanimlanan sayilari eslestirir
		// kalan tum sayilari varargs'a doldurur 

	}
	
	private static void kafanaGoreIslemYap(int sayi1, int sayi2, int sayi3, int sayi4,  int... sayilar) 
	{
		// 4 tane int sayi ve 1 varargs girersek mevcut durumda args'a hiclik kaldi ama zaten varargs esnek oldugu icin hiclik de alabilir
		// ancak 1 integer daha eklersem sikinti olur, java itiraz eder
		
		int toplam = 0;
		
		for(int each : sayilar) // i lerden olusan diziyi geziyormus gibi dusun
		{
			toplam += each;
		}
		System.out.println("Ilk Sayi Ile Digerlerinin Toplaminin Carpimi: " + sayi1 * toplam); 
		// sayi 2'yi hicbir yerde kullanmadik, islevsiz olmus oldu
		
		
	}

}
