package multidaya;

import java.util.Scanner;

public class dua {
	public static void main(String[] args) {
		
		 int nilai;

		 Scanner keyboard = new Scanner(System.in);

		 // Tampilkan output ke user
		 System.out.println("### program penentu ganjil genap ###");
		 System.out.println("***********************************");
		 System.out.println();		 
		 System.out.print("Input Nilai: ");
		 
		 nilai = keyboard.nextInt();		 
		 System.out.println("***************");
		 
		 if(nilai%2==0) {
			 System.out.println("bilangan genap");
		 } else {
			 System.out.println("Bilangan ganjil");
		 }
	}
}
