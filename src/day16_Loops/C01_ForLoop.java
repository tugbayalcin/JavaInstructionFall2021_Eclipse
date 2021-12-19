package day16_Loops;

public class C01_ForLoop {

	public static void main(String[] args) {
		
		// 1) Standart calisan loop
		
		for (int i =0; i<=10; i++) 
		{
			System.out.print(i + " "); // ln i sildik ki alt alta degil yan yana yazdirsin
		}
		
		// for loop: baslangic ve bitis sarti bir sayinin degerine bagli olan durumlarda tercih edilir
		
		/* 2) Sonsuz loop
		 * SONSUZ DONGU
		for(int i =0; i<10; i--) 
		{
			System.out.print(i + " ");
		}
		
		Eger baslangic sayisi artis azalis ile bitis degerine yaklasmiyor, uzaklasiyor ise loop hicbir zaman durmaz
		Bu duruma sonsuz loop denir ve gerceklesmesi pek de istenmez 
		*/

		// 3) Çalısan ama hicbir sey yapmayan loop
		for (int i =0; i>10; i++) 
		{
			System.out.print(i + "Acaba Calisir Mi ");  // calismadi, cunku ilk durum olan i=0 durumunda condition false oldugu icin body 
			// icine girilmez, dolayisi ile body sonrasinda calisan increament-decreament asla calismaz. Bu block olu dogmustur
			
			// eger ilk deger iicn bitis sarti true olmazsa daha ilk adimda loop broken olur, dolayisiyla loop body hic calismadan
			// loop'un sonrasina gecilir
			// loop CALISIR, ama hicbir islem YAPMAZ !!! 
		}
	}

}
