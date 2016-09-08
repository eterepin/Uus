package praktikum3;

import lib.TextIO;

public class CumLaude {
	public static void main(String[] args) {
		double keskhinne, lopphinne;
		System.out.println("Sisesta palun oma kaalutud keskhinne: ");
		keskhinne = TextIO.getlnInt();
		System.out.println("Nüüd sisesta palun oma lõputöö hinne: ");
		lopphinne = TextIO.getlnInt();
		if (keskhinne > 4.5 && lopphinne == 5) {
			System.out.println("Jah, saad cum laude diplomile!");
		} else if (keskhinne < 0 || keskhinne > 5 || lopphinne < 0 || lopphinne > 5) {
			System.out.println("Sisestasid midagi veidrat, proovi uuesti!");
		} else {
			System.out.println("Ei saa!");
		}

	}

}
