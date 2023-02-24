package ch03;

import java.util.Scanner;

public class Prac003 {
    public static void part_sum(int[] a, int start, int end){
//        a 리스트에서 구간 합 구하고 출력
        int result =0;
        if(start-1 <=0){
            result = a[end-1];
            System.out.println(result);
        }
        else {
            result = a[end-1]-a[start-2];
            System.out.println(result);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] nList = new int[N];
        int[] sumList = new int[N];
        nList[0]=scan.nextInt();
        sumList[0]=nList[0];
        for(int i=1; i<N; i++){
            nList[i]=scan.nextInt();
            sumList[i]=sumList[i-1]+nList[i];
        }

        for(int i=0;i<M;i++){
            int start = scan.nextInt();
            int end = scan.nextInt();
            part_sum(sumList, start, end);
        }
    }
}
