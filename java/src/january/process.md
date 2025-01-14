[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42584?language=java)


초 단위로 기록된 주식 가격 배열 prices</br>
가격이 떨어지지 않은 기간은?</br></br>

[1, 2, 3, 2, 3]</br>
[4, 3, 1, 1, 0]</br></br>


입출력 예 설명</br>
1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다. </br>
2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다. </br>
3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.</br>
4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.</br>
5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.</br>

| sec      | return | values | next |
|----------|--------|--------|------|
| 0        | 0      | ?      |      |
| 1  - 0   | 4      | 1      | up   |
| 2   - 1  | 3      | 2      | up   |
| 3   - 2  | 1      | 3      | down |
| 4   - 3  | 1      | 2      | up   |
| 5   - 4  | 0      | 3      | -    |


### MAIN
```
  public static void main(String[] args) {

    Stock solution = new Stock();

    int[] prices = {1,2,3,2,3};
    int[] results = {4,3,1,1,0};
    int node;

    int[] answer = solution.solution(prices);

    for(int i = 0; i < results.length; i++){
      node = answer[i];
      System.out.println("[ANSWER] "+node);

      if ( results[i] == node){continue;}

      System.out.println("[fail] index >> " + i);
      break;
    }
  }
```



### FAIL
```
import java.util.ArrayDeque;
import java.util.Queue;

public class Stock {

  public int[] solution(int[] prices){
    int priceLen = prices.length;
    int[] answer = new int[priceLen];
    Queue<Integer> stocks = init(prices);

    while(stocks.isEmpty() != true){
      int  node = stocks.poll();
      int count = 0;
      for(int i = priceLen-stocks.size(); i < priceLen; i++){
        if(node <= prices[i]){
          count++;
        }
      }

      answer[priceLen-stocks.size()-1] = count;
    }

    return answer;
  }

  public Queue<Integer> init(int[] prices){
    Queue<Integer> stocks = new ArrayDeque<>();

    for(int price:prices){
      stocks.add(price);
    }
    return stocks;
  }
}

```

### FAIL2
```
public int[] solution(int[] prices){
    int priceLen = prices.length;
    int[] answer = new int[priceLen];

    for(int index = 0 ; index < priceLen; index++){
      int value1 = prices[index];
      for(int compare = index+1; compare < priceLen; compare++){
        int value2 = prices[compare];

        if(value1 <= value2){
          answer[index]++;
        }
      }
    }

    return answer;
  }
```

prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
prices의 길이는 2 이상 100,000 이하입니다.

> 반례 추가
```
int[] prices = {3, 5, 2, 6, 7, 8, 1, 10, 9};
int[] results = {2, 1, 4, 3, 2, 1, 2, 1, 0};
```

| sec     | return | values | next   |
|---------|-------|--------|--------|
| 0       | 0     | ?      | -      |
| 1  - 0  | 2     | 3      | up     |
| 2   - 1 | 1     | 5      | down   |
| 3   - 2 | 4     | 2      | up     |
| 4   - 3 | 3     | 6      | up     |
| 5   - 4 | 2     | 7      | up     |
| 6   - 5 | 1     | 8      | down   |
| 7   - 6 | 2     | 1      | up     |
| 8   - 7 | 1     | 10     | down   |
| 9   - 8 | 0     | 9      | -      |

1. 마지막 인덱스는 비교값이 없으므로 0
2. 바로 다음 턴에서 떨어지더라도 1초 동안은 본인의 값을 유지하므로 +1
 - 중요한 건 가격이 떨어지지 않은 기간 

down 이 나올 때까지 count++;
비교 시작한 인덱스부터 down/마지막 인덱스까지 count-- 기록

### FAIL 3
```
class Solution {
    
  public int[] solution(int[] prices){
    int priceLen = prices.length;
    int[] answer = new int[priceLen];

    int startI = 0, endI = 1;
    int node = prices[startI], count = 1;

    while(endI < priceLen){
      if(node <= prices[endI]){
        count++;
        node = prices[endI++];
        continue;
      } else if (endI > startI) {
        answer[startI++] = count--;
        continue;
      }
      node = prices[startI];
    }
    return answer;
  }
}
```