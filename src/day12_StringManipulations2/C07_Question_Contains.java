package day12_StringManipulations2;

import java.util.Scanner;

public class C07_Question_Contains {

	public static void main(String[] args) {
		
		// Kullanicidan email adresini girmesini isteyin, 
		// mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”, 
		// @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ , 
		// @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gmail adresinizi giriniz: ");
		
		String email = scan.next();
		
		int uzunluk = email.length();
		int index = email.lastIndexOf("@gmail.com");
		
		if(!email.contains("@gmail.com"))  // ! isareti ile icermemeyi kontrol ediyoruz 
		{
			System.out.println("Lutfen gmail adresinizi giriniz");
		}
		else if(index == uzunluk -10) // sonu @gmail.com mu diye bakiyor
		{
			System.out.println("Email adresiniz kaydedildi.");
		}
		else 
		{
			System.out.println("Lutfen yazimi kontrol ediniz.");
		}
		scan.close();

	}

}
