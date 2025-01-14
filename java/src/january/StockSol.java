package january;

import java.util.Stack;

public class StockSol {
  public int[] solution(int[] prices){
    int len = prices.length;
    int[] ans = new int [len];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i< len; i++){
      while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
        int idx = stack.pop();
        ans[idx] = i - idx;
      }
      stack.push(i);
    }

    while(!stack.isEmpty()){
      int idx = stack.pop();
      ans[idx] = len -1 -idx;
    }

    return ans;
  }

  public static void main(String[] args) {

    StockSol solution = new StockSol();

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
