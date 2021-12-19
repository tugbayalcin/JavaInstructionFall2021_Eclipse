package day16_Loops;

public class C03_ForLoopQ2 {

	public static void main(String[] args) {
		
		// Soru 2: 10 ile 30 arasindaki sayilari aralarinda virgul olarak ayni satirda yazdirin
		
		for (int i =10; i<=30; i++) 
		{
			System.out.print(i+ ", "); 
		}
		// Burada 30'dan sonra da virgul koydu ama biz bunu istemiyoruz
		
		System.out.println();  // print lerden sonra alt satira gecmek icin kullanilir
		
		// cozum 1
		for (int i =10; i<=30; i++) 
		{
			if(i==30) 
			{
				System.out.print(i); 
			}
			else 
			{
				System.out.print(i+ ", "); 
			}
			
		}
		
		System.out.println();
		
		// cozum 2
		for (int i =10; i<=29; i++) 
		{
			System.out.print(i+ ", "); 
		}
		System.out.print(30); 
		
	}

}
