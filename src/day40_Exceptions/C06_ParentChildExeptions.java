package day40_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildExeptions {

	public static void main(String[] args) {
		
		
		try 
		{
			FileInputStream fis = new FileInputStream("src/day40_Exceptions/yazi.txt");
			
			 int k=0;
			 while((k=fis.read())!=-1)  // buldum ama okuyamazsam korkusu hatasi veriyor
			 {
			     System.out.print((char)k);
			 }
		} 
		catch (FileNotFoundException e) // spesifik sorunu yakalayacak olan uste
		{
			e.printStackTrace();
		} 
		catch (IOException e) // genis spektrumlu antibiyotigi en sonda kullaniyoruz
		{
			
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("Gorev Tamamlandi");
		

	}

}
