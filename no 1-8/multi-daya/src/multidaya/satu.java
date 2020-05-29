package multidaya;

import java.util.Scanner;

public class satu {
	public static void main(String[] args) {
		 int nilai;

		 Scanner keyboard = new Scanner(System.in);

		
		 System.out.println("### program penentu grade nilai ###");
		 System.out.println("***********************************");
		 System.out.println();
		 System.out.println("Masukan nilai antara 1-100");
		 System.out.print("Input Nilai: ");
		 
		 nilai = keyboard.nextInt();
		 System.out.println();
		 System.out.println("***************");
		 
		 if (nilai >= 90 && nilai <=100) {
			 System.out.println("Grade A");
		 } else if(nilai >= 80 ) {
			 System.out.println("Grade B");
		 } else if(nilai >= 70 ) {
			 System.out.println("Grade C");
		 } else if(nilai >= 60 ) {
			 System.out.println("Grade D");
		 } else {
			 System.out.println("Grade E");
		 }
	}
}
