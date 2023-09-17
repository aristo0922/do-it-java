package ch03.two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver4_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //배열 길이
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[] A=new int[N];
        int[] B=new int[M];

        //배열 값 입력
        stringTokenizer=new StringTokenizer(bufferedReader.readLine());
        for(int i=0; i<N; i++){
            A[i]=Integer.parseInt(stringTokenizer.nextToken());
        }
        stringTokenizer=new StringTokenizer(bufferedReader.readLine());
        for(int i=0; i<M; i++){
            B[i]=Integer.parseInt(stringTokenizer.nextToken());
        }

        int[] result=new int [N+M];

        int i=0, j=0, k=0;

        // 결과 배열 오름차순 정렬
        while(i<N && j<M){
            if(A[i] <= B[j]){
                result[k++]=A[i++];
            }else{
                result[k++]=B[j++];
            }
        }
        // 다 넣지 못한 값 삽입하기
        if(i<N){
            while(i<N)
                result[k++]=A[i++];
        }
        if(j<M){
            while(j<M)
                result[k++]=B[j++];
        }

        //출력
        StringBuilder sb = new StringBuilder();

        for(int index=0;index<N+M;index++){
            sb.append(result[index]).append(" ");
        }
        System.out.println(sb);
        bufferedReader.close();
    }
}
