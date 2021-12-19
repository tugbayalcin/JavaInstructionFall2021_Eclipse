import java.util.Arrays;

public class denemee {

	
		  public static void main(String[] args) {

			  int[] arr = {1,2,3,4,5,6,6};
		        //int[] arr2=new int[arr.length];//[0,0,0,0,0,0]
		        int element = 6;
		        int sayac=0;
		        
		        for(int i=0; i<arr.length; i++)
		        {

		            if(arr[i]==element)
		            {
		                sayac++;
		                continue;
		            }
		            
		        }
		        int[] lastArray = new int[arr.length-sayac];
		        int j=0;
		        for(int i=0; i<arr.length; i++)
		        {

		            
		            if(arr[i] != element) 
		            {
		            	lastArray[j] = arr[i];
		            	j++;
		            }
		            
		        }
		        System.out.println(Arrays.toString(lastArray));
		        
			  
			  
			  
		  }
		}
	
	  
	   
	   
	   
	   
	   
	   
	   
	 
	

