<h2>BufferedReader</h2>
```aidl
# class 상속
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

# 한 줄 읽기
StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

# 한 글자 씩 분할해 저장
int suNo = Integer.parseInt(stringTokenizer.nextToken());
int quizNo = Integer.parseInt(stringTokenizer.nextToken());
```
<br/>
<h3>BufferedReader</h3>
* 버퍼를 사용하여 읽는 함수<br/>
- 버퍼를 사용하여 쓰는 함수: BufferedWrite
<br/><br/>
* 키보드 입력이 있을 때마다 누르는 즉시 프로그램에 전달<br/>
- 개행 문자가 나타나거나 버퍼가 가득 차면 그 즉시 프로그램에 전달
<br/><br/>
<H3>readLine()</H3>
* 버퍼 클래스의 메서드로 한 줄을 그대로 반환<br/>
* String 형으로 반환
<br/><br/>
<h3>nextToken()</h3>
* StringTokenizer의 nextToken() 함수<br>
* 공백 기준으로 한 글자 씩 분할해 반환
<br/><br/>
<h3>String.splite(" ")</h3>
* 공백 기준으로 분할한 문자열을 배열에 저장

<h2>BufferedWriter</h2>
```aidl
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
String str = "abcdef"; // 출력할 문자열
bw.write(s); // 출력
bw.newLine(); // 줄바꿈
bw.flush(); // 남아있는 데이터 모두 출력
bw.close();
```
<h2> 오답노트</h2>
```
remainder[(int) inputSum[i]]++; # int 형으로 [] 안에 넣기
```


---
<h3>reference</h3>
https://rlakuku-program.tistory.com/33