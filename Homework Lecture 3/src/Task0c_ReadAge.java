import java.util.Scanner;

public class Task0c_ReadAge {
	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);
		int agein;
		agein = age.nextInt();
		age.close();
		if (agein >= 0 & agein <= 150) {
			if (agein >= 18) {
				System.out.println("Adult - MORE BEER!!!");
			} else {
				System.out.println("Minor - Happy Meal");
			}
		} else {
			System.out.println("Please enter valid age!!!");
		}
	}
}