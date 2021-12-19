package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Fibonacci {

	public static void main(String[] args) {
		
		// verilen bir sayidan kucuk fibonacci sayilarini bir list olarak kaydedelim
		
		// 1,1,2,3,5,8,13,21,34,55,.......
		
		int sinir = 100;
		
		List <Integer> fibonacci = new ArrayList<>();
		
		fibonacci.add(1);
		fibonacci.add(1);
		int sayi=0; // while ın conditionu bu sayiya gore donecek
		
		while(sayi<sinir) 
		{
			sayi=  fibonacci.get(fibonacci.size()-2) + fibonacci.get(fibonacci.size()-1); 
			// size-2 ile size-1 bize daima son 2 sayiyi verecek, (length-1 son sayiyi veriyordu ya, ayni mantik)
			fibonacci.add(sayi);
		}
		
		System.out.println(fibonacci); 
		
		

	}

}
