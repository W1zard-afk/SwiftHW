import java.util.Scanner;

public class Task0b_ReadArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count elments");
		int N = sc.nextInt();
		System.out.println("Enter your " + N + " elements");
		int[] arr = new int[N];
		for (int j = 0; j <= arr.length - 1; j++) {
			int string = sc.nextInt();
			arr[j] = string;
			}
		for (int i = 0; i <= arr.length - 1; i++)
			System.out.print(arr[i] + ",");

	}

}