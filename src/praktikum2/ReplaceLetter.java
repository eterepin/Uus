package praktikum2;
import lib.TextIO;

public class ReplaceLetter {
	public static void main(String[] args) {
		String text, text2;
		System.out.println("Sisesta mingi tekst");
		
		text = TextIO.getlnString();
		text2 = text.replace('a', '_');
		System.out.println("Asendasin \"a\"-tähed altkriipsudega, tulemuseks on " + text2);
		
	}

}
