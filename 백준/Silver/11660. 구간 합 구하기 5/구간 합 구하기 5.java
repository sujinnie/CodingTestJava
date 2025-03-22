import java.io.*;
import java.util.*;

//누적합,,
public class Main {
    static int N, M;
    static int x1,y1,x2,y2;
    static int[][] inputArr, sumArr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        inputArr = new int[N+1][N+1];
        sumArr = new int[N+1][N+1];
        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++) {
                inputArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                sumArr[i][j] = sumArr[i][j-1] + sumArr[i-1][j] - sumArr[i-1][j-1] + inputArr[i][j];
            }
        }

//        for(int i=1; i<=N; i++) {
//            for(int j=1; j<=N; j++) {
//                System.out.print(sumArr[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            System.out.println(sumArr[x2][y2]-sumArr[x2][y1-1]-sumArr[x1-1][y2]+sumArr[x1-1][y1-1]);
        }
    }
}
