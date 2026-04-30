import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> idToIndex = new HashMap<>();
        Map<String, Integer> reported = new HashMap<>();
        
        for(int i= 0; i < id_list.length; i++){
            idToIndex.put(id_list[i], i);
        }
        
        List<Set<String>> list = new ArrayList<>();
        
        for(int i= 0; i < id_list.length; i++){
            list.add(new HashSet<>());
        }
        
        for(int i= 0; i < report.length; i++){
            String[] s = report[i].split(" ");
            
            if (!list.get(idToIndex.get(s[0])).contains(s[1])){
                list.get(idToIndex.get(s[0])).add(s[1]);
                reported.put(s[1], reported.getOrDefault(s[1], 0) + 1);
            }
        }
        
        for(int i= 0; i < id_list.length; i++){
            for (String s : list.get(i)){
                if(reported.get(s) >= k) answer[i]++;
            }
        }
        
        
        return answer;
    }
}