//구간 합 구하기 - 누적합
import java.io.*;
import java.util.*;
public class Main {
    static int N, M, start, end;
    static int[] inputArr;
    static int[] sumArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        inputArr = new int[N+1];
        sumArr = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) {
            inputArr[i] = Integer.parseInt(st.nextToken());
            sumArr[i] = sumArr[i-1] + inputArr[i];
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            System.out.println(sumArr[end]-sumArr[start-1]);
        }
    }
}
