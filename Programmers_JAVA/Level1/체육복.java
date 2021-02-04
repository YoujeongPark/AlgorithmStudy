//진행중 

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int totalStudent = n; 
        int lostNumber = lost.length; 
        
        Arrays<Integer> a = new Arrays<>();
        for(int i=0 ; i < lost.length ; i++){
            a.
        }
        
        for(int i=0 ; i<lost.length ; i++  )
            for(int j=0 ; j < reserve.length ; j++ ){
                if(Math.abs(lost[i] - reserve[j]) == 1){
                    lostNumber -=1; 
                    break; 
                }                   
            }    
        
        
        return n- lostNumber;
    }
}