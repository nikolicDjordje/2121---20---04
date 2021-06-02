/*DoWhile1: Napisati program koji ce omoguciti Peri da unese sa koliko novca raspolaze.
On moze da kupuje sve dok mu ne ostane samo 89 dinara jer mu toliko novca treba da kupi BUSPLUS kartu
i vrati se kuci sa novogodisnjim poklonima. 
Pera treba  da unosi pojedinacne cene poklona, a program treba da ga obavesti kada potrosi sav predvidjeni novac,
to jest kada za sledeci poklon vise nema kinte.*/


package domaci;

import java.util.Scanner;

public class WhileDo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double ukupnaCena = 0;
		int brojPoklona = 1;
		double cenaPoklona = 0;
		System.out.println("Pero, koliko novca imas?");
		
		double novac = 0;
		novac = sc.nextDouble();
		if (novac < 90)  {System.out.println("Nemas dovoljno novca za poklone!");}
		
		
		do {System.out.println("Unesite cenu poklona");
			cenaPoklona = sc.nextDouble(); if (novac > 89) {
			System.out.println("Kupio si " + brojPoklona +"." + " poklon" + " po ceni od " + cenaPoklona); }
			ukupnaCena = ukupnaCena + cenaPoklona;
			novac = novac - cenaPoklona;
			brojPoklona = brojPoklona + 1; 
					}
		while (novac >= 89);
		System.out.println("Pero, moras kupiti kartu za prevoz!");
		
		if (cenaPoklona > 0)  {
			brojPoklona = brojPoklona - 2;
			 System.out.println("Pero, kupio si " + brojPoklona + " poklona");
		}
		
		
		
	}
}


