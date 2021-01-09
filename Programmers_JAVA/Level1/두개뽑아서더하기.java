import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {
    public int[] solution(int[] numbers) {

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0 ; i<numbers.length ;i++){
            for(int j=i ; j<numbers.length ; j++){
                if(i!=j){
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }

        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);

        int[] answer = new int[list.size()];
        for(int i=0 ; i<answer.length ; i++){
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }
}