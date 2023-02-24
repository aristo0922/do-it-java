package ch03;

import java.util.Scanner;

//baekjoon 11720
public class Prac001 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        String sNum = scan.next();
        char[] cNum = sNum.toCharArray();
        int sum =0;
        for(int i =0; i<cNum.length;i++){
//            아스키코드에 대한 이해 필요
            sum +=cNum[i]-'0';
        }
        System.out.print(sum);
    }
}
