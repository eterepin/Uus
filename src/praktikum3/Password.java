package praktikum3;

import lib.TextIO;

public class Password {
	public static void main(String[] args) {
		String password1 = "Onomatopöa";
		System.out.println("Sisesta parool: ");
		String password2 = TextIO.getlnString();
		if (password2.equals(password1)) {
			System.out.println("Saad sisse");

		} else {
			System.out.println("Ei saa sisse");
		}

	}

}
