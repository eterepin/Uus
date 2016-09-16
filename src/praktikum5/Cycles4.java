package praktikum5;

public class Cycles4 {
	public static void main(String[] args) {
		int i, j, tableSize;
		tableSize = 7;

		for (i = 0; i < tableSize; i++) {
			for (j = 0; j < tableSize; j++) {
				if (i == j) {
					System.out.print("1");
				} else {
					System.out.print("0");

				}

			}
			System.out.println();
		}

	}
}