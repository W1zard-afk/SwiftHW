import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int digit;
		String string = "";
		for (int i = 0; i < count; i++) {
			digit=sc.nextInt();
			string += digit + " ";
//			string = string + digit + " ";
		}
		System.out.println(string);
		sc.close();
	}
}
