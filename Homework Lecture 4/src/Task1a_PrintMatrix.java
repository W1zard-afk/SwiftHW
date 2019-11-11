import java.util.Scanner;

public class Task1a_PrintMatrix {
	public static void main(String[] args) {
		System.out.println("Enter Matrix dimentions");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		int str = 1;
		for (int i = 0; i <= N - 1; i++) {
			for (int j = 0; j <= N - 1; j++) {
				arr[j][i] = str++;
			}
		}
		System.out.println("Your result is:");
		for (int y = 0; y <= N - 1; y++) {
			System.out.println();
			for (int p = 0; p <= N - 1; p++) {
				System.out.print(arr[y][p] + "| ");
			}
		}

	}
}
