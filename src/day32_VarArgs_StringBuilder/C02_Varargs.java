package day32_VarArgs_StringBuilder;

public class C02_Varargs {

	public static void main(String[] args) {
		
		topla(5,8,10,8,0,15);
		// varags for each kullanarak calisir
		// varargs list gibi davranir ama array methodlari ile calisir 

	}

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
