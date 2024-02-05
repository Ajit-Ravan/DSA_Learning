package Step_04_Graph_Session_01_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
//INPut:
//	8 
//	10 
//	1 2
//	1 3
//	2 4 
//	2 5 
//	3 6 
//	3 7 
//	5 8
//	5 4
//	6 7
//	1 5
//	Output:
//	1 1
//	2 1
//	3 1
//	5 1
//	4 2
//	6 1
//	7 1
//	8 1

public class NumberOfShortestPath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // taking input --> size of graph
		int m = sc.nextInt(); // taking input --> number of edges in the graph

		List<Integer>[] G = new List[n + 5]; // constructing a graph using adjacency list

		for (int i = 0; i < n + 5; i++) {
			G[i] = new ArrayList<Integer>();
		}

		int i = 1;
		while (i <= m) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			G[u].add(v);
			G[v].add(u);
			// making undirected graph
			i++;
		}

		Queue<Integer> q = new LinkedList<Integer>(); // declaring a queue

		q.offer(1); // pushing the source node = 1 in the queue

		int[] used = new int[n + 5]; // declaring an empty used array where in used[i] = 0 means this node has not
										// yet been visited in our algorithm
		int[] ways = new int[n + 5];
		used[1] = 1; // 1st node has been visited hence setting is as 1 and it is inserted in the
						// queue as well
		int[] lvl = new int[n + 5]; // declaring level array this basically lets us know level of each node
		lvl[1] = 0; // lvl of 1st node which we mean the source node is 0 as we start from here
		ways[1] = 1;

		while (!q.isEmpty()) {
			// BFS Algorithm

			int v = q.poll(); // top most element of queue
			System.out.println(v + " " + ways[v]); // printing that node with its number of ways to visit
			System.out.println();

			for (int u : G[v]) {
				// this simply means you're iterating through all nodes connected to node v
				if (used[u] == 0) {

					// if the node u(node connected to v) has never been visited before then let's
					// visit it
					q.offer(u);
					used[u] = 1; // it has now been visited hence setting its values as 1
					lvl[u] = lvl[v] + 1; // lvl[u] will be 1 greater than lvl[1] as we move 1 step forward from u to v
					ways[u] = ways[u] + ways[v];

				} else {

					if (lvl[v] + 1 == lvl[u]) {
						ways[u] = ways[u] + ways[v];
					}

				}

			}

		}

		sc.close();
	}

}
