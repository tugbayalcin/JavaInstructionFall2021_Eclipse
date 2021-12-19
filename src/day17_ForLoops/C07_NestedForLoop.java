package day17_ForLoops;

public class C07_NestedForLoop {

	public static void main(String[] args) {
		
		// 1'den 4'e kadar sayilari yan yana, aralarinda 1 bosluk birakarak yazdirin
		
		
		for (int satir=1; satir<=4; satir++)  // outer for loop
		{
			for (int i=1; i<=4; i++) // inner for loop
			{
				System.out.print(satir*i + " ");
			}
			System.out.println("");
		}
	}

}
