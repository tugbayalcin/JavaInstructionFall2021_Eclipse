package day04_Casting;

public class C05_IncreamentDecreament {

	public static void main(String[] args) {
		
		// atama islemi olursa sayinin degeri kalici olarak degisir
		// atama islemi olmadan yapilan toplama, cikarma etc gibi islemler yalnizca bulundugu satirda 
		// gecerli olur ve sayinin degerini kalici olarak degistirmez
		
		int sayi1 =10;
		
		System.out.println(sayi1+=5); // 15 yazdi --> = varsa atama var, kalici degisiklik var
		
		System.out.println(sayi1); // 15 yazdi, yani sayi1 temelli degisti
		// = isareti icerdigi icin kodumuz sayi1 in degerini 5 arttirip sayi1 degiskenine ATİYOR(ASSIGNE EDIYOR)
		// Dolayisiyla sayi1'in degeri kalici olarak degisiyor
		
		System.out.println(sayi1 + 12); // 27 yazar ama kalici olmaz, sayi1 degismedi, cunku = ile atama yapilmadi
		
		sayi1++;
		System.out.println(sayi1); // 16 yazdi. Burada = ile atama yapilmadigi halde sayiya atama yapildi
		// Bu durum ++ islemine tanimlanan ozel bir durumdur, ++ islemi assign eder ve kalici degisiklik yapar 

	}

}
