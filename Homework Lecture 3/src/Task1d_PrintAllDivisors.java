import java.util.Scanner;

public class Task1d_PrintAllDivisors {
	public static void main(String[] args) {
		Scanner div = new Scanner(System.in);
		int N = div.nextInt();
		for (int i = 1; i <= N; i++) {
			if (N % i == 0)
				System.out.print(i + " ");
		}
		div.close();
	}
}
