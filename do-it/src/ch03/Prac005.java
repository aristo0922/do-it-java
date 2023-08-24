package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prac005 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        long[] inputSum = new long[N+1];
        stringTokenizer=new StringTokenizer(bufferedReader.readLine());
        for(int i=1;i<=N;i++){
            inputSum[i]=inputSum[i-1]+Integer.parseInt(stringTokenizer.nextToken());
        }

        long result =0;
        long[] remainder = new long[M];
        for(int i=1;i<=N;i++){
            inputSum[i]%=M;
            if(inputSum[i]==0){
                result++;
            }
            remainder[(int) inputSum[i]]++;

        }

        for(int i=0;i<M;i++){
            if(remainder[i]>1){
                result += (remainder[i]*(remainder[i]-1))/2;
            }
        }

        System.out.println(result);
    }
}
