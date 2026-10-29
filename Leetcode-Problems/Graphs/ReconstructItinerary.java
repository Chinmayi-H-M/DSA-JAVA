
/*
 * Problem: Reconstruct Itinerary
 * Platform: LeetCode
 * Problem Number: 332
 * Difficulty: Hard
 * Topic: Graphs, DFS, Eulerian Path, HashMap
 *
 * Approach:
 * 1. Build an adjacency list from the tickets.
 * 2. Sort each airport's destinations lexicographically.
 * 3. Use DFS to visit and remove each ticket.
 * 4. Add each airport to the front of the result after
 *    exploring all its outgoing tickets.
 *
 * Time Complexity: O(E^2) in the worst case with remove(0)
 * Space Complexity: O(E + V)
 * E = number of tickets, V = number of airports
 */

import java.util.*;

class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, List<String>> map = new HashMap<>();

        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);

            map.putIfAbsent(from, new ArrayList<>());
            map.get(from).add(to);
        }

        for (String key : map.keySet()) {
            Collections.sort(map.get(key));
        }

        LinkedList<String> result = new LinkedList<>();
        dfs("JFK", map, result);

        return result;
    }

    private void dfs(String airport,
                     Map<String, List<String>> map,
                     LinkedList<String> result) {

        List<String> destinations = map.get(airport);

        while (destinations != null && !destinations.isEmpty()) {
            String next = destinations.remove(0);
            dfs(next, map, result);
        }

        result.addFirst(airport);
    }
}
