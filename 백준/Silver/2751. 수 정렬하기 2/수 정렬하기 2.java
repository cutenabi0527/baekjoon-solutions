import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner는 사용하기는 편하지만, 대량 입력에서는 느릴 수 있다.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 값의 범위: -1,000,000 ~ 1,000,000
        boolean[] exists = new boolean[2_000_001];

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            exists[num + 1_000_000] = true;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < exists.length; i++) {
            if (exists[i]) {
                sb.append(i - 1_000_000).append('\n');
            }
        }

        System.out.print(sb);

        sc.close();
    }
}
