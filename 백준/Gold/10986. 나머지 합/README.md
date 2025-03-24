# [Gold III] 나머지 합 - 10986 

[문제 링크](https://www.acmicpc.net/problem/10986) 

<details>
<summary>풀이과정 ..</summary>

- 누적합 배열을 이용해서 규칙찾기.. 
- 첨에 구현한 코드는 ArrayIndexOutOfBound 에러가뜸
  ```java
  st = new StringTokenizer(br.readLine());
  sumArr[0] = Integer.parseInt(st.nextToken());
  for(int i=1; i<N; i++) { // 누적합 배열
      sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken());
  }
  ```
  첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 106, 2 ≤ M ≤ 103)
  문제의 N의 값은 1보다 크거나 같은데 N이 1이 들어왔을떄 이 부분에서 오류가 날 것 같음..

</details>

### 성능 요약

메모리: 328476 KB, 시간: 1616 ms

### 분류

수학, 누적 합

### 제출 일자

2025년 3월 24일 12:55:26

### 문제 설명

<p>수 N개 A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>이 주어진다. 이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.</p>

<p>즉, A<sub>i</sub> + ... + A<sub>j</sub> (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.</p>

### 입력 

 <p>첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 10<sup>6</sup>, 2 ≤ M ≤ 10<sup>3</sup>)</p>

<p>둘째 줄에 N개의 수 A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>이 주어진다. (0 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>)</p>

### 출력 

 <p>첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.</p>

