/*
 * Problem: Minimum Generations to Reach Target
 * Platform: Not identified
 * Problem Number: Not identified
 * Difficulty: Not identified
 * Topic: BFS, HashSet, Simulation
 *
 * Approach:
 * Generate coordinate-wise midpoints of every pair of points.
 * Use a HashSet to avoid generating duplicate points.
 * Process newly generated points generation by generation.
 * Return the generation count when the target is found.
 *
 * Time Complexity: O(G * M^2) upper-bound estimate
 * Space Complexity: O(M)
 * M = Total unique points generated
 * G = Number of generations
 */

class Solution {
    public int minGenerations(int[][] points, int[] target) {
        int k=0;
        HashSet<String> seen= new HashSet<>();
        for(int[] p: points){
            String s=p[0]+","+p[1]+","+p[2];
            seen.add(s);
        }
        String t=target[0]+","+target[1]+","+target[2];
        if(seen.contains(t)){
            return k;
        }
        List<int[]> list = new ArrayList<>();

        for (int[] p : points) {
           list.add(p);
        }
        while(true){
            int n = list.size();
            List<int[]> newPoints = new ArrayList<>();
            k++;

            for (int i = 0; i < n; i++) {
               for (int j = i + 1; j < n; j++) {

                int[] a = list.get(i);
                int[] b = list.get(j);

                int nx = Math.floorDiv(a[0] + b[0], 2);
                int ny = Math.floorDiv(a[1] + b[1], 2);
                int nz = Math.floorDiv(a[2] + b[2], 2);

                int[] newPoint = {nx, ny, nz};

                String key = nx + "," + ny + "," + nz;


                if (seen.add(key)) {
                    if(key.equals(t)){
                        return k;
                    }
                    newPoints.add(newPoint);
                }
            }
        }
            if (newPoints.isEmpty()) {
                return -1;
            }

            list.addAll(newPoints);

        }
    }
}
