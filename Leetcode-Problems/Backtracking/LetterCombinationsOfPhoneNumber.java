/*
 * Problem: Letter Combinations of a Phone Number
 * Platform: LeetCode
 * Problem Number: 17
 * Difficulty: Medium
 * Topic: Backtracking, Recursion, HashMap
 *
 * Approach:
 * Store the phone keypad digit-to-letter mapping in a HashMap.
 * Use backtracking to generate all possible combinations.
 * Append each possible letter to the current StringBuilder.
 * Recursively process the next digit.
 * Remove the last character to explore other combinations.
 * When all digits are processed, add the combination to result.
 *
 * Time Complexity: O(N * 4^N)
 * Space Complexity: O(N) auxiliary space, excluding output.
 * N = Number of digits
 */

class Solution {
    HashMap<Character, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {

          List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        StringBuilder current = new StringBuilder();

        backtrack(digits, 0, current, result);

        return result;
    }
    public void backtrack(String digits, int index,
                          StringBuilder current,
                          List<String> result) {

        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));

        for (int i = 0; i < letters.length(); i++) {

            current.append(letters.charAt(i));

            backtrack(digits, index + 1, current, result);

            current.deleteCharAt(current.length() - 1);
        }
                          }
}
