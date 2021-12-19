package day25_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
		
		// verilen bir array'de tekrar eden elementleri sadece birer tane yazarak unıque elementlerden olusan bir array haline getirelim
		
		int arr[] = {2,3,4,5,3,6,2,5,3,7,4,8,5,9,1,0,3,5};
		
		// 2,3,4,5,6,7,8,9,1,0 olsun istiyorum
		
		List<Integer> tekrarsiz = new ArrayList<>();
		
		// her elemani tek tek alip, listede var mi yok mu diye bakacagiz ve yoksa ekleyecegiz
		// eger bizden array olarak istiyorlarsa da listi array e cevirecegiz
		
		for(int i=0; i<arr.length; i++) 
		{
			if(!tekrarsiz.contains(arr[i]))  // basinda unlem var, esit degilse demek
			{
				tekrarsiz.add(arr[i]);
			}
		}
		System.out.println("list olan "+tekrarsiz);
		
		int tekrarsizArray[] = new int[tekrarsiz.size()];
		
		for(int i=0; i<tekrarsizArray.length; i++) 
		{
			tekrarsizArray[i] = tekrarsiz.get(i); // listeden elemani get() methodu ile aliriz
		}
		
		System.out.println(tekrarsizArray); // hashcode yazdirir, arrayleri boyle yazdiramazsin !!!
		System.out.println("array olan "+Arrays.toString(tekrarsizArray));
		
		// gorunum olarak ayni ciktilar verecekler, ancak ozellik olarak bambaska iki yapidirlar
		
	}

}
