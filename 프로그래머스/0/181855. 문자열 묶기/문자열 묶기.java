import java.util.*;

class Solution {
    public Integer solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(String str : strArr) {
            map.put(str.length(), map.getOrDefault(str.length(), 0)+1);
        }
        Integer answer = Collections.max(map.values());
        return answer;
    }
}