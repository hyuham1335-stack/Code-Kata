import java.lang.*;

class Solution {
    
    private int check(int n){
        
        
        int a = 0;
        
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                if (i*i == n) a+=1;
                else a+=2;
            } 
        }
        return a;
    }
    
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1;i<=number;i++){
            int p = check(i);
            
            if(p > limit){
                answer += power;
            } else {
                answer += p;
            }
        }
        
        return answer;
    }
}