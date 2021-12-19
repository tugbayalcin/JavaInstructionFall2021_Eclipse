package day08_IfElseStatement;

import java.util.Scanner;

public class C04_IfElseQuestion4 {

	public static void main(String[] args) {
		
		// Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
		// eger uc kenar uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin. 
		// Diger durumlarda ekrana “Eskenar degil” yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz.\nIlk kenari girdikten sonra diger kenarlar icin enter'a basiniz ");
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		double kenar3 = scan.nextDouble();
		
		if((kenar1 == kenar2) && (kenar1 == kenar3)) 
		{
			System.out.println("Kenar uzunluklarini girdiginiz ucgen bir eskenar ucgendir.");
		}
		else 
		{
			System.out.println("Kenar uzunluklarini girdiginiz ucgen bir eskenar ucgen degildir. ");
		}
		
		scan.close();

	}

}
