import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        int[] arr = {0, 0, 0, 0};
        String[] type = {"RT", "CF", "JM", "AN"};
        
        for(int i = 0 ; i < choices.length; i++){
            if(survey[i].equals("RT")){
                arr[0] += (choices[i] - 4);
            } else if(survey[i].equals("TR")){
                arr[0] -= (choices[i] - 4);
            } else if(survey[i].equals("CF")){
                arr[1] += (choices[i] - 4);
            } else if(survey[i].equals("FC")){
                arr[1] -= (choices[i] - 4);
            } else if(survey[i].equals("JM")){
                arr[2] += (choices[i] - 4);
            } else if(survey[i].equals("MJ")){
                arr[2] -= (choices[i] - 4);
            } else if(survey[i].equals("AN")){
                arr[3] += (choices[i] - 4);
            } else if(survey[i].equals("NA")){
                arr[3] -= (choices[i] - 4);
            }
        }
        
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < 4; i++){
            if(arr[i] <= 0){
                sb.append(type[i].charAt(0));
            } else{
                sb.append(type[i].charAt(1));
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}