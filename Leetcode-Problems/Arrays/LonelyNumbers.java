class Solution {
    public List<Integer> findLonely(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int x : nums) {
            if (map.get(x) == 1 &&
                !map.containsKey(x - 1) &&
                !map.containsKey(x + 1)) {

                ans.add(x);
            }
        }

        return ans;
    }
}
