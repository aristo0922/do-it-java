package prac.string_buffer;

import java.io.*;
import java.util.StringTokenizer;

public class Buffer {
    public static void main(String[] args) throws IOException {
//        System.out.printf("I eat %d apples.", 3);

        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("Jump to java");
        String result = sb.toString();

        System.out.println(result);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i =Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer((br.readLine()));
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String arr[] = s.split(" ");
    }
}
