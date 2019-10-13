import java.util.Scanner;

public class Task0d_ReadNNumbers {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int count = a.nextInt();
		int digit;
		for (int i = 0; i < count; i++) {
			digit = a.nextInt();
			System.out.println(digit);
		}
		a.close();
	}
}