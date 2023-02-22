package prac.bubble;

import java.util.ArrayList;
import java.util.Scanner;

//버블정렬 문제라 쓰고 버블정렬이 아니라 보는 문제
//추후 다시 풀어보기

public class BaekJoon1838 {
    public static void bubble_sort(int[] a){
        bubble_sort(a, a.length);
    }
    private static void bubble_sort(int[] a, int size){
        int max_flag=0;
        for(int i=1;i<size;i++){
            int flag=0;
            for(int j=0;j<size-i;j++){
                if(a[j]>a[j+1]){
                    swap(a, j, j+1);
                    flag++;
                }
                if(flag>max_flag){
                    max_flag=flag;
                }
            }
            if(flag==0){
                break;
            }
        }

        System.out.println(max_flag);
    }
    private static void swap(int[] a, int left, int right){
        int temp=a[left];
        a[left]=a[right];
        a[right]=temp;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] inputList = new int[N];

//        ArrayList<Integer> inputList = new ArrayList<>();
        for(int i=0; i<N; i++){
            inputList[i]=scan.nextInt();
        }
        bubble_sort(inputList);
    }
}
