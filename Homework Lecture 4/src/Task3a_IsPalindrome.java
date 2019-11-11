import java.util.Arrays;
import java.util.Scanner;

public class Task3a_IsPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String check = sc.next();
		char arr[] = new char [check.length()];
		int j = 0;
			for (int i=check.length()-1; i>=0; i--) {			
					arr[i] = check.charAt(j);
					j++;
				}
			check.toCharArray();
			
			
				System.out.println(check.equals(arr));
			}
		
	}

