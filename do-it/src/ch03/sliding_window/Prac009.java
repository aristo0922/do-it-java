package ch03.sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prac009 {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int S = Integer.parseInt(st.nextToken()); //임의로 만든 부분 문자열의 길 S
        int P = Integer.parseInt(st.nextToken()); //사용할 부분 문자열의 길이 P
        int Result =0;
        char A[]= new char[S]; // 문자열 데이터
        checkArr = new int[4]; // 비밀번호 체크 배열
        myArr= new int[4]; // 현재 상태 배열
        checkSecret=0; // 몇개의 문자와 관련된 개수를 충족했는지 판단하는 변수

        A=bf.readLine().toCharArray(); // String to Array

        // 3번째 라인 초기화?
        st = new StringTokenizer(bf.readLine());
        for (int i=0; i<4; i++){
            checkArr[i]=Integer.parseInt(st.nextToken());
            if (checkArr[i] ==0){
                checkSecret++;
            }
        }

        for (int i =0 ; i<P; i++){ // 초기 P 부분 문자열 처리 부분
            Add(A[i]);
        }
        if(checkSecret ==4){
            Result++;
        }
        for(int i=P; i<S; i++){
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret==4)
                Result++;
        }
        System.out.println(Result);
        bf.close();
    }

    private static void Remove(char c) {
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0])
                    checkSecret--;
                myArr[0]--;
                break;
            case'C':
                if(myArr[1]==checkArr[1])
                    checkSecret--;
                myArr[1]--;
                break;
            case'G':
                if(myArr[2]==checkArr[2])
                    checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3])
                    checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch(c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0])
                    checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1]== checkArr[1])
                    checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2])
                    checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3])
                    checkSecret++;
                break;
        }
    }
}
