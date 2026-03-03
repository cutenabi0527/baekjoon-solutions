import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n, m;
	static int[] arr;
	static int[] num;
	static StringBuilder sb = new StringBuilder();
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		num = new int[n];
		visited = new boolean [n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);

		dfs(0, 0);

		System.out.println(sb);

	}

	public static void dfs(int depth, int start) {
		if (depth == m) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = start; i < n; i++) {
			if (!visited[i]) {
				visited[i]=true;
				arr[depth] = num[i];
				dfs(depth + 1, i+1);
				visited[i]=false;
			}
			
		}
	}

}