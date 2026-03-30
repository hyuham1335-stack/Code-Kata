import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
    
        int[] arr = new int[n + 1];
        
        for(int i = 1 ; i <= n ; i++){
            arr[i]++;
        }
        
        for(int i = 0; i < lost.length; i++){
            arr[lost[i]]--;
        }
        
        for(int i = 0; i < reserve.length; i++){
            arr[reserve[i]]++;
        }
        

        for(int i = 1 ; i <= n ; i++){
            if(arr[i] == 1) {
                answer++;
            } else if(arr[i] == 2){
                if(i+1 <= n && arr[i+1] == 0){
                    arr[i+1]++;
                }
                answer++;
            } else{
                if(i+1 <= n && arr[i+1] == 2){
                    arr[i+1]--;
                    answer++;
                }
            }
        }
        
        return answer;
    }
}