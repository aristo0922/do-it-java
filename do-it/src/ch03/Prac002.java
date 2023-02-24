package ch03;

import java.util.Scanner;

public class Prac002 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        float max =0 ;
        float sum =0 ;
        int N = scan.nextInt();
        int[] nList = new int [N];
        for(int i=0; i<N;i++){
            nList[i]=scan.nextInt();
            if(nList[i]>max){
                max=nList[i];
            }
            sum +=nList[i];
        }
        float result = (sum * 100) / max/N;

        System.out.println(result);

    }
}
