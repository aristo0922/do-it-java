package ch03;

import java.util.Scanner;

public class B11021 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int a;
        int b;
        for(int i=0; i<size ;i++){
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println("Case #"+(i+1)+": "+ (a+b));
//            System.out.println("a>>> "+a+" b>>> "+b);
        }

        scan.close();
        return ;
    }
}
