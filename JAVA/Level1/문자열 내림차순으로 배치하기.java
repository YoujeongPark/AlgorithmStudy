import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

class Solution {
    public String solution(String s) {

        String[] arrayString = s.split("");
        Arrays.sort(arrayString, Collections.reverseOrder());

        String answer = String.valueOf(Arrays.toString(arrayString));


        return answer;
    }
}