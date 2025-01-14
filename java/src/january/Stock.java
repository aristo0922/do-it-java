package january;

import java.util.ArrayDeque;
import java.util.Queue;

public class Stock {

  public int[] solution(int[] prices){
    int priceLen = prices.length;
    int[] answer = new int[priceLen];

    int startI = 0, endI = 0;

    while(priceLen - endI > 1 && startI <= endI) {
      int node = prices[endI++];
      if (node <= prices[endI] ) {
        // do something
      }
      else {
        while (startI !=  endI) {
          answer[startI++] = endI - startI;
        }
      }
    }

    return answer;
  }


  public static void main(String[] args) {

    Stock solution = new Stock();

    int[] prices = {1,2,3,2,3};
    int[] results = {4,3,1,1,0};
//    int[] prices = {3, 5, 2, 6, 7, 8, 1, 10, 9};
//    int[] results = {2, 1, 4, 3, 2, 1, 2, 1, 0};
    int node;

    int[] answer = solution.solution(prices);

    for(int i = 0; i < results.length; i++){
      node = answer[i];
      System.out.println("[MY ANSWER] "+node);

      if ( results[i] == node){continue;}

      System.out.println("[FAIL] index >> " + i);
      break;
    }

  }
}
