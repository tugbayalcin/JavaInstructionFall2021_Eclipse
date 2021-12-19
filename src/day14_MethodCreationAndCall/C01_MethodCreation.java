package day14_MethodCreationAndCall;

public class C01_MethodCreation {

	public static void main(String[] args) {
		
		// verilen iki sayinin toplamini ve carpimini yapıp yazdiran iki ayri method olusturun
		
		// method olusturmak icin 4 adim takip edelim
		// 1.ADIM: method call yazalim
		// 2.ADIM: method'a arguman yazacak miyiz karar verelim
		
		
		int sayi1 = 4;
		int sayi2 = 5;
		toplama(sayi1, sayi2); // method call and add argumans
		// 3.ADIM: 1. ve 2. adimlari yaptiktan sonra java'dan yardim alip method olustururuz
		
	}

	public static void toplama(int sayi1, int sayi2) {
	
		// 4.ADIM: erisim belirleyici ve return type'a karar verilmeli
		// erisim belirleyici (access modifier): public yaptik
		// return type: bizden sadece ayzdirma istedigi icin void kalabilir
		System.out.println("Sayilarin toplami: " + (sayi1+sayi2));
		
	}

}
