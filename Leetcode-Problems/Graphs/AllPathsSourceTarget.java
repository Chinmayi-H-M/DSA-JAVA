/*
 * Problem: All Paths From Source to Target
 * Platform: LeetCode
 * Problem Number: 797
 * Difficulty: Medium
 * Topic: Graph, DFS, Backtracking
 *
 * Approach:
 * Use DFS to explore every possible path from node 0 to node n-1.
 * Add each visited node to the current path.
 * When the destination is reached, store a copy of the path.
 * Backtrack by removing the last node before exploring another path.
 *
 * Time Complexity: O(P * V + E)
 * Space Complexity: O(V) auxiliary space, excluding the output.
 * P = Number of valid paths, V = Number of vertices, E = Number of edges.
 */

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(graph,0,graph.length-1,path,res);
        return res;
    }
    public void dfs(int[][] graph, int src,int dest,List<Integer> path,List<List<Integer>> res){
        path.add(src);
        if(src==dest){
            res.add(new ArrayList<>(path));
        }
        else{
            for(int neighbour:graph[src]){
                dfs(graph,neighbour,dest,path,res);
            }
        }
        path.remove(path.size()-1);
    }
}
