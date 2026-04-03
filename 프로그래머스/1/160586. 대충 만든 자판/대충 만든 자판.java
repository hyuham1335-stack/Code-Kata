import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        int[] alp = new int[26];
        
        for(int i = 0 ; i < alp.length; i++){
            alp[i] = -1;
        }
        
        for(int i = 0; i < keymap.length; i++){
            for(int j = 0 ; j< keymap[i].length(); j++){
                if(alp[keymap[i].charAt(j) - 'A'] == -1) alp[keymap[i].charAt(j) - 'A'] = j + 1;
                else alp[keymap[i].charAt(j) - 'A'] = Math.min( alp[keymap[i].charAt(j) - 'A'], j+1);
            }
        }
        
        for(int i = 0 ; i< targets.length; i++){
            for(int j = 0 ; j < targets[i].length(); j++){
                if(alp[targets[i].charAt(j) - 'A'] == -1) {
                    answer[i] = -1;
                    break;
                }
                else {
                    answer[i] += alp[targets[i].charAt(j) - 'A'];
                }
            }
        }
        
        return answer;
    }
}