package prac.string_buffer;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BufferBaekjoon23970 {
    public static int bubble_sort(int[] a, int[] b){
        if (Arrays.equals(a,b)){
            return 1;
        }
        return bubble_sort(a, b, a.length);
    }
    private static int bubble_sort(int[] a, int[] b, int size){
        for (int i =1 ; i<size ; i++){
            int flag = 0;
            for(int j =0 ; j<size - i ; j++){
                if(a[j]>a[j+1]){
                    swap(a, j, j+1);
                    flag ++;
                }
                if(a[j+1]==b[j+1]) {
                    if (Arrays.equals(a,b)){
                        return 1;
                    }
                }
            }
            if(flag == 0 ) break;
        }
        return 0;
    }

    private static void swap(int[] a, int left, int right){
        int temp = a[left];
        a[left]=a[right];
        a[right]=temp;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] listA = new int[N];
        for(int i =0 ; i<N ; i ++){
            listA[i] = Integer.parseInt(st.nextToken());
        }


        st = new StringTokenizer(br.readLine());
        int[] listB= new int[N];
        for(int i=0;i<N;i++){
            listB[i]=Integer.parseInt(st.nextToken());
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(bubble_sort(listA, listB)));
        bw.close();
    }
}
