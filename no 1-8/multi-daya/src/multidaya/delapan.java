package multidaya;

import java.util.Scanner;

public class delapan {

	public static void main(String[] args) {
		
		 int array[], n, total=0;
		    array = new int[100];
		   
		    Scanner scan = new Scanner(System.in);  
		    
		    
		   n=1000;
		   
//		   String cek = String.valueOf(n);
		    for(int i = 1; i <= n; i++){		    	
		      System.out.print("Nilai Ke-"+ i +" : ");
			  array[i] = scan.nextInt();
			  total = total + array[i];
			  if( String.valueOf(n).equalsIgnoreCase("=")) {					 
				  System.out.println("Hasil nilai total adalah : " + total);		
		      }
		    }
		    
		    
		   
		        
		  }
	
}
