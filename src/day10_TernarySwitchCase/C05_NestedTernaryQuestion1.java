package day10_TernarySwitchCase;

public class C05_NestedTernaryQuestion1 {

	public static void main(String[] args) {
		
		// EMEKLILIK SORUSU
		// Eğer çalışan kadınsa 60 yaşından büyük olduğunda emekli olabilir,
		// Çalışan erkekse 65 yaşından büyükse emekli olabilir.
		
		// nested ternary ile yapalim
		
		// her seferinde scanner olusturmak yerine test datalarimizi variable olarak da olusturabiliriz
		// ve kod yazimi bittiginde bu test datalarini degistirerek kodlarimizi test edebiliriz
		
		char cinsiyet = 'K';
		int yas = 57;
		
		String sonuc = cinsiyet == 'K' ? (yas >=60 ? "Emekli olabilirsin" : "Emekli olamazsin") : 
										 (yas >=65 ? "Emekli olabilirsin" : "Emekli olamazsin") ;
		
		System.out.println(sonuc);
		// Burada kullanicidan veri almadik ama sonuc yazdirildi
		// cunku biz yukarida test datalari tanimladik
		// farkli sonuclari denemek icin burada atadigimiz degerleri degistirerek programi yeniden calistiririz
		
		

	}

}
