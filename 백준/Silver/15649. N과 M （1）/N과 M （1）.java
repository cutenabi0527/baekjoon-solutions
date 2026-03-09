import java.util.Scanner;

public class Main {
	static int n, m;
	static int arr[];
	static boolean visited[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		visited = new boolean[n + 1];
		dfs(0);

	}

	public static void dfs(int depth) {
		if (depth == m) {
			for (int var : arr) {
				System.out.print(var+" ");
			} System.out.println();
			return;
		}
		
		for (int i=1; i<=n;i++) {
			if(!visited[i]) {
				visited[i]=true;
				arr[depth]=i;
				dfs(depth+1);
				visited[i]=false;
			}
		}
		
		
	}
}