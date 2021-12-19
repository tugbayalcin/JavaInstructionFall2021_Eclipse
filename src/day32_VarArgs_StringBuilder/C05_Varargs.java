package day32_VarArgs_StringBuilder;

public class C05_Varargs {

public static void main(String[] args) {
		
		topla(5,8,10,8,0,15 );
		// varags for each kullanarak calisir
		// varargs list gibi davranir ama array methodlari ile calisir 

	}

// varargs'dan once farkli parametreler kullanilabilir ancak
// varargs'dan sonra farkli tipte bile olsa parametre yazilamaz
// yazilirsa java vararg son parametre olmalidir diye bizi uyarir
// ve cte verir

	private static void topla(int... i) 
	{
		int toplam = 0;
		
		for(int each : i) // i lerden olusan diziyi geziyormus gibi dusun
		{
			toplam += each;
		}
		System.out.println("Girilen Sayilarin Toplami: " + toplam); 
		
		
	}

}
