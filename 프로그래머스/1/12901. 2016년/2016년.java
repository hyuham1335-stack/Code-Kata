class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] m = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] s = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int d = 0;
        for(int i=0;i<a-1;i++){
            d+= m[i];
        }
        
        d+= b - 1;
        
        answer = s[(d%7 + 5) % 7];
        
        return answer;
    }
}