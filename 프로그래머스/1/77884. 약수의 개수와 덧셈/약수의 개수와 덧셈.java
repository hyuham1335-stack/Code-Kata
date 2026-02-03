class Solution {
    
    public boolean check(int n) {
        
        int a = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0) a++;
        }
        
        return (a%2 == 0) ? true : false;
    }
    
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<=right; i++){
            if(check(i)) answer += i;
            else answer -= i;
        }
        
        return answer;
    }
}