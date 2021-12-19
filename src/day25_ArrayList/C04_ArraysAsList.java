package day25_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		
		// Verilen array'i arrays classindan yardim alarak list'e cevirebiliriz
		
		String arr[] = {"A","b","C","d"};
		
		List<String> arraydenList = Arrays.asList(arr);
		
		System.out.println(arraydenList);
		
		// arraydenList.add("F"); // RTE verdi : UnsupportedOperationException --> Desteklenmeyen islem 
		// CTE olmasi icin syntax'de bir hata olmasi lazimdi ancak bu yazimda syntax hatasi yok
		
		
		// Bu sekilde Arrays classindan yardim alarak array'i list'e cevirirsek olusturdugumuz listin boyutu sabit olur
		// Dolayisiyla add() methodu veya remove() veya clear() gibi methodlari calistirmak istersek 	
		//  UnsupportedOperationException --> Desteklenmeyen islem  hatasi aliriz 
		
		arr[1] = "Z";
		System.out.println("Array'i degistirdikten sonra array =  " + Arrays.toString(arr));
		System.out.println("Array'i degistirdikten sonra list =  " + arraydenList); 
		// biz listi degistirmedidimiz halde, array'i degistirdigimiz zaman liste degisiyor (referanslari esit oldugundan boyle oluyor)
		
		arraydenList.set(3, "D"); // listte degisiklik yapalim 
		System.out.println("List'i degistirdikten sonra array =  " + Arrays.toString(arr));
		System.out.println("List'i degistirdikten sonra list =  " + arraydenList); 
		
		
		

	}

}
