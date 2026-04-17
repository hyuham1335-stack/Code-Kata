import java.util.*;

class Solution {
    private int getExpire(String date, int leftMonth){
        String[] s = date.split("\\.");
        int[] d = { Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]) };
        
        int[] exD = new int[3];
        
        int y = leftMonth / 12;
        leftMonth %= 12;
        
        if(d[2] == 1) {
            exD[2] = 28;
 
            if (d[1] + leftMonth - 1 > 12){
                exD[0] = d[0] + 1 + y;
                exD[1] = (d[1] + leftMonth - 1) % 12;
            } else if (d[1] + leftMonth - 1 == 0) {
                exD[1] = 12;
                exD[0] = d[0] + y - 1;
            } else {
                exD[0] = d[0] + y;
                exD[1] = d[1] + leftMonth - 1;
            }
            
        } else {
            exD[2] = d[2] - 1;
            
            if (d[1] + leftMonth > 12){
                exD[0] = d[0] + 1 + y;
                exD[1] = (d[1] + leftMonth)  % 12;
            } else {
                exD[0] = d[0] + y;
                exD[1] = d[1] + leftMonth;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(exD[0]);
        
        if(exD[1] < 10) {
            sb.append("0");
        }
        
        sb.append(exD[1]);
        
        if(exD[2] < 10) {
            sb.append("0");
        }
        sb.append(exD[2]);
        
        System.out.println(Integer.parseInt(sb.toString()));
        
        return Integer.parseInt(sb.toString());
    }
    
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        int todayDate = Integer.parseInt(today.replaceAll("\\.", "")); 
        
        Map<String, Integer> termsBycondition = new HashMap<>();
        
        for(int i = 0; i < terms.length; i++){
            String[] s = terms[i].split(" ");
            
            termsBycondition.put(s[0], Integer.parseInt(s[1]));
        }
        
        for(int i = 0; i < privacies.length; i++){
            String[] s = privacies[i].split(" ");
            
            int expireDate = getExpire(s[0], termsBycondition.get(s[1]));
            
            if (todayDate > expireDate) {
                list.add(i+1);
            }
        }
        
        answer = list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        return answer;
    }
}