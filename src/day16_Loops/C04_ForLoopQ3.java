package day16_Loops;

public class C04_ForLoopQ3 {

	public static void main(String[] args) {
		
		// Soru 3: 100’den baslayarak 50’ye(dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda yazdirin
		
		for (int i =100; i>50; i--) 
		{
			System.out.print(i+ ", "); 
		}
		System.out.println(50); // bu satiri loop icine yazarsan her dongude bu satir yazdirilir ve ln oldugu icin bir sonraki donuste bir alt satira gecer

	}

}
