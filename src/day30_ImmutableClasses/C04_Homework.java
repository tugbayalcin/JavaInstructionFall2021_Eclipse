package day30_ImmutableClasses;

public class C04_Homework {

	public static void main(String[] args) {
		
		String a = "";
		
		a += 2; // concat
		
		a += 'c'; // concat
		
		a += false; // concat 
		
		String b = "2cfalse";
		
		if(a == b) // false --> String pool'a atmamis, oysa ki ikisi de new ile olusturulmamisti ancak java a nın classic yontemle olusturulmadigini soyleyip bu ikisine farkli reference degerleri veriyor
		{
			System.out.println("==");
		} 
		
		if(a == "2cfalse") // burasi false'dur cuku a'nin bir referansi var ancak "2cfalse" ifadesi havada bir seydir, referansi yoktur, dolayisi ise esit referansta olmadiklari icin false olur
		{
			System.out.println("==");
		} 
		
		if(a.equals("2cfalse"))  // burasi true'dur --> equals degerlere bakar, referanslarla ilgilenmez
		{
			System.out.println("equals");
		}
		

	}

}
