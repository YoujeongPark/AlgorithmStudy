import java.util.ArrayList;

class Solution {
    ArrayList<Integer> arraylist;

    public int solution(int n) {

        int answer = fibonachi(n);

        return answer;
    }

    public int fibonachi(int number){
        arraylist = new ArrayList();
        arraylist.add(0);
        arraylist.add(1);

        for(int i=2 ; i<= number ; i++){
            arraylist.add((arraylist.get(i-2).intValue() + arraylist.get(i-1).intValue())%1234567);
        }

        return arraylist.get(number);
    }
}

/**
 * 실패코드 - >n개의 피보나치 수열을 구할 때마다 1234567로 나눈 나머지값을 구한 값 중 n번째 수를 반환
import java.util.ArrayList;

class Solution {
    ArrayList<Integer> arraylist;

    public int solution(int n) {

        int answer = fibonachi(n) % 1234567;

        return answer;
    }

    public int fibonachi(int number){
        arraylist = new ArrayList();
        arraylist.add(0);
        arraylist.add(1);

        for(int i=2 ; i<= number ; i++){
            arraylist.add(arraylist.get(i-2).intValue() + arraylist.get(i-1).intValue());
        }

        return arraylist.get(number).intValue();
    }
}**/