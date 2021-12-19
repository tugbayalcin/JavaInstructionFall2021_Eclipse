package day40_Exceptions;

public class C07_NumberFormatException {

	public static void main(String[] args) {
		
		String str = "123a"; // run time da olusur 
		
		int sayi = Integer.parseInt(str) + 4;
		
		System.out.println(sayi);

	}

}
