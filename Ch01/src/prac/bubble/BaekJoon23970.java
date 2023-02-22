package prac.bubble;

import java.util.Scanner;

public class BaekJoon23970 {
    public static void bubble_sort(int[] a, int[] b){
        bubble_sort(a, b, a.length);
    }

    private static void bubble_sort(int[] a, int[] b, int size){
        int is_matched =0;
        int is_printed =0;
        for(int i=1; i<size; i++){
            int flag=0;
            for(int j=0; j<size-i; j++){
                if(a[j]>a[j+1]){
                    swap(a, j, j+1);
                    flag++;
                }
                is_matched = match(a, b);
                if(is_matched == 1){
                    System.out.println(1);
                    is_printed=1;
                }
            }
            if(flag ==0) break;
        }
        if(is_printed==0){System.out.println(0);}
    }

    private static int match(int[]a, int[] b){
        for(int i=0;i<a.length; i++){
            if(a[i] == b[i]){
                continue;
            }else{
                return 0;
            }
        }
        return 1;
    }
    private static void swap(int[] a, int left, int right){
        int temp = a[left];
        a[left]=a[right];
        a[right]=temp;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] list1 = new int[N];
        int[] list2 = new int[N];

        if(N<5){
            return ;
        }else if(N>10000){
            return ;
        }
        for(int i=0; i<N; i++){
            list1[i]=scan.nextInt();
        }
        for(int i=0; i<N; i++){
            list2[i]=scan.nextInt();
        }

        bubble_sort(list1, list2);



    }
}
