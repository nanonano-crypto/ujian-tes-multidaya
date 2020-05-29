package multidaya;

public class enam {

	public static void main(String[] args) {
		deret_bilangan(1);
	}
	
	static void deret_bilangan(int angka) {		 
        if (angka <= 10) { 
            System.out.print(angka + " "); 
            deret_bilangan(++angka); 
        } 
    }
	
}
