package multidaya;

import java.util.Scanner;

public class lima {

	public static void main(String[] args) {
		
		int thn_awal, thn_akhir;

		 Scanner keyboard = new Scanner(System.in);

		 // Tampilkan output ke user
		 System.out.println("### program penentu tahun kabisat ###");
		 System.out.println("***********************************");
		 System.out.println();		 
		 System.out.print("Input Tahun Awal: ");
		 
		 thn_awal = keyboard.nextInt();	
		 System.out.print("Input Tahun kedua: ");
		 thn_akhir = keyboard.nextInt();	
		 System.out.println("***************");
		 
		 for(int i=thn_awal; i<=thn_akhir; i++) {
			 if (i % 400 == 0 || i % 4 ==0) {
			      System.out.println(i);
			 }
		 }
		 
	}
}
