class Solution {
    public String solution(int a, int b) {
        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
        int days = 0;
        String answer = "dummy";

        for(int month = 0 ; month < a-1 ; month++ ){
            days += months[month];
        }

        days+=b;

        switch(days%7){
            case 0 :
                answer = "THU";
                break;
            case 1 :
                answer = "FRI";
                break;
            case 2 :
                answer = "SAT";
                break;
            case 3 :
                answer = "SUN";
                break;
            case 4 :
                answer = "MON";
                break;
            case 5 :
                answer = "TUE";
                break;
            case 6 :
                answer = "WED";
                break;
        }

        return answer;

    }
}