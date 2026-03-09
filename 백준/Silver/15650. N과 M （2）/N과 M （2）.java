import java.util.Scanner;

public class Main {
	static int n, m;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];

		dfs(0, 1);

	}

	public static void dfs(int depth, int start) {
		if (depth == m) {
			for (int val : arr) {
				System.out.print(val+" ");
			}System.out.println();
			return;
		} 
		
		for (int i = start; i <= n; i++) {
			arr[depth]=i;
			dfs(depth+1, i+1);
		}
	}

}