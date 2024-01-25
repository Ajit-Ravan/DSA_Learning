package Step_04_Graph_Session_01_BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
 Input :
5 4
1 2
2 3
2 4
3 5
2
Output :
1 0 1 1 2
 */

public class demo_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		// taking input --> size of graph and number of edges in the graph

		List<Integer>[] G = new List[n + 5];
		// constructing a graph using adjacency list
		for (int i = 0; i < n + 5; i++) {
			G[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			// reading the number of edges in the graph
			G[u].add(v);
			G[v].add(u);
			// making undirected graph
		}

		Queue<Integer> q = new LinkedList<Integer>();
		// declaring a queue

		int source = sc.nextInt();
		q.add(source);
		// pushing the source node in the queue

		int[] used = new int[n + 5];
		Arrays.fill(used, 0);
		// declaring an empty used array where in used[i] = 0 means this node has not
		// yet been visited in our algorithm
		used[source] = 1;
		// source node has been visited hence setting it = 1 and it is inserted in the
		// queue as well

		int[] lvl = new int[n + 5];
		Arrays.fill(lvl, 0);
		// declaring level array this basically lets us know level of each node
		lvl[source] = 0;
		// lvl of source node which we mean the source node is 0 as we start from here

		while (!q.isEmpty()) {
			// BFS Algo

			int v = q.poll();
			// top most element of queue

			for (int u : G[v]) {
				// this simply means you're iterating through all nodes connected to node v
				if (used[u] == 0) {
					// if the node u(node connected to v) has never been visited before then lets
					// visit it
					q.add(u);
					used[u] = 1;
					// it has now been visited hence setting its values as 1
					lvl[u] = lvl[v] + 1;
					// lvl[u] will be 1 greater than lvl[1] as we move 1 step forward from u to v
				}
			}
		}

		int i = 1;
		while (i <= n) {
			System.out.print(lvl[i] + " ");
			// lvl[i] gives the shortest distance of each node from source.
			i++;
		}
	}

}
