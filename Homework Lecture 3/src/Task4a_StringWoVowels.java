import java.util.Scanner;

public class Task4a_StringWoVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		input = input.replace("a", " ");
		input = input.replace("o", " ");
		input = input.replace("e", " ");
		input = input.replace("i", " ");
		input = input.replace("u", " ");
		input = input.replace("y", " ");
		System.out.println(input);
	}
}
