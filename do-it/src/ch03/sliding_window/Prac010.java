package ch03.sliding_window;

import org.w3c.dom.Node;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Prac010 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());

        Deque<Node> mydeque= new LinkedList<>();
        for(int i =0 ;i<N; i++){
            int now = Integer.parseInt(st.nextToken());

            // 덱이 꽉 차 있는데 현재 값이 덱의 값보다 작을 때 (문제: 작은 값 구하기)
            while(!mydeque.isEmpty() && mydeque.getLast().value > now){
                mydeque.removeLast(); // 마지막으로 넣은 덱 삭제
            }
            // 현재 값을 새로운 노드로 추가
            mydeque.addLast(new Node(now, i));
            // 범위에서 벗어난 값은 덱에서 제거
            if(mydeque.getFirst().index<=i-L){
                mydeque.removeFirst();
            }
            bw.write(mydeque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
}
