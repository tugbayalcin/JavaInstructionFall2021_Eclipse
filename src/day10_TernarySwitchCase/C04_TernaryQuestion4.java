package day10_TernarySwitchCase;

import java.util.Scanner;

public class C04_TernaryQuestion4 {

	public static void main(String[] args) {
		
		// Kullanicidan bir sayi alin. Sayi pozitifse "Sayi pozitiftir" yazdirin. Negatifse sayinin karesini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz: ");
		int sayi = scan.nextInt();
		
		System.out.println( (sayi>0) ? "Sayi Pozitiftir" : (sayi*sayi));
		scan.close();
		
		// sayi>0 ? System.out.println("Sayi Pozitiftir") : System.out.println(sayi*sayi) ;
		// yazamayiz. hata verir. 
		// goruyoruz ki ternary icine en basitinden bir sout bile yazamiyoruz
		// dolayisi ile ternary'de direct sonuc veya sonuc dondurecek bir islem yapabiliriz

	}

}
