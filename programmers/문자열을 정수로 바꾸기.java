class Solution {
    public int solution(String s) {
        int answer = 0;

        if(s.contains("+") || s.contains("-")){

            if(s.contains("-")){

                return Integer.parseInt(s);
            }else{

                return Integer.parseInt(s.substring(1,s.length()));
            }

        }

        return Integer.parseInt(s);

    }
}
