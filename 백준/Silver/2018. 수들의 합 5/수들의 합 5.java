import java.util.*;
import java.io.*;

// 백준 2018 - 수들의 합 5
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 1; int cnt = 1;
        int start_idx = 1; int end_idx = 1;
        while (end_idx != N) {
            if(sum == N) {
                cnt++;
                end_idx++;
                sum+=end_idx;
            } else if(sum < N) {
                end_idx++;
                sum+=end_idx;
            } else if(sum > N) {
                sum -= start_idx;
                start_idx++;
            }
        }
        System.out.println(cnt);
    }
}
