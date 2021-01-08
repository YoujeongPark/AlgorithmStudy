import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {

        int answer = 1;

        Map<String, Integer> clothesMap = new HashMap<>();

        for(int i=0 ; i<clothes.length ; i++){
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1],0)+1);
        }

        for(int value :clothesMap.values()){
            answer *= (value+1);
        }

        return answer-1;
    }
}

/** best answer

import java.util.HashMap;
        import java.util.Iterator;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            if(!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }
        return answer-1;
    }
}

 **/