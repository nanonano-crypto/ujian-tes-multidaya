package multidaya;

import java.util.Scanner;

public class empat {

	public static void main(String[] args) {
		String kal;
		
		Scanner input = new Scanner(System.in);
		   
	    System.out.println("Masukkan kalimat = ");
	    kal = input.nextLine();
	   
	    int len = kal.length();
	    int b=0 ;
	    
	    for(int i=0; i<kal.length(); i++){
	        if(kal.charAt(i) == kal.charAt(len-1) ){
	        len=len-1;
	        b+=1;     
	    }else{
	        break;
	    }
	    }
	   
	    if(b == kal.length()){
	    	System.out.println(kal+" adalah kalimat palindrom");
	    }else{
	        System.out.println(kal+ " bukan palindrom");
	   
	    }
	
	}
}
