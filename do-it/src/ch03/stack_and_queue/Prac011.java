package ch03.stack_and_queue;

import java.util.Scanner;
import java.util.Stack;

public class Prac011 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for(int i =0 ;i <N; i++){
            A[i] = scan.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer buffer= new StringBuffer();
        int num =1;
        boolean result = true;
        for(int i=0 ; i<A.length; i++){
            int su = A[i];
            if (su>= num){
                while(su >= num){
                    stack.push(num++);
                    buffer.append("+\n");
                }
                stack.pop();
                buffer.append("-\n");
            }
            else{
                int n = stack.pop();
                if(n>su){
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else{
                    buffer.append("-\n");
                }
            }
        }
        if(result) System.out.println(buffer.toString());
    }
}
