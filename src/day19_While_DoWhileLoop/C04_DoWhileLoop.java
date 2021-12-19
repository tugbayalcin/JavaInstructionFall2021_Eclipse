package day19_While_DoWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {
		
		int i=0;
		
		
		while (i<5) 
		{
			System.out.print(i + " ");
			i++;
		}
		// bu kod tam 6 kere kontrol yapacak. 6. kontrol 5<5 kontrolu oldugundan yazdirma ve arttirma yapmayacak, ancak kontrol yapildi
		
		//-----------------------------------------
		int a=0;
		do 
		{
			System.out.print(a + " ");
			a++;
		}
		while(a<5);
		// bu kod tam 5 kere kontrol yapacak
		
		//-----------------------------------------
		// While loop once kontrol eder sonra kodu calistirir
		// Loop icinde artis yapilsa da bir sonraki kontrole kadar kod calismaya devam eder
		// Bu da bazi durumlarda hatali sonuclara ulasmamiza sebep olabilir
		
		// do-while loop is eonce islemi yapar ve sonra sarti kontrol eder
		// ozellikle kullanicidan deger almalarda do-while loop tercih edilir. 
		// cunku once deger alir ardindan degere gore islem yapar 
			

	}

}
