package day03_Scanner;

public class C03_SwapVariables2_IQ2 {

	public static void main(String[] args) {
		
		// interview question
	    // 2- Verilen sayi1 ve sayi2 variable’larinin degerlerini 
        //    3.bir variable olmadan degistiren (SWAP) bir program yapiniz
        
        int sayi1=15;
        int sayi2=20;
        
        // baslangicta sayi1=15 ve sayi2=20
        
        
        System.out.println("Baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
        
        // ucuncu bir variable kullanmayacaksak, verilen iki sayinin farkindan faydalanabiliriz
        
        // ilk adim: olarak sayilarin farkini ilk sayiya assign etmek
       
        sayi1 = sayi1 - sayi2; // sayi1 su anda -5 oldu
        
        // ikinci adim: fark ile sayi 2 yi toplayip sayi2'ye assign etmek
        
        sayi2 = sayi1+ sayi2; // sayi2 su anda 15
        
        // ucuncu adim: sayi1'e sayi2-fark atamak
        
        sayi1 = sayi2-sayi1; // sayi1 e sayi2-fark atadim sayi1 su anda 15-(-5)=20 var
        
        System.out.println("Son durumda sayi1=" + sayi1 + " ve sayi2=" + sayi2);

	}

}
