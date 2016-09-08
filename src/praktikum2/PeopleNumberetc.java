package praktikum2;
import lib.TextIO;
public class PeopleNumberetc {
	public static void main(String[] args) {
		int PeopleNo, GroupSize, GroupNo, PeopleLeft;
		System.out.println("Sisesta inimeste arv");
		PeopleNo = TextIO.getlnInt();
		System.out.println("Sisesta grupi suurus");
		GroupSize = TextIO.getlnInt();
		GroupNo = PeopleNo / GroupSize;
		System.out.println("Nendest inimestest saab moodustada " + GroupNo + " gruppi.");
		PeopleLeft = PeopleNo % GroupSize;
		System.out.println("Järele jääb " + PeopleLeft + " inimest.");
	}
}
