package praktikum2;
import lib.TextIO;

public class Username {
	public static void main(String[] args) {
		String Name;
		System.out.println("Palun sisesta oma nimi");
		Name = TextIO.getlnString();
		int NameLength = Name.length();
		System.out.println("Sinu nimes on " + NameLength + " tähte.");
		
	}

}
