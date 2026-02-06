class Solution {
    
    public int min(int n, int m) {
         
        int temp;
        while(true){
            n%=m;
            if(n==0) return m;
            temp = n;
            n = m;
            m = temp;
        }
    }
    
    
    public int[] solution(int n, int m) {
        int[] answer = {};
        
        int min = min(n,m);
        int max = min * (n/min) * (m/min);
        
        answer = new int[]{min, max};
        
        return answer;
    }
}