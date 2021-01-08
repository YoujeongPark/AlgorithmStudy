class Solution {
    public String solution(String[] seoul) {

        int number = -1;

        for(int start = 0 ; start < seoul.length ; start++){

            if(seoul[start].equals("Kim")){

                number = start;
                break;
            }

        }

        String answer = "김서방은 " + Integer.toString(number) +"에 있다";
        return answer;
    }
}