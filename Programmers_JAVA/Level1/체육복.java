//진행중 

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        ArrayList<Integer> lostArrayList = new ArrayList<Integer>(); 
        for(int i=0 ; i<lost.length ; i++ ){
            lostArrayList.add(lost[i]);
        }
        
        ArrayList<Integer> reserveArrayList = new ArrayList<Integer>(); 
        for(int i=0 ; i<reserve.length ; i++ ){
            reserveArrayList.add(reserve[i]);
        } 
        
        
        for(int i=0 ; i<lostArrayList.size() ; i++  )
            for(int j=0 ; j < reserveArrayList.size() ; j++ ){
            if(lostArrayList.get(i) == reserveArrayList.get(j)){
                lostArrayList.remove(lostArrayList.get(i));
                reserveArrayList.remove(reserveArrayList.get(j));
            }                  
        }                
                     
        int lostNumber = lostArrayList.size(); 
        
        for(int i=0 ; i<lostArrayList.size() ; i++  )
            for(int j=0 ; j < reserveArrayList.size() ; j++ ){
                if(Math.abs(lostArrayList.get(i) - reserveArrayList.get(j)) == 1){
                    lostNumber = lostNumber-1; 
                    reserveArrayList.set(j,-1);
                    break; 
                }
            }    
        
        
        return n - lostNumber;
    }
}