class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int[][] map = new int[park.length][park[0].length()];
        
        int curX = 0;
        int curY = 0;
        
        for (int i = 0 ; i < park.length; i++){
            for (int j = 0; j < park[0].length(); j++){
                if (park[i].charAt(j) == 'O') {
                    map[i][j] = 0;
                } else if (park[i].charAt(j) == 'X'){
                    map[i][j] = -1;
                } else{
                    map[i][j] = 1;
                    curY = i;
                    curX = j;
                }
            }     
        }
        
        for (int i = 0 ; i < routes.length ; i++){
            
            int nextY = curY;
            int nextX = curX;
            boolean p = true;
            
            if(routes[i].charAt(0) == 'E'){
                for(int j = 0 ; j < routes[i].charAt(2) - '0' ; j++){
                    nextX++;
                    if(nextX < 0 || nextX >= park[0].length() || map[nextY][nextX] == -1){
                        p = false;
                        break;
                    }
                }
            } else if (routes[i].charAt(0) == 'W'){
                for(int j = 0 ; j < routes[i].charAt(2) - '0' ; j++){
                    nextX--;
                    if(nextX < 0 || nextX >= park[0].length() || map[nextY][nextX] == -1){
                        p = false;
                        break;
                    }
                }
            } else if (routes[i].charAt(0) == 'S'){
                for(int j = 0 ; j < routes[i].charAt(2) - '0' ; j++){
                    nextY++;
                    if(nextY < 0 || nextY >= park.length || map[nextY][nextX] == -1){
                        p = false;
                        break;
                    }
                }
            } else {
                for(int j = 0 ; j < routes[i].charAt(2) - '0' ; j++){
                        nextY--;
                        if(nextY < 0 || nextY >= park.length || map[nextY][nextX] == -1){
                            p = false;
                            break;
                        }
                    }
            }
        
            if (p){
               curY = nextY;
               curX = nextX; 
            }
        }
        
        int[] answer = {curY, curX};
        
        return answer;
    }
}