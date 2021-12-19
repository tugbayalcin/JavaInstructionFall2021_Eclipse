package day08_IfElseStatement;

import java.util.Scanner;

public class C07_IfElseIfQuestion7 {

	public static void main(String[] args) {
		
		// Kullanicidan 100 uzerinden notunu isteyin.
		//			Not’u harf sistemine cevirip yazdirin.
		//			50’den kucukse “D”,
		//			50-60 arasi “C”,
		//			60-80 arasi “B”,
		//			80’nin uzerinde ise “A”
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 100 uzerinden notunuzu giriniz: ");
		double not = scan.nextDouble();
		
		if (not < 0 || not>100)  
		{
			System.out.println("Lutfen gecerli bir not giriniz");
		}
		else if (not <50)
		{
			System.out.println("Notunuz: D ");
		}
		else if (not<60) // compiler bu satira geldiginde benim notumun 50'den buyuk olmama ihtimali yok, cunku yukarisi false olmus ki buraya gelmis
		{
			System.out.println("Notunuz: C"); // bu ihtimal ust satirda elimine oldu bu yuzden (not >=50 && not<60) dememe gerek yok
		}
		else if (not<80)
		{
			System.out.println("Notunuz: B");
		}
		else // else yanina condition yazilmaz
		{
			System.out.println("Notunuz: A ");
		}
		
		scan.close();
		
		// birbirine bagli olarak calisan if ler bir onceki durumu oldurerek ilerlerler
		// bir onceki durum gecerli olamadiginda sira digerine gelir
		// herhangi bir durum gerceklendiginde ise kendinden sonra gelen else if conditionlarina bakilmaz 
	}

}
