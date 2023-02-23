package prac.string_buffer;

public class Buffer {
    public static void main(String[] args){
        System.out.printf("I eat %d apples.", 3);

        StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);  // "hello jump to java" 출력

    }
}
