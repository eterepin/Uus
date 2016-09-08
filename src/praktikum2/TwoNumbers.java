package praktikum2;

import lib.TextIO;

public class TwoNumbers {
public static void main(String[] args) {
	int fnum, snum, korrutis;
	System.out.println("Sisesta esimene arv");
	fnum = TextIO.getlnInt();
	System.out.println("Sisesta teine arv");
	snum = TextIO.getlnInt();
			
	korrutis = fnum * snum;
	System.out.println("Nende arbude korrutis on " + korrutis);
			

}
}
