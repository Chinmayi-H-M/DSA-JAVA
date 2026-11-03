
/*
 * Problem: Substring with Concatenation of All Words
 * Platform: LeetCode
 * Problem Number: 30
 * Difficulty: Hard
 * Topic: Sliding Window, HashMap, Strings
 *
 * Approach:
 * 1. Store the frequency of each word in a HashMap.
 * 2. Process the string using different offsets based on wordSize.
 * 3. Maintain a sliding window using left and right pointers.
 * 4. Track word frequencies in the seen HashMap.
 * 5. Shrink the window whenever a word frequency exceeds
 *    its required frequency.
 * 6. When the window contains exactly n words, add its
 *    starting index to the answer.
 *
 * Time Complexity: O(L) average, assuming HashMap operations
 *                   and substring creation are O(1) per word
 * Space Complexity: O(U)
 *
 * L = length of s, U = number of unique words
 */

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if(words.length == 0 || s.length() == 0) {
            return new ArrayList<>();
        }
        HashMap<String,Integer> freq= new HashMap<>();
        for(String word: words){
            freq.put(word,freq.getOrDefault(word,0)+1);
        }
        int len=s.length();
        int n= words.length;
        int wordSize=words[0].length();
        int windowSize=n*wordSize;

        List<Integer> ans=new ArrayList<>();
        for(int offset=0;offset<wordSize;offset++){
            int left =offset;
            int used = 0;
            HashMap<String,Integer> seen=new HashMap<>();
            for(int right=offset;right+wordSize<=s.length();right+=wordSize){
                String word=s.substring(right,right+wordSize);
                if(!freq.containsKey(word)){
                    seen.clear();
                    used=0;
                    left=right+wordSize;
                    continue;
                }
                seen.put(word,seen.getOrDefault(word,0)+1);
                used++;
                while(seen.get(word)>freq.get(word)){
                    String leftWord=s.substring(left,left+wordSize);
                    seen.put(leftWord,seen.get(leftWord)-1);
                    left+=wordSize;
                    used--;
                }
                if(used==n){
                    ans.add(left);
                    String leftWord=s.substring(left,left+wordSize);
                    seen.put(leftWord,seen.get(leftWord)-1);
                    left+=wordSize;
                    used--;
                }
            }
        }
            return ans;
    }
}
