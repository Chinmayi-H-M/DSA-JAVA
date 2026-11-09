/*
 * Problem: Isomorphic Strings
 * Platform: LeetCode
 * Problem Number: 205
 * Difficulty: Easy
 * Topic: Strings, HashMap
 *
 * Approach:
 * Use two HashMaps to maintain one-to-one character mapping.
 * map1 maps characters from s to t.
 * map2 maps characters from t to s.
 * If any existing mapping conflicts, return false.
 * Otherwise, return true after checking all characters.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 * n = Length of the strings
 * k = Number of distinct characters
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1= new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(map1.containsKey(c1)){
                if(map1.get(c1)!=c2){
                    return false;
                }
            }
            else{
                map1.put(c1,c2);
            }
            if(map2.containsKey(c2)){
                if(map2.get(c2)!=c1){
                    return false;
                }
            }
            else{
                map2.put(c2,c1);
            }
        }
        return true;

    }
}
