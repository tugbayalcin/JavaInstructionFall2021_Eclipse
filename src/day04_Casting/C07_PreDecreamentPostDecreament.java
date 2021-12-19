package day04_Casting;

public class C07_PreDecreamentPostDecreament {

	public static void main(String[] args) {
		
		int sayi = 10;
		
		sayi--;
		
		System.out.println(sayi); // 9 yazdi
		
		int a = sayi--; // once atadi sonra eksiltti 
		System.out.println(a); // 9 yazdi
		System.out.println(sayi); // 8 yazdi
		
		System.out.println(--a); // 8 yazdi : once azaltti sonra yazdirdi
		

	}

}
