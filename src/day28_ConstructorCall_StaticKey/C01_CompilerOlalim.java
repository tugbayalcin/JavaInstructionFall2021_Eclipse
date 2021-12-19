package day28_ConstructorCall_StaticKey;

public class C01_CompilerOlalim {

	
		
		int x = 3;
	    int y = 5;
	    
//---------------------------------------------
	    C01_CompilerOlalim() {
	        x += 1;									// Constructor A
	        System.out.println("-x" + x);
	    }
	    
//---------------------------------------------

	    C01_CompilerOlalim(int i) {
	        this();									// Constructor B
	        this.y = i;
	        x += y;
	        System.out.println("-x" + x);
	    }
	    
//---------------------------------------------

	    C01_CompilerOlalim(int i, int i2) {
	        this(3);	   							// Constructor C
	        this.x -= 4;
	        System.out.println("-x" + x);
	    }
	    
//---------------------------------------------

	    public static void main(String[]args) {
	        
	         C01_CompilerOlalim c01= new C01_CompilerOlalim(4,3);
	         
	         // x ve y uzerinde yapilan degisiklikler instance variable'i degil, obje icerisindeki degeri degistirir !!!

	         // constructor calismaya baslaadiktan sonra x ve y ile ilgili dgisimler 
	         // (x ve y instance variable oldugundan) sadece c01 objesini ilgilendirir
	         // constructor'in isi bittiginde instance degerler ilk halini alir
	         
	         System.out.println("c01 icin x: " + c01.x + "c01 icin y: " + c01.y);
	         
	         C01_CompilerOlalim c02 = new C01_CompilerOlalim();
	         System.out.println("c02 icin x: " + c02.x + "c02 icin y: " + c02.y);
	         
	         C01_CompilerOlalim c03 = new C01_CompilerOlalim(7);
	         System.out.println("c03 icin x: " + c03.x + "c03 icin y: " + c03.y);
	         
	         
	         
	}
}


