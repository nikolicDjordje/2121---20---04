package domaci;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		
		int brojZaProveru;
		int okrenutiBroj = 0;
		int cuvar;
				
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi broj za proveru: ");
		brojZaProveru = sc.nextInt();
		cuvar = brojZaProveru;
		
		while (cuvar!=0){
			okrenutiBroj = (okrenutiBroj * 10) + (cuvar % 10);
			cuvar=cuvar/10;
		}
	
		
		if (brojZaProveru == okrenutiBroj) {
			System.out.println(brojZaProveru + " je palindrom");
		}
		
		if (brojZaProveru != okrenutiBroj) {
			System.out.println(brojZaProveru + " nije palindrom");
		}


}
}