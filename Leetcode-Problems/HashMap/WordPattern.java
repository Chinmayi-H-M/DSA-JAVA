/*
 * Problem: Word Pattern
 * Platform: LeetCode
 * Problem Number: 290
 * Difficulty: Easy
 * Topic: String, HashMap
 *
 * Approach:
 * Split the string into individual words.
 * Use two HashMaps to maintain a one-to-one mapping.
 * map stores character-to-word mappings.
 * rev stores word-to-character mappings.
 * Check existing mappings to identify inconsistencies.
 *
 * Time Complexity: O(n + L)
 * Space Complexity: O(n + L)
 * n = Number of characters in pattern
 * L = Total length of words in s
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] ss=s.split(" ");
        if(pattern.length() != ss.length) {
            return false;
        }
        HashMap<Character, String> map=new HashMap<>();
        HashMap<String, Character> rev=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(ss[i])){
                    return false;
                }
            }
            else{
                if(rev.containsKey(ss[i])){
                    return false;
                }
            map.put(ch,ss[i]);
            rev.put(ss[i],ch);
            }
        }
        return true;
    }
}
