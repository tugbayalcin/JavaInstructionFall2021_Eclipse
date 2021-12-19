package day19_While_DoWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {

	public static void main(String[] args) {
		
		// Soru 5: Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
		//         Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
		//		   - Sifre kucuk harf icermelidir
		//         - Sifre buyuk harf icermelidir
		//         - Sifre ozel karakter icermelidir
		//		   - Sifre en az 8 karakter olmalidir.

		
		Scanner scan = new Scanner(System.in);
		String sifre = "";
		boolean khk=false;
		boolean bhk=false;
		boolean okk=false;
		boolean uk =false;
		// ben kullanicidan bir kere degil birden fazla kez sifre alacagim icin sifre alma islemini loop icinde yapmaliyim
		// ancak scanner loop disarisinda olusturulur
		
		// kullanicidan veri alma islemlerinde do-while tercih edilir
		
		do 
		{
		System.out.println("Lutfen Bir Sifre Giriniz: ");
		sifre = scan.nextLine(); // kullanicidan dongu icinde istiyoruz ki her yanlis girdiginde dongu yeniden donsun ve yeniden isteyebilelim
		
		khk= kucukHarfKontrol(sifre);
		bhk= buyukHarfKontrol(sifre);
		okk= ozelKarakterKontrol(sifre);
		uk=  uzunlukKontrol(sifre);
		
		} 
		while(!khk || !bhk || !okk || !uk); // sifre dogru olana kadar tekrar tekrar gerceklesmesi gerekiyor
		System.out.println("Sifreniz Basarili Bir Sekilde Kaydedildi.");
		
	
		scan.close();
	}

	private static boolean uzunlukKontrol(String sifre) {
		boolean uk=false;
		
		if(sifre.length()>=8) 
		{
			uk=true;
		}
		else 
		{
			System.out.println("Sifreniz En Az 8 Karakterden Olusmalidir");
		}
		return uk;
	}

	private static boolean ozelKarakterKontrol(String sifre) {
		boolean okk=false;
		String ozelKarakterler = "!@#$^&*()_-+=/?<,>.|";
		for(int i=0; i<sifre.length(); i++) 
		{
			if(ozelKarakterler.contains(sifre.subSequence(i, i+1))) 
			{
				okk=true;
				break;
			}
		}

		if(!okk) 
		{
			System.out.println("Sifreniz en az bir ozel karakter icermelidir");
		}
		return okk;
	}

	private static boolean buyukHarfKontrol(String sifre) {
		boolean bhk = false;
		
		String harfler = "ABCDEFGHIJKLMNOPRSTUVYZQWX";
		for(int i=0; i<sifre.length(); i++) 
		{
			if(harfler.contains(sifre.substring(i,i+1))) 
			{
				bhk=true;
				break;
			}
		}
		
		if(!bhk) 
		{
			System.out.println("Sifreniz en az bir buyuk harf icermelidir");
		}
		return bhk;
		
		
	}

	private static boolean kucukHarfKontrol(String sifre) {
		boolean khk =false; // istenmeyen durum false oldugu icin false olsturduk
		
		/* birinci yol --> benim yaptigim
		for(int i=0; i<sifre.length(); i++)  // istedigim sart saglanirsa true olacak, saglanmazsa false kalmaya devam edecek
		{
			if(sifre.charAt(i)>97 && sifre.charAt(i)<122) 
			{
				khk=true;
				break; // sadece 1 tane bile kucuk harf olmasi bize yeter o yuzden ilk kucuk harfi bulur bulmaz donguden cikmasi icin break koyduk
			}
		}
		*/
		
		
	   //ikinci yol
		String harfler = "abcdefghijklmnoprstuvyzqwx";
		for(int i=0; i<sifre.length(); i++) 
		{
			if(harfler.contains(sifre.substring(i,i+1))) 
			{
				khk=true;
				break; // break kullanmamizin sebebi: soruda 1 tane kucuk harf olmasi yeterli
				// biz kucuk harfi bulduktan sonra kodu durdurmazsak gereksiz yere calismaya devam eder
				// ama bazi buyuk programlarda sonradan karsilasacagi veriler ile degeri degistirir ve bizi yaniltacak sonuca goturur
				// cunku javanin hafizasi yoktur ve en son ne buldu ise onu aklinda tutar
				// bu yuzden break; kullanimi cok onemlidir
				
			}
		}
		
		
		
		/* ucuncu yol -->regex --> calşismadi ???
		 if(sifre.contains("[a-z]")) 
		 {
		 	khk=true;
		 } 
		 */
		
		// bu satira geldigimizde sifrede kucuk harf varsa khk=true, hic kucuk harf yoksa khk=false olmus olur
		if(!khk) // eger khk yukaridan false olarak gelirse burasi calisir ve kullaniciya hatasini soyler
		{
			System.out.println("Sifreniz en az bir kucuk harf icermelidir");
		}
		return khk;
		
		
		
		
	}

}
