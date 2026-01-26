class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        int y=0;
        int t = x;
        while(x>0){
            y+=(x%10);
            x/=10;
        }
        
        if(t%y==0) answer = true;
        
        return answer;
    }
}