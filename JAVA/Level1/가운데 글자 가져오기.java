/**
 *
 *
 * **/

//20201224

class Solution {
    public String solution(String s) {

        String answer;
        String stringArray[] = s.split("");

        if(stringArray.length % 2 ==0){

            answer = stringArray[(stringArray.length/2)-1].concat(stringArray[(stringArray.length/2)]);

        }else{

            answer = stringArray[stringArray.length/2];

        }

        return answer;
    }
}

/*
BEST ANSWER
**/

class StringExercise{
    String getMiddle(String word){
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }

    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}