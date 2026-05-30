import java.util.*;

public class tugas3 {

    private Map<String, List<String>> graph = new HashMap<>();

    public void addEdge(String node, String neighbor) {
        graph.putIfAbsent(node, new ArrayList<>());
        graph.get(node).add(neighbor);
    }

    public void dfs(String start, String target) {

        Set<String> visited = new HashSet<>();

        System.out.println("DFS");

        dfsRecursive(start, target, visited);
    }

    private void dfsRecursive(String current, String target, Set<String> visited) {

        System.out.println("node : " + current);

        if (current.equals(target)) {
            System.out.println("target : " + target);
            return;
        }

        visited.add(current);

        for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {

            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, target, visited);
            }
        }
    }

    public void bfs(String start, String target) {

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        System.out.println("\nBFS");

        while (!queue.isEmpty()) {

            String current = queue.poll();

            System.out.println("node : " + current);

            if (current.equals(target)) {
                System.out.println("target : " + target);
                return;
            }

            for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {

                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        tugas3 g = new tugas3();

        g.addEdge("a0", "a1");
        g.addEdge("a0", "a2");
        g.addEdge("a1", "a3");
        g.addEdge("a1", "a4");
        g.addEdge("a2", "a5");
        g.addEdge("a2", "a6");
        g.addEdge("a3", "a7");
        g.addEdge("a4", "a8");
        g.addEdge("a5", "a9");
        g.dfs("a0", "a4");
        g.bfs("a0", "a4");
    }
}