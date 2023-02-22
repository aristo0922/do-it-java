package prac.bubble;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon23970 {
    public static void bubble_sort(int[] a, int[] b){
        bubble_sort(a, b, a.length);
    }

    private static void bubble_sort(int[] a, int[] b, int size){

        if (Arrays.equals(a, b)) {
            System.out.println(1);
            return ;
        }

        for(int i=1; i<size; i++){
            int flag=0;
            for(int j=0; j<size-i; j++){
                if(a[j]>a[j+1]){
                    swap(a, j, j+1);
                    flag++;
                }
                if(a[j+1]==b[j+1]){
                    if (Arrays.equals(a, b)) {
                        System.out.println(1);
                        return ;
                    }
                }
            }
            if(flag == 0) break;
        }
        System.out.println(0);
    }

    private static void swap(int[] a, int left, int right){
        int temp = a[left];
        a[left]=a[right];
        a[right]=temp;
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] list1 = new int[N];
        int[] list2 = new int[N];

        for(int i=0; i<N; i++){
            list1[i]=scan.nextInt();
        }
        for(int i=0; i<N; i++){
            list2[i]=scan.nextInt();
        }

        bubble_sort(list1, list2);

    }
}
