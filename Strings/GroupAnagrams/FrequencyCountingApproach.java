package Strings.GroupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencyCountingApproach {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] freq = new int[26];
            for(char ch : s.toCharArray()){
                freq[ch-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int f : freq){
                sb.append(f);
                sb.append("#");
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
