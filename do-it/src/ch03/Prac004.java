package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prac004 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        int[][] S = new int[suNo+1][suNo+1];
        for(int i=1;i<suNo+1; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j=1; j<suNo+1;j++){
                S[i][j]=S[i][j-1]+S[i-1][j]-S[i-1][j-1]+Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        for(int i=0;i<quizNo;i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1= Integer.parseInt(stringTokenizer.nextToken());
            int y1= Integer.parseInt(stringTokenizer.nextToken());
            int x2= Integer.parseInt(stringTokenizer.nextToken());
            int y2= Integer.parseInt(stringTokenizer.nextToken());

            int result = S[y2][x2]-S[y2][x1-1]-S[y1-1][x2]+S[y1-1][x1-1];

            System.out.println(result);
        }


    }
}
