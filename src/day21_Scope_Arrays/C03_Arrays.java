package day21_Scope_Arrays;

public class C03_Arrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Soru1: Elemanlari "Ali", "Veli", "Ayse" ve "Fatma" olan bir array olusturun ve bu array 
		
		String arr[] = new String[3];
		
		arr[0] = "Ali";
		arr[1] = "Veli";
		arr[2] = "Ayse";
		arr[3] = "Fatma";
		
		String arr2[] = {"Ali", "Veli", "Ayse", "Fatma"}; // 2.yol
				
				
				
	// Soru 2: Soru1'deki elemanlardan "Ali" yerine "Can", "Ayse" yerine "Gul" atayin
		
		arr[0] = "Can";
		arr[2] = "Gul";
				
		System.out.println(arr2[1]);
		
		// son elemani yazdiralim;
		System.out.println(arr[arr.length-1]); // Stringdeki length() idi, burada sadece length !!
		
		// System.out.println(arr[arr.length]); // index sinirlarin disinda hatasi verir 

	}

}
