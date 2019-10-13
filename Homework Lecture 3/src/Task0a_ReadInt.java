import java.util.Scanner;

public class Task0a_ReadInt {
	public static void main(String[] args) {
		Scanner bb = new Scanner(System.in);
		int digit;
		digit = bb.nextInt();
		bb.close();
		System.out.println(++digit);
	}
}
