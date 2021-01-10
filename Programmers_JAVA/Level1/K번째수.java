import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for(int i=0 ; i<commands.length ; i++){
            int blankNumber = commands[i][1] - commands[i][0] + 1;
            int[] dummy = new int[blankNumber]; //4

            for(int j=0; j< blankNumber; j++ ){
                dummy[j] = array[commands[i][0] -1 + j];
            }

            Arrays.sort(dummy);
            answer[i] = dummy[commands[i][2]-1];
        }

        return answer;
    }
}

/** Copy of Range
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}**/
