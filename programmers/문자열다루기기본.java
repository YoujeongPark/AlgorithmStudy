class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if(checkNumber(s)){

            return true;

        }else{

            return false;
        }

    }


    public boolean checkNumber(String number){


        try{

            if(number.length() == 4 || number.length() == 6){
                int intNumber = Integer.parseInt(number);
                return true;
            }

        }catch(Exception e){

            return false;

        }

        return false;

    }
}
