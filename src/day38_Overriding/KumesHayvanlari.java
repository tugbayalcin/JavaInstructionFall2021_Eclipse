package day38_Overriding;

public class KumesHayvanlari extends Kuslar {

	public static void main(String[] args) {
		
		KumesHayvanlari kms1 = new KumesHayvanlari();
		kms1.beslenme(); // Tum Hayvanlar Beslenir
		kms1.hareket(); // Kumes Hayvanlari Yuruyerek Hareket Eder
		kms1.solunum(); // Kuslar Akcigerleri Ile Nefes Alir 
		
		Kuslar kms2 = new KumesHayvanlari();
		kms2.beslenme(); // Tum Hayvanlar Beslenir
		kms2.hareket(); // Kumes Hayvanlari Yuruyerek Hareket Eder !!!! ??? surpriiiisee 
		kms2.solunum(); // 
		
		/* ************************************************** 
		 * Data type'da override edilen bir method varsa
		 * ve de constructor() im, methodu override eden classtan alinmissa
		 * kms2 kuslar clasinin methodlarina bakar ancak overridedan dolayi methodu override eden classa gider ve oradaki haliyle calistirir
		 */
		
		Kuslar kms3 = new Kuslar();
		kms3.beslenme(); // Tum Hayvanlar Beslenir
		kms3.hareket(); // Kuslar Ucarak Hareket Eder
		kms3.solunum(); // Kuslar Akcigerleri Ile Nefes Alir 
		
		
		Animals kms4 = new KumesHayvanlari();
		kms4.beslenme(); // Animals'dan alacagim dedi --> Tum Hayvanlar Beslenir --> Animals'dan aldi
		kms4.hareket(); // Animals'dan alacagim dedi --> Kumes Hayvanlari Yuruyerek Hareket Eder --> Teeee en alttan kumes hayvanlarindan aldı cunku iki clasta da overriding var
		kms4.solunum(); // Animals'dan alacagim dedi --> Kuslar Akcigerleri Ile Nefes Alir --> bir alt classtan aldi cunku sadece oraya kadar overriding var
		
		// variable'lar icin overriding mumkun degildir
		// variable'lar icin overriding olmadigi icin data type classindan baslayarak yukari dogru gider
		// ancak methodlarda overriding olabilecegi icin data type dan asagidaki classlara da inebilir dikkatli olmak gerek !! 
		// overriding = spesifik ozelligi one cikarmak
		
		// data turunu farkli secersek ozellikleri genellestirir ve kısıtlariz
		// overriding ile spesifik ozellikleri kaybetmez ve one cikaririz
		
		

	}
	
	public void hareket() 
	{
		System.out.println("Kumes Hayvanlari Yuruyerek Hareket Eder");
	}
	
	
	
	

}
