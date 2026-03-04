import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n, m;
	static int[] arr;
	static int[] num;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		num = new int[n];
		visited = new boolean[n+1];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		} 
		Arrays.sort(num);

		dfs(0);

		System.out.println(sb);

	}

	public static void dfs(int depth) {
		if (depth == m) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;	
		} // 배열을 다 채운다는 조건 충족 시 해답 완성.
		
		int before = 0;

		for (int i = 0; i < n; i++) {
			if (visited[i]) continue;
			if (before == num[i]) continue;
			
			visited[i]=true;
			arr[depth] = num[i];
			before = num[i];
			dfs(depth + 1);
			visited[i]=false;
			
			
		} // 배열 한자리씩 수를 채우기.
	}	

}