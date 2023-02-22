package prac;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Prac000 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int inputNum = scan.nextInt();
        ArrayList<Integer> inputList = new ArrayList<>();

        for(int i=0; i<inputNum; i++){
            inputList.add(scan.nextInt());
        }

        inputList.sort(Comparator.naturalOrder());

        for(int i=0; i<inputNum; i++){
            System.out.println(inputList.get(i));
        }
    }
}
