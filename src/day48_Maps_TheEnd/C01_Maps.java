package day48_Maps_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		
		// Verilen bir string'deki harfleri ve harflerin kacar kez kullanildigini return eden bir emthod yaziniz. 
		// Ornek: Input Hellooo Output : H=1, e=1; l=2, o=3;
		
		String input = "Hellooo";
		
		harfSay(input);
		
		Map<String,Integer> mainMap = harfSay(input);
		System.out.println(mainMap);

	}

	private static Map<String,Integer> harfSay(String input) 
	{
		
		Map<String,Integer> harfSayilariMap = new HashMap<>();
		String inputArr[] = input.split(""); // [H, e, l, l, o, o, o,]
		
		for(String each : inputArr) 
		{
			if(!harfSayilariMap.containsKey(each)) 
			{
				harfSayilariMap.put(each, 1);
			}
			else 
			{
				// harfSayilariMap.get(each)+1 bu girilen harf'in value'sunu bulup 1 arttirir
				harfSayilariMap.put(each, harfSayilariMap.get(each)+1);
				
			}
		}
		
		
		return harfSayilariMap;
		
	}

}
