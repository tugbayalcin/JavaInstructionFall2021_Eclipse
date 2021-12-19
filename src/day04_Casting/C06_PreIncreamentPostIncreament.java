package day04_Casting;

public class C06_PreIncreamentPostIncreament {

	public static void main(String[] args) {
		
		// preIncreament ve postImcreament sadece sayi++ ve sayi-- yazimi icin gecerlidir
		
		int sayi = 10;
		
		sayi++; // sayiyi arttir islemi
		sayi++;
		sayi++;
		
		System.out.println(sayi); // 13 yazdi: sayiyi yazdir islemi
		
		System.out.println(sayi++); // 13 yazdi: Bu satirda iki islem var 
									// Bunlardan biri arttirma, digeri ise yazdirma. Once yazdir sonra arttir
		
		System.out.println(sayi); // 14 yazdi: ancak sayi bu satirda 14 olmadi.
								  // Bir ust satirda yazdirma isleminden sonra sayi arttirilarak atandi ve 14 oldu
		
		// once arttirmak sonra yazdirmak istersek ++sayi ifadesini kullanmaliyiz
		// once yazdirmak sonra arttirmak istersek sayi++ ifadesini kullanmaliyiz
		
		System.out.println(++sayi); // 15 yazdi. Once arttir sonra yazdir

	}

}
