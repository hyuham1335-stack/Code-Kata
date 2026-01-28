class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        int x;
        String find = "Kim";
        int i;
        for(i=0; i<seoul.length;i++){
            if(seoul[i].equals(find)) break; 
        }
        
        answer += Integer.toString(i);
        answer+="에 있다";
        
        return answer;
    }
}