package Day6;

import java.util.Scanner;

public class NestingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int floors = sc.nextInt();
		int rooms = sc.nextInt();
		for (int f = floors; f >= 1; f--) {
			for (int r = 0; r < rooms; r++) {
				if (f == floors) {
					System.out.print("L" + f + r + " ");
				} else if (f % 2 == 0) {
					System.out.print("O" + f + r + " ");
				} else {
					System.out.print("A" + f + r + " ");
				}
			}
		System.out.println();
		}

	}

}
