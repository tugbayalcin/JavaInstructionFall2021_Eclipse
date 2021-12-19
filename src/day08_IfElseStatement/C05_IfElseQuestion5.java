package day08_IfElseStatement;

import java.util.Scanner;

public class C05_IfElseQuestion5 {

	public static void main(String[] args) {
		
		// 2 durum var if else ile yap
		
		// Kullanicidan gun ismini yazmasini isteyin
		// Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3. harflerini ilk harf bbuyuk diegr ikisi kucuk olarak yazdirin
		// gun ismi gecerli degilse "Gecerli Gun Ismi Giriniz." yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir gun ismi giriniz: ");
		String gun = scan.next().toLowerCase();
		
		
		if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma") || gun.equals("cumaretsi") || gun.equals("pazar") ) 
		{
			System.out.println("" + gun.toUpperCase().charAt(0) + gun.charAt(1) + gun.charAt(2));
		}
		else 
		{
			System.out.println("Lutfen Bir Gun Ismi Giriniz: ");
		}
		
		scan.close();

	}

}
