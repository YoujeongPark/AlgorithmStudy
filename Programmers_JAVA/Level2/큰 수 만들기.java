//진행중 20210206 

import java.util.Stack; 

class Solution {
    public String solution(String number, int k) {
       
        
        String [] arrayNumber = number.split("");
        
        Stack<String> numberStack = new Stack<>(); 
        
        for(int i=0 ;  i< arrayNumber.length ; i++ ){
            
            try{
                
             while(Integer.parseInt(numberStack.peek()) < Integer.parseInt(arrayNumber[i]) && k> 0) {
                  numberStack.pop();                                                         
                  k-=1; 
            }
           
            }catch(Exception e){
                
            }
     
            numberStack.push(arrayNumber[i]);            
        }             
        
        Object[] arr = numberStack.toArray(); 
        String answer = "";
        for(int i=0 ; i <numberStack.size() ; i++){
            answer+=arr[i];
        }
        
        return answer;
    }
}