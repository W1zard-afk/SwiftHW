import java.util.Arrays;
import java.util.Scanner;

public class Task2c_PrintClusterCount {
	public static void main(String[] args) {
		System.out.println("Enter String lenght");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		System.out.println("Enter String digits with space separator");
		Scanner sc1 = new Scanner(System.in);
		for (int i = 0; i <= N - 1; i++) {
			arr[i] = sc1.nextInt();
			arr[2] = arr[3];
		}
		


	}
}
