import java.util.*;
import java.io.*;

// 백준 1940 - 주몽
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start = 0; int end = N-1; int cnt = 0;
        while (start < end) {
            if(arr[start] + arr[end] < M) {
                start++;
            }
            else if(arr[start] + arr[end] > M) {
                end--;
            }
            else if(arr[start]+arr[end] == M) {
                cnt++; start++; end--;
            }
        }
        System.out.println(cnt);
    }
}
