package day10_TernarySwitchCase;

public class C06_NestedTernaryQuestion2 {

	public static void main(String[] args) {
		
		// verilen harfi  sagidaki kosullara gore inceleyin+
		// kucuk harf ise consola “Kucuk Harf” , 
		// buyuk harfse consola “Buyuk Harf” 
		// yoksa “girdiginiz karakter harf degil” yazdirin.
		
		char krk = 's'; 
		
		String sonuc = (krk >= 'a' && krk <= 'z') ? "Kucuk Harf" :  // sart dogru ise bu satir calisacak, degilse bir alt satirdaki ternary calistirilacak
					  ((krk >= 'A' && krk <= 'Z') ? "Buyuk Harf" : "Harf Degil"); // sart yanlıs olup compiler bu satira geldiginde yeni bir ternary ile karsilasti
		// yeni ternaryi kosuluna gore calistiracak
		// ancak bu kod cok okunakli bir kod degildir
		
		System.out.println(sonuc);

	}

}
