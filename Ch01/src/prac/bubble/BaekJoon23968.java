package prac.bubble;

import java.util.Scanner;

public class BaekJoon23968 {
    public static void bubble_sort(int[] a, int K){
        bubble_sort(a, a.length, K);
    }

    private static void bubble_sort(int[] a, int size, int K){
        int flag = 0;
        int call_flag=0;
        for(int i=1;i<size;i++){
            for(int j=0; j<size-i;j++){
                if(a[j]>a[j+1]){
                    swap(a, j, j+1);
                    flag++;
                    if(flag == K){
                        System.out.print(a[j]+ " ");
                        System.out.print(a[j+1]);
                        call_flag =1;
                    }
                }
            }
        }

        if(call_flag==0){
            System.out.println(-1);
        }
    }
    private static void swap(int[] a, int left, int right){
        int temp=a[left];
        a[left]=a[right];
        a[right]=temp;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        int[] inputList = new int[N];
        for(int i=0; i<N ; i++){
            inputList[i]=scan.nextInt();
        }

        bubble_sort(inputList, K);
    }
}
