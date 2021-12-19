package day19_While_DoWhileLoop;

public class C05_DoWhileLoop {

	public static void main(String[] args) {
		
		// Soru 2: ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin
		
		// for loop ile
		for(char i='m'; i>'c'; i--) 
		{
			System.out.print(i + " ");
		}
		System.out.println();
		// while loop ile
		char krk = 'm';
		while(krk>'c') 
		{
			System.out.print(krk + " ");
			krk--;
		}
		System.out.println();
		
		// do-while loop
		char harf = 'm';
		do 
		{
			System.out.print(harf + " ");
			harf--;
		}
		while(harf>'c');
		

	}

}
