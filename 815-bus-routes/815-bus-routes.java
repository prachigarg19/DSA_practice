class Solution {

    public int numBusesToDestination(int[][] routes, int source, int target) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        int tstops = 0;
        //adding all buses coming to a stop
        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                if (!hm.containsKey(routes[i][j])) {
                    hm.put(routes[i][j], new ArrayList<>());
                }
                hm.get(routes[i][j]).add(i);
                tstops = Math.max(tstops, routes[i][j]);
            }
        }

        //bfs-> minimum
        //if we are at stop i, we will se which buses can we take at that stop and add all the values to queue.
        //here each level specific number of times different buses were taken
        int level = 0;
        Queue<Integer> q = new LinkedList<>();

        int[] visited_stops = new int[tstops + 1];
        int[] visited_bus = new int[routes.length + 1];

        q.add(source);
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int stop = q.poll();
                visited_stops[stop] = 1;
                //if stop is already in queue this mean we are already on this bus
                if(stop==target) return level;
                for (int j = 0; j < hm.get(stop).size(); j++) {
                    int bus = hm.get(stop).get(j);
                    if (visited_bus[bus] == 1) continue;
                    for (int i = 0; i < routes[bus].length; i++) {
                        //we went to extra bus to reach stop
                        if (routes[bus][i] == target) return level+1;
                        if (visited_stops[routes[bus][i]] == 0) q.add(routes[bus][i]);
                    }
                    visited_bus[bus] = 1;
                }
            }
            level++;
        }
        return -1;
    }
}
