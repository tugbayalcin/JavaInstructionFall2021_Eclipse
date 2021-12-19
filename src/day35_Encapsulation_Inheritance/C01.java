package day35_Encapsulation_Inheritance;

public class C01 {
	
	private double not = 49.9;
	private boolean gecerMi = false;
	
	
	public void setNot(double not) // baska class'lardan argument olarak yazilan degerler bu methoda parametre olarak gelecek
	{
		this.not = not;
	}


	public boolean isGecerMi() {
		
		if(not>=50) 
		{
			gecerMi = true;
		}
		return gecerMi;
	}
	
	
	
	
	
}
