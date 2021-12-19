package day40_Exceptions;

public class C01_Exception {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 0;
		
		
		
		
		try 
		{
			System.out.println("Sayilarin Bolumu: " + a/b);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Sifir Ile Bolum Yapilamaz");
			//System.out.println(e.getMessage()); //   / by zero --> exception ın kaynagini gosterdi
			e.printStackTrace();
		}
		
		System.out.println("Gorev Tamamlandi");
		
		
		

	}

}
