package prac.bubble;

import java.util.Scanner;

public class BaekJoon23969 {
    public static void bubble_sort(int[] a, int K){
        bubble_sort(a, a.length, K);
    }
    private static void bubble_sort(int[] a, int size, int K){
        int flag = 0;
        boolean called = false;
        for(int i=1; i<size; i++){
            for(int j=0; j<size-i; j++){
                if(a[j]>a[j+1]){
                    swap(a, j, j+1);
                    flag ++;
                    if(flag == K){
                        printList(a);
                        called=true;
                    }
                }
            }
        }
        if(!called){
            System.out.println(-1);
        }
    }
    private static void swap(int[] a, int left, int right){
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    private static void printList(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] inputList= new int[N];

        for(int i =0; i<N; i++){
            inputList[i]=scan.nextInt();
        }

        bubble_sort(inputList, K);

    }
}
