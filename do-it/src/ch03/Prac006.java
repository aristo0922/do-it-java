package ch03;

import java.util.Scanner;

// 백준 2018
public class Prac006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextBigInteger().toString();

        int result =0;
        String [] toList = input.split("");

        for(int i=0; i< input.length(); i++){
            result += Integer.parseInt(toList[i]);
        }

        System.out.println(result);
    }
}
