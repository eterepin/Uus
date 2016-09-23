package praktikum5;

import lib.TextIO;
public class Cycles5 {
	public static void main(String[] args) {
		int i, j, tableSize;
		tableSize = 7;

		for (i = 0; i < tableSize; i++) {
			for (j = 0; j < tableSize; j++) {
				if (i == j || j + i == tableSize - 1) {
					System.out.print("x");
				} else {
					System.out.print("0");

				}

			}
			System.out.println();
		}

	}
}