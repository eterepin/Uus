package praktikum3;

import lib.TextIO;

public class Tehisintellekt {
	public static void main(String[] args) {
		int age1, age2;
		System.out.println("Sisesta palun oma vanus: ");
		age1 = TextIO.getlnInt();
		System.out.println("Sisesta palun oma südamedaami vanus: ");
		age2 = TextIO.getlnInt();
		if (Math.abs(age1 - age2) <= 5) {
			System.out.println("Kõik hästi, lase käia!");
		} else if (Math.abs(age1 - age2) > 5 && Math.abs(age1 - age2) <= 10) {
			System.out.println("Ma arvan, et sa võiksid leida endale kellegi enda vanusevahemikust.");
		} else {
			System.out.println("Ma näen, et oled paras seikleja. Seikle vähem, onju.");

		}

	}

}
