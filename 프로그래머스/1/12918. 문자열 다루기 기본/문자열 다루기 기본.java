class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        
        for(char a: arr){
            if(a<'0' || a>'9') {
                answer = false;
                break;
            }
        }
        
        if(arr.length !=4 && arr.length !=6) answer = false;
        
        return answer;
    }
}