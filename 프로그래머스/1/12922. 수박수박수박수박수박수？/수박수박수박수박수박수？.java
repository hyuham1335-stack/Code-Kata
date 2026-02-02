class Solution {
    
    public String addString(int length){
        
        String answer = "";
        
        if(length % 2 == 0) {
            for(int i = 0 ; i< length/2 ; i++){
                answer += "수박";
            }
        } else {
            for(int i = 0 ; i< length/2 ; i++){
                answer += "수박";
            }
            
            answer += "수";
        }
        return answer;
    }
    
    
    public String solution(int n) {
        String answer = "";
        answer = addString(n);
        return answer;
    }
}