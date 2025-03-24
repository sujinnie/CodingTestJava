import java.util.*;
import java.io.*;

// 백준 1253 - 좋다
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int cnt = 0;
        for(int i=0; i<N; i++) {
            int target = arr[i];
            int start = 0; int end = N-1;
            while (start < end) {
                int sum = arr[start] + arr[end];
                if(sum == target) {
                    if(start != i && end != i) {
                        cnt++;
                        break;
                    } else if(start == i) {
                        start++;
                    } else if(end == i) {
                        end--;
                    }
                }
                else if(sum < target) {
                    start++;
                }
                else if(sum > target) {
                    end--;
                }
            }
        }
        System.out.println(cnt);
    }
}
