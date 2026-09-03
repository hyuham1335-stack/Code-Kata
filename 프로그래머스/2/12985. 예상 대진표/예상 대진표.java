import java.util.*;
import java.util.stream.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        while(true){
            if(Math.abs(a-b) == 1){
                if (a > b && a % 2 == 0) break;
                if (a < b && b % 2 == 0) break; 
            }
            
            answer++;
            
            if(a%2 != 0) a++;
            if(b%2 != 0) b++;
            
            a/=2;
            b/=2;
        }
        
        return answer;
    }
}