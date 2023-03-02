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

        int x1, y1, x2, y2, result;

        for(int i=0;i<quizNo;i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            x1= Integer.parseInt(stringTokenizer.nextToken());
            y1= Integer.parseInt(stringTokenizer.nextToken());
            x2= Integer.parseInt(stringTokenizer.nextToken());
            y2= Integer.parseInt(stringTokenizer.nextToken());

            result = S[x2][y2]-S[x2][y1-1]-S[x1-1][y2]+S[x1-1][y1-1];

            System.out.println(result);
        }


    }
}
