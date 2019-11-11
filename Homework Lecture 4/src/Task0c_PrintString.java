import java.util.Scanner;

public class Task0c_PrintString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to be verticalized (can include space)");
		String string = sc.nextLine();
		for (int i=0; i<=string.length()-1; i++) {
			System.out.println(string.charAt(i));
		}
	}
}
