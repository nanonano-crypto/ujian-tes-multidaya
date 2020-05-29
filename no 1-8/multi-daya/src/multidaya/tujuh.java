package multidaya;

import java.util.Scanner;

public class tujuh {

	public static void main(String[] args){
		String awal, akhir = "";
        System.out.print("Tulis sesuatu: ");

        Scanner input = new Scanner(System.in);
        awal = input.nextLine();

        int panjang = awal.length();
        for (int i = panjang-1 ; i >= 0 ; i--) {
            akhir = akhir+awal.charAt(i);
        }

        System.out.println("Kebalikan dari '"+awal+"' adalah '"+akhir+"'");
    }
}
