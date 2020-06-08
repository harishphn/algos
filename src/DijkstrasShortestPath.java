public class DijkstrasShortestPath {
    public static void main(String[] args) {
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        computeShortestPath(graph);
    }

    public static boolean anyUnvisitedNode(boolean[] nodeStatus) {
        for (boolean status : nodeStatus) {
            if (!status) {
                return true;
            }
        }
        return false;
    }

    public static int getMinDistVertex(int[] shortestDistance, boolean[] nodeStatus) {
        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < shortestDistance.length; i++) {
            if (shortestDistance[i] < min && !nodeStatus[i]) {
                min = i;
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void computeShortestPath(int[][] graph) {
        boolean[] nodeStatus = new boolean[graph.length];

        int[] shortestDistance = new int[graph.length];
        shortestDistance[0] = 0;
        for (int i = 1; i < shortestDistance.length; i++) {
            shortestDistance[i] = Integer.MAX_VALUE;
        }
        while (anyUnvisitedNode(nodeStatus)) {
            int minIndex = getMinDistVertex(shortestDistance, nodeStatus);
            //System.out.println(minIndex);
            if (minIndex > nodeStatus.length) {
                break;
            }
            nodeStatus[minIndex] = true;
            System.out.println("Min Index: " + minIndex + "\tnodeStatus: " + nodeStatus[minIndex]);
            for (int i = 0; i < graph[minIndex].length; i++) {
                if (shortestDistance[minIndex] + graph[minIndex][i] < shortestDistance[i]) {
                    shortestDistance[i] = shortestDistance[minIndex] + graph[minIndex][i];
                    System.out.println(shortestDistance[i]);
                }
            }
        }

        for (int i = 0; i < shortestDistance.length; i++) {
            System.out.println(i + "\t" + shortestDistance[i]);
        }

    }
}