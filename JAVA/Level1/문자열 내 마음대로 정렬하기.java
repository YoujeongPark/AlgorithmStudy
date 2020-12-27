class Solution {
    public String[] solution(String[] strings, int n) {

        String[] answer = {};

        String[] temp = {};
        for(int start = 0 ; start < strings.length ; start++){
            String[] val = strings.split("");
            temp[start] = val[n];
        }

        for(int i = 0 ; i<temp.length ; i++){
            for(int j=0 ; j<i ; j++){
                if(temp[i].equals(temp[j])){
                    return Arrays.sort(strings);
                }
            }
        }



        Arrays<Words> comparison = new Arrays<Words>();
        for(int start = 0 ; start < temp.length ; start++ ){
            comparison.add(new Words(strings[start],temp[start]));

        }

        for(int start = 0 ; start < temp.length ; start++ ){
            comparison.add(new Words(strings[start],temp[start]));

        }



        return answer;
    }
}

//https://cwondev.tistory.com/15
class Words{
    private String name;
    private String number;

    public Words(String name, String number){
        this.name = name;
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return number;
    }




}