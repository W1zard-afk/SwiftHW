import java.util.Scanner;

public class Task1a_PrintFirstDigit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		System.out.printf("%.1s", first);
		scan.close();
	}
}
