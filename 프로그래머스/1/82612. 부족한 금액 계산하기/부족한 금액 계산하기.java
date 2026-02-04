import java.lang.*;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        
        for(int i = 1; i<= count; i++){
            total += price*i*1L;
        }
        
        
        return (money - total >= 0) ? 0 : Math.abs(money-total);
    }
}