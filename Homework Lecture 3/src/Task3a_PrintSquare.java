import java.util.Scanner;

public class Task3a_PrintSquare {
	public static void main(String[] args) {
		Scanner numb = new Scanner(System.in);
		int N = numb.nextInt();
		for (int row = 0; row < N; row++) {
			for (int col = 0; col < N; col++) {
				if (row == 0 || row == N - 1) {
					System.out.print("* ");
				} else {
					if (col == 0 || col == N - 1) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
			numb.close();
		}
	}
}