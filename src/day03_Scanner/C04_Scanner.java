package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		
		// kullanicidan deger almak icin su 3 adim takip edilir:
		
		// ADIM 1: Scanner objesi olusturmak
		Scanner scan = new Scanner(System.in); // Scanner classini kullanmak icin import etmem gerekir
		
		// ADIM 2: Kullaniciya ne istedigimizi soylemek
		System.out.println("Lutfen Isminizi Yaziniz: ");
	
		// ADIM 3: Kullanicinin girdigi degeri alip bir degiskende tutmak
		String isim = scan.next(); // kullanicinin girdigi degeri isim adli degiskene atadim 
		System.out.println("Isminiz: " + isim);
		
		scan.close();

		// scan bir scanner objesidir
		// isim olarak farkli bir isim yazsak da calisir ama biz scan demeyi tercih ederiz
		// scan bir obje oldugu icin data turu non-primitive dir
		// primitive data turleri sadece deger icerirken,
		// non-primitive data turleri degerin yaninda methodlar da barindirir
		// scan. dedigimizde kullanabilecegimiz bu methodlari gorebiliriz
		// non-primitive methodlar da barindirir dedigimiz sey bu
		// scan bir non-primitivedir ve . ya basinca gordugumuz methodlar onun barindirdigi methodlardir
		
		
		
	}

}
