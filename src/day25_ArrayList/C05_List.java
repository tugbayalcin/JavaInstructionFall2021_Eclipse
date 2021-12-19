package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
	
		// verilen bir listede icinde belirli bir harf olan elemanlari silen bir method yaziniz
		
		List <String> str = new ArrayList<>();
		
		str.add("Jeyhun");
		str.add("Yildiz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgut");
		
		System.out.println(str);
		
		String silinecekHarf = "a";
		
		str = killThemAll(str,silinecekHarf);
		
		
		
	
	}

	public static List<String> killThemAll(List<String> str, String silinecekHarf) {
		
		// yeni bir liste olusturmak zorunda degilim, soru benden ozellikle boyle bir sey istememis 
		// eski listemi modifiye edebilirim
		
		for(int i=0; i<str.size(); i++) 
		{
			if(str.get(i).contains(silinecekHarf)) 
			{
				str.remove(i); // burada soyle bir sikinti var, biz listeden bir eleman sildigimizde listedeki elemanlarin indeksleri degisir
				// dolayisi ile bazi elemanlar dongude hic degerlendirilmez ve hatali sonuc aliriz
				i--;
			}
		}
		System.out.println(str);
		return str;
		
	}

}
