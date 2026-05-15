// Problem: Group Anagrams
// Platform: LeetCode
// Difficulty: Medium
// Topic: Strings, HashMap

import java.util.*;

class Solution {

    // Time Complexity: O(n * k log k)
    // n = number of strings
    // k = maximum length of string

    // Space Complexity: O(n * k)

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            // Convert string to char array
            char[] ch = s.toCharArray();

            // Sort characters
            Arrays.sort(ch);

            // Create sorted string key
            String sorted = new String(ch);

            // Create new list if key not present
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            // Add original string to group
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

/*
Approach:
1. Convert each string into sorted form.
2. Use sorted string as key in HashMap.
3. Strings with same sorted form are anagrams.
4. Store grouped strings in map.
5. Return all grouped values.
*/
