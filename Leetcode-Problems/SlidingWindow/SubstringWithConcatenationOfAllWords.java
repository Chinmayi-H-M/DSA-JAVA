
/*
 * Problem: Substring with Concatenation of All Words
 * Platform: LeetCode
 * Problem Number: 30
 * Difficulty: Hard
 * Topic: Sliding Window, HashMap, Strings
 *
 * Approach:
 * 1. Store the frequency of each word in a HashMap.
 * 2. Calculate the total window size.
 * 3. Check windows starting at each possible word offset.
 * 4. Create a copy of the frequency map for each candidate window.
 * 5. Check whether all words are present with the required frequencies.
 *
 * Time Complexity: O((L / W) * N * W) approximately,
 *                   plus HashMap copying and substring costs
 * Space Complexity: O(U + N)
 *
 * L = length of s, W = word length,
 * N = number of words, U = number of unique words
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
        for(int startPos=0;startPos<wordSize;startPos++){
            int start=startPos;
            while(start+windowSize<=len){
                HashMap<String,Integer> curr=new HashMap<>(freq);
                String currWord;
                boolean matched=true;
                for(int i=0;i<n;i++){
                    currWord=s.substring(
                        start+i*wordSize,
                        start+(i+1)*wordSize);

                    if(!curr.containsKey(currWord)|| curr.get(currWord)==0){
                        matched=false;
                        break;
                    }
                    curr.put(currWord,curr.get(currWord)-1);
                }
                if(matched){
                    ans.add(start);
                }
                start+=wordSize;
            }
        }
        return ans;
    }
}
