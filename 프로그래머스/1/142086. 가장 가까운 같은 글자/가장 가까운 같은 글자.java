import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        int[] arr = new int[30];
        for(int i =0 ; i< arr.length; i++ ){
            arr[i] = -1;
        }
        
        for(int i=0;i<s.length();i++){ 
            if(arr[s.charAt(i) - 'a'] == -1){
                list.add(-1);
            } else {
                list.add(i - arr[s.charAt(i) - 'a']);
            }
            arr[s.charAt(i) - 'a'] = i;
        } 
        
        answer = list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        return answer;
    }
}