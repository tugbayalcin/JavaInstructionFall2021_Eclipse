package day29_StaticBlocks_PassByV_PBR;

public class C01_StaticBlocks {
	
	static 
	{
		System.out.println("Static block main methoddan bile once calisir.");

	}
	

	public static void main(String[] args) {
		
		System.out.println("Java'da once main method calisir.");
		
		

	}
	static 
	{
		System.out.println("Static block nereye yazilirsa yazilsin main methoddan bile once calisir.");
	}
	// eger birden fazla static block varsa, java yukaridan asagiya dogru calistirir

}
