import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String answerString = "";
        
        for(int i=0;i<s.length();i++){
                    
            char c = s.charAt(i);
            
            switch(c){
                    case 'z' -> {
                        answerString += "0";
                        i+=3;
                    }
                    case 'o' -> {
                        answerString += "1";
                        i+=2;
                    }
                    case 't' -> {
                        if(s.charAt(i+1) == 'w') {
                            answerString += "2";
                            i+=2;
                        } else {
                            answerString += "3";
                            i+=4;
                        }
                    }
                    case 'f' -> {
                        if(s.charAt(i+1) == 'o') {
                            answerString += "4";
                            i+=3;
                        } else {
                            answerString += "5";
                            i+=3;
                        }
                    }
                    case 's' -> {
                        if(s.charAt(i+1) == 'i') {
                            answerString += "6";
                            i+=2;
                        } else {
                            answerString += "7";
                            i+=4;
                        }
                    }
                    case 'e' -> {
                        answerString += "8";
                        i+=4;
                    }
                    case 'n' -> {
                        answerString += "9";
                        i+=3;
                    }
                    default -> answerString+=s.substring(i,i+1);

            }
            
        }
        
        answer = Integer.parseInt(answerString);
        return answer;
    }
}