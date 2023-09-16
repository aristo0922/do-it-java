package ch03.two_pointer;

import java.util.Scanner;

// 백준 2018
public class Prac006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int count =1;
        int start_index=1;
        int end_index=1;
        int sum=1;

        while(end_index!=input){
            if(sum==input){
                count++;
                end_index++;
                sum=sum+end_index;
            } else if(sum > input){
                sum = sum-start_index;
                start_index++;
            } else{
                end_index++;
                sum = sum+end_index;
            }
        }

        System.out.println(count);
    }
}
