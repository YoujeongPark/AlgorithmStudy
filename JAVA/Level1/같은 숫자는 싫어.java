import java.util.*;
/**
 * 20201224 -  테스트 실패
 * 이유뭔지 생각해보기
 **/


public class Solution {
    public int[] solution(int []arr) {

        List<Integer> listAnswer = new ArrayList<Integer>();
        int add = 0;

        listAnswer.add(arr[0]);

        for(int start = 1; start < arr.length -1; start++){

            if(listAnswer.get(listAnswer.size()-1) != arr[start]){
                listAnswer.add(arr[start]);
            }

        }

        int[] answer = new int[listAnswer.size()];
        for(int i=0 ; i<answer.length;i++){
            answer[i] = listAnswer.get(i).intValue();
        }


        return answer;
    }
}