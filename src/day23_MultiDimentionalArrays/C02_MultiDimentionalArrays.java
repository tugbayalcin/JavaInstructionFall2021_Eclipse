package day23_MultiDimentionalArrays;

import java.util.Arrays;

public class C02_MultiDimentionalArrays {

	public static void main(String[] args) {
		
		// Multi Dimentional Arrays ic ice konulmus arrayler demektir
		// Array olusturmak icin iki yontemimiz vardir
		// 1.Yontem: Once declare edip, sonra deger atama
		
		int arr[][] = new int [3][2]; // outer array 3 elemanli, her bir inner array 2 elemanli demek
		// Bu yontemle olusturdugumuzda inner arraylerin hepsi ayni boyutta olmalidir
		
		System.out.println(Arrays.toString(arr)); // dış arrayi array formatinda ic arraylerin hash code'larini yazdirir
		
		// Direk outer array'i yazdirmak istedigimizde, icindeki elemanlar non-primitive oldugundan referance degerlerini yazdirir
		// [[I@4554617c, [I@74a14482, [I@1540e19d]
		
		System.out.println(Arrays.toString(arr[1])); // [0,0]
		System.out.println(Arrays.toString(arr[2])); // [0,0]
		
		System.out.println(Arrays.deepToString(arr)); // multi dimentional arrayi yazdirdi --> [[0, 0], [0, 0], [0, 0]]
		
		arr[0][1]=5;
		arr[1][0]=2;
		arr[2][1]=3;
		
		System.out.println(Arrays.deepToString(arr));
		
		// 2.Yontem: hem declare edip hem de deger atama 
		
		int arr2[][] = {{0},{1,2,3},{6,7,8,9}}; // bu durumda inner arraylarin boyutlari birbirinden farkli olabilir
		
		
		System.out.println(Arrays.toString(arr2[1])); // [1, 2, 3]
		System.out.println(arr2[2][1]); // 7 --> burada Arrays classini kullanmiyoruz, cunku tek bir sayi yazdiriyorum, bir array yazdirmiyorum

	}

}
