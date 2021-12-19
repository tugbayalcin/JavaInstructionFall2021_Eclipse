package day04_Casting;

public class C02_AutoWidening {

	public static void main(String[] args) {
		
		byte sayi1 = 44;
		short sayi2 = sayi1; // sayi1'in tuttugu deger sayi2'nin icine atildi
		
		// Burada esitligin sol tarafi short, sag tarafi ise byte
		// iki data turu farkli oldugu halde java itiraz etmiyor
		// cunku atama yapilan variable'in data type'i short, atanan degerin data type'i byte'dan buyuk 
		// oldugundan sorun olusmaz
		
		// kucuk = buyuk; yapmaya calistiginda java sana miss matching yapiyorsun der, casting yap der
		// buyuk = kucuk; yaptiginda kucuk kovayi buyuk kovaya bosaltiyorsun, kendine her halukarda yer bulacak
		
		System.out.println("sayi2: " + sayi2); // 44 yazdirdi
		
		
		int sayi3 = 55;
		double sayi4 = sayi3; // java itiraz etmedi
		System.out.println("sayi4: " + sayi4); // 55.0 yazdirdi, double formatinda oldugu icin ondalikli gosterdi
		
		// Bu olaya (kucugu buyuge atamaya) auto widening denir.
		

	}

}
