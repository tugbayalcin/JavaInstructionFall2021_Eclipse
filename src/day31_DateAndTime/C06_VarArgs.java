package day31_DateAndTime;

public class C06_VarArgs {
	
	public static void main(String[] args) { 
		
		// Verilen sayilari toplayan bir method olusturmak istiyorum
		
		
		int a= 10;
		int b= 20;
		int c= 30;
		int d= 30;
		int e= 30;
		int f= 30;
		
		topla(a,b);
		
		// peki ben bu methodu kullanarak 3 sayi toplamak istersem ne olur
		
		topla(a,b,c);
		
		// hata veriri cunku bu method yalnizca 2 parametre kabul eder
		// benden yeni bir method olusturmami veya parametrelerden birini silmemi ister
		
		// su ana kadar gordugumuz tekniklerle degisken sayida parametreli tek bir method olusturamayiz
		// simdi var arg ile bir method olusturalim
		topla(a,b); // iki sayinin toplami :30
		topla(a,b,c); // uc sayinin toplami : 60
		topla(a,b,c,d); // varargs calisir
		topla(a,b,c,d,e); // varargs calisir
		topla(a,b,c,d,e,f); // varargs calisir
		
		// varargs: variaty arguments (cesitlilik demek)
		// var args diyor ki bana yeter ki int dger gonder kac tane gonderirsen gonder(hangi data turunu girersen onu ister)
		
		
		
		
		
	}
	private static void topla(int... a) 
	{
		System.out.println("varargs calisti");
	}
private static void topla(int a, int b, int c) {
		
		System.out.println("Uc Sayinin Toplami : " + (a+b+c));
		
	}

	private static void topla(int a, int b) {
		
		System.out.println("Iki Sayinin Toplami : " + (a+b));
		
	}

}
