package day10_TernarySwitchCase;

public class C09_SwitchCase {
	public static void main(String[] args) 
	{
		
		// gun numarasina gore, girilen gunun haftaici veya hafta sonu oldugunu yazdiralim
		

		int gunNo = 2;
		
		switch(gunNo) 
		{
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
			System.out.println("Haftaici");
			break;
		case 6: 
		case 7: 
			System.out.println("Haftasonu");
			break; 
		default:
			System.out.println("Lutfen Gecerli Bir Gun Numarasi Giriniz: ");
		}
		
		// Burada case1 calissa bile icinde break olmadigi icin case5'e kadar calisacak ve case5 icindeki break i gordukten sonra bitirecek
		// veya case6 ya geldi, yine ayni sekilde icinde break olmadigi icin case7 den devam edecek yazdiracak ve break gorunce cikacak

	}
	
}
