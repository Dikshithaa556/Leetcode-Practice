package Strings;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        int [] freq = new int[26];
        char [] string = s.toCharArray();
        for(int i=0; i<string.length; i++){
         freq[string[i]-'a']++;
        }
        for(int i=0; i<string.length; i++){
         if(freq[string[i]-'a']==1){
             return i;
         }
        }
        return -1;
     }
}
