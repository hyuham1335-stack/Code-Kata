class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        int i=0;
        int a=0;
        int b=0;
        
        while(i<goal.length){
            if(a<cards1.length && goal[i].equals(cards1[a])){
                a++;
            } else if(b<cards2.length && goal[i].equals(cards2[b])){
                b++;
            } else {
                answer = "No";
                break;
            }
            i++;
        }
        if(i == goal.length){
            answer = "Yes";
        }
        
        return answer;
    }
}