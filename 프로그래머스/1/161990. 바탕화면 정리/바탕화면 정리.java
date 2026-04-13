import java.lang.*;
import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        
        int lux = 100;
        int luy = 100;
        
        int rdx = -1;
        int rdy = -1;
        
        for (int i = 0 ; i < wallpaper.length; i++){
            if(wallpaper[i].contains("#")) {
                lux = Math.min(lux, i);
                rdx = Math.max(rdx, i + 1);
            }
                
            for(int j = 0 ; j < wallpaper[i].length() ; j++){
                if(wallpaper[i].charAt(j) == '#'){
                    luy = Math.min(luy, j);
                    rdy = Math.max(rdy, j + 1);
                }
            }
        }
        
        int[] answer = {lux, luy, rdx, rdy};
        
        return answer;
    }
}