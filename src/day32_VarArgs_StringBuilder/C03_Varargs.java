package day32_VarArgs_StringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {
		
		kafanaGoreTopla(5,10,13,0);

	}
	
	private static void kafanaGoreTopla(int sayi1, int... sayilar) 
	{
		int toplam = 0;
		
		for(int each : sayilar) // i lerden olusan diziyi geziyormus gibi dusun
		{
			toplam += each;
		}
		System.out.println("Ilk Sayi Ile Digerlerinin Toplaminin Carpimi: " + sayi1 * toplam); 
		
		
	}


}
