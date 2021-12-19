package day21_Scope_Arrays;

public class C02_LoopVariables {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int sayi = 10; // local variable
		
		for(int i =0; i<6; i++)  // hatta buradaki int i=0; diye olusturdugumuz variable da local degiskendir
		{
			String isim = "Ali"; // loop variable
			System.out.println(sayi + " " + isim);
		}
		
		// System.out.println(isim); --> isim local veriable oldugundan scope alani disinda kullanilamaz
		// System.out.println(i);
		
		// Loop icerisinde olusturulan variable'lar loop disinda kullanilamazlar
		// Bunun icin loop disinda da ihtiyacimiz olan bir degisken varsa loop'dan once olusturur ve emniyette kalmak icin initialize ederiz
		
		for (int i=0; i<10; i++) 
		{
			// int sayi =20; olusturamam cunku 
			// looplarin disinda, main method icinde ve yukarida tanimlanmis ayni isimde bir variable oldugu icin, o variable -'in 
			// scope'u tum maethod icerisinde gecerlidir, dolayisi ile ayni isimde bri variable olusturamam
			// cakisma var
			// System.out.println(isim);
			String isim = "Veli"; // olusturabildim
			// cunku yukaridaki isim degiskeni loop icerisinde tanimlanmisti. yani localleri dolayisiyla scope'lari farkli
			// cakisma yok
		}

	}

}
