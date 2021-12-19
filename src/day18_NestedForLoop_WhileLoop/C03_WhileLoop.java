package day18_NestedForLoop_WhileLoop;

public class C03_WhileLoop {

	public static void main(String[] args) {
		
		// 20'den 30'a kadar olan sayilari (20 ve 30 dahil) while loop ile yazdirin
		
		// for ile
		
		for(int j=20; j<=30; j++) // Burada 1;2;3 olarak numaralandirir isek
		{
			System.out.print(j + " ");
		}
		// while'da 1 ve 3 yer almaz. Dolayisi ile baslangic kosulunu ve artis miktarini bizim kendimiz manuel olarak girmemiz gerekir
		System.out.println();
		
		int i=20; // for loop'daki 1. kısım. Mutlaka while'dan once tanimlamalisin
		while(i<=30) 
		{
			System.out.print(i + " ");
			i++; // for loop'daki 3. kisim. burayi yazmazsan sonsuz loop olur !!! Dikkat
		}
		// for loop ile cozulebilecek sorulari while loop ile cozersek kodumuzu uzatmis oluruz
		
	}

}
