package day40_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputString {
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		// Java'da bir dosyaya ulasmak istedigimizde FileInputStream Class'indan yardim aliriz.
		
		FileInputStream fis = new FileInputStream("src/day40_Exceptions/yazi.txt");
		
		// java bu kodda olasi bir problem ongoruyor ve bu probleme karsi ne yapmasi gerektigini bize soruyor
		// yani alti cizilen her kod CTE degildir 
		
		// bunun icin 2 durum soz konusudur
		
		// 1. try-catch kullanarrak bu problemi handle edio java'nin yoluna devam etmesini saglayabiliriz
		
		// 2. Eger dosya okunamiyorsa kod calismasin istiyorsak o zaman olayin farkinda oldugumuzu 
		// ve sorumlulugun bizde oldugunu java'ya soylemeliyiz
		
		System.out.println("Gorev Tamamlandi"); 
	}

}
