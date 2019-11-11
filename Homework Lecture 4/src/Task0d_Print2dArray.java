
public class Task0d_Print2dArray {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int str = 1;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				arr[i][j] = str++;
			}
		}
		for (int y = 0; y <= 3; y++) {
			System.out.println();
			for (int p = 0; p <= 3; p++) {
				System.out.print(arr[y][p] + "| ");
			}
		}
	}
}
