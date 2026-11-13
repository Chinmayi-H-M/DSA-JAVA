/*
 * Problem: Find the Difference
 * Platform: LeetCode
 * Problem Number: 389
 * Difficulty: Easy
 * Topic: String, HashMap
 *
 * Approach:
 * Store the frequency of each character in string s.
 * Traverse string t and decrease the corresponding frequencies.
 * Remove characters whose frequency becomes zero.
 * If a character is not present in the map, return it
 * because it is the extra character.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * n = Length of string t
 */

class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int j=0;j<t.length();j++){
            char ch=t.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }
            }
            else{
                return ch;
            }

        }
        return ' ';

    }
}
