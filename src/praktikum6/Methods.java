package praktikum6;

import lib.TextIO;

public class Methods {
	public static void main(String[] args) {
		double i, j;
		System.out.println("Sisesta mingi arv: ");
		i = TextIO.getlnDouble();
		j = cube(i);
		System.out.println("Selle arvu kuup on " + j);

	}

	public static double cube(double i) {
		return Math.pow(i, 3);
	}

}
