package praktikum6;

public class CoinFlip {
	public static void main(String[] args) {
//		0 - kull, 1 - kiri
		int userThinks = TwoNumbers.userInput("Sisesta kull (0) või kiri (1)", 0, 1); //?????????
		int random = (int)(Math.random() * 2);
		if( random == 0){
			System.out.println("Kull");
			if ( userThinks == random){
				System.out.println("Arvasid õigesti!");
			}
			else{
				System.out.println("Vastasid valesti!");
			}
		}
		else{
			System.out.println("Kiri");
			if ( userThinks == random){
				System.out.println("Arvasid õigesti!");
			}
			else{
				System.out.println("Vastasid valesti!");
			}
		}
	}

}
