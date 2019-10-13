import java.util.Scanner;

public class Task1e_IsPrime {
	public static void main(String[] args) {
		Scanner div = new Scanner(System.in);
		int N = div.nextInt();
		int flag = 0;
		for (int i = 2; i < N; i++) {
			if (N % i == 0) {
				flag++;
			}
		}
		System.out.println("isPrimitive= " + (flag==0));
		div.close();

	}
}