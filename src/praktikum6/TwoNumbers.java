package praktikum6;

import lib.TextIO;

public class TwoNumbers {

	public static void main(String[] args) {
		int j = userInput(0, 100);
		System.out.println("Sa sisestasid: " + j);

	}

	public static int userInput(int min, int max) {
		while (true) {
			System.out.println("Sisesta arv vahemikus " + min + "- " + max);
			int i = TextIO.getlnInt();
			if (i >= min && i <= max) {
				return i;

			} else {

				System.out.println("Proovi uuesti.");
			}
		}
	}
}
