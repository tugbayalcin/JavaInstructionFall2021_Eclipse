package day10_TernarySwitchCase;

public class C11_SwitchCase {

	public static void main(String[] args) {
		
		// Verilen sayiyi asagidaki durumlara gore inceleyin;
	    // Girilen sayi
		// 10 ise “Iki basamakli en kucuk sayi 
		// 100 ise “uc basamakli en kucuk sayi”
		// 1000 ise “dort basamakli en kucuk sayi”
		// diger durumlarda “Girdigin sayiyi degistir” yazdirin
		
		int sayi = 15;
		
		switch(sayi) 
		{
		case 10:
			System.out.println("Iki Basamakli En Kucuk Sayi");
			break;
		case 100:
			System.out.println("Uc Basamakli En Kucuk Sayi");
			break;
		case 1000:
			System.out.println("Dort Basamakli En Kucuk Sayi");
			break;
		default:
			System.out.println("Sayiyi Degistiriniz");

		}

	}

}
