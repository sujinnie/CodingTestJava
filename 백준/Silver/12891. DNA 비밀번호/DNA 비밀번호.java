import java.util.*;
import java.io.*;

// 백준 12891 - DNA 비밀번호
public class Main {
    static int S,P;
    static char[] dnaStr; //dna 문자열
    static int[] checkArr, myArr;
    static int ans = 0; // 만들수있는 비번 개수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        dnaStr = new char[S];
        dnaStr = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        checkArr = new int[4]; // 'A,C,G,T'
        myArr = new int[4];
        for(int i=0; i<4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<P; i++) { // 첫 윈도우 범위 확인..
            if(dnaStr[i] == 'A') myArr[0]++;
            if(dnaStr[i] == 'C') myArr[1]++;
            if(dnaStr[i] == 'G') myArr[2]++;
            if(dnaStr[i] == 'T') myArr[3]++;
        }

        if(isValidate(myArr)) ans++; // 첫 윈도우가 조건에 맞으면 비번개수증가

        for(int j=P; j<S; j++) {
            int i = j-P;
            // 이전 부분문자열의 시작 문자 제외
            if (dnaStr[i]=='A') myArr[0]--;
            if (dnaStr[i]=='C') myArr[1]--;
            if (dnaStr[i]=='G') myArr[2]--;
            if (dnaStr[i]=='T') myArr[3]--;

            // 이전 부분문자열의 끝에서 1문자 추가
            if (dnaStr[j]=='A') myArr[0]++;
            if (dnaStr[j]=='C') myArr[1]++;
            if (dnaStr[j]=='G') myArr[2]++;
            if (dnaStr[j]=='T') myArr[3]++;

            // 윈도우가 조건에 맞으면 비번개수증가
            if(isValidate(myArr)) ans++;
        }
        System.out.println(ans);
    }
    private static boolean isValidate(int[] yourArr) {
        for(int i=0; i<4; i++) {
            if(yourArr[i] < checkArr[i]) return false;
        }
        return true;
    }
}
