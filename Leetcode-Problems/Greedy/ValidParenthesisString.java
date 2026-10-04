class Solution {
    public boolean checkValidString(String s) {

        int low = 0;
        int high = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                low++;
                high++;
            }
            else if (ch == ')') {
                low--;
                high--;
            }
            else { // '*'
                low--;
                high++;
            }

            // Even the maximum possible balance is negative
            if (high < 0) {
                return false;
            }

            // Minimum balance cannot go below 0
            if (low < 0) {
                low = 0;
            }
        }

        return low == 0;
    }
}
