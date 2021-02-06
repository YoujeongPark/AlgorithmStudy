//진행중 

class Solution {
 static public int solution(String name) {
        int nameLength = name.length();
        int minMove = nameLength -1; 
        int answer = 0;

        for(int i=0 ; i< nameLength ; i++){
                        
            if(name.charAt(i) <= 'M'){
                answer += name.charAt(i) - 'A'; 
            
            }else{
                answer += 'Z' - name.charAt(i) + 1 ; 
            }
             
            System.out.println(answer);

              
            int next = i+1; 
            while(next < nameLength && name.charAt(next) == 'A'){
                next++; 
            }
            
            minMove = Math.min(minMove, i+i+nameLength-next); 
                                    
        }              
        
        
        return answer+ minMove;
    }
    

}