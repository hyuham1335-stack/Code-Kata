import java.util.*;

class Solution {
    
     Map<String, Integer> m = new HashMap<>();
    
    private void swap(String p, String[] players){
        int current = m.get(p);
        
        String changedP = players[current - 1];
        players[current - 1] = p;
        players[current] = changedP;
        
        m.put(p, current - 1);
        m.put(changedP, current);
    }
    
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        for(int i = 0 ; i < players.length; i++){
            m.put(players[i], i);
        }
        
        for(int i = 0 ; i < callings.length; i++){
            swap(callings[i], players);
        }
        
        answer = players;
        
        return answer;
    }
}