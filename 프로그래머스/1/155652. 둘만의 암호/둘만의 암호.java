import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        List<Character> useList = new ArrayList<>();
        
        for(char c = 'a'; c <= 'z'; c++){
            useList.add(c);
        }
        
        for(int i = 0; i<skip.length(); i++){
            useList.remove((Character) skip.charAt(i));
        }
        
        int size = useList.size();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i =0 ; i < s.length(); i++){
            char c = s.charAt(i);
            int pos = useList.indexOf(c);
            char changeC = useList.get((pos+index)%size);
            
            sb.append(changeC);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}