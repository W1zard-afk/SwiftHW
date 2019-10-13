import java.util.Scanner;

public class Task0b_ReadLine {
	public static void main(String[] args) {
		Scanner ln = new Scanner(System.in);
		String string1;
		string1 = ln.nextLine();
		ln.close();
		System.out.println(string1);
	}
}
