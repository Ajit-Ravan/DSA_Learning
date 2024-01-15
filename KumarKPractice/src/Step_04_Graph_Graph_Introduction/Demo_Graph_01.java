package Step_04_Graph_Graph_Introduction;

import java.util.Scanner;

//Input
//5 4 
//0 1 
//1 2 
//2 3 
//4 2 
////Output:
//0 nodes directly connected for i is: 1
//1 nodes directly connected for i is: 2
//2 nodes directly connected for i is: 3
//3 nodes directly connected for i is: 1
//4 nodes directly connected for i is: 1

public class Demo_Graph_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
 
        int[][] b = new int[10000][10000];
 
        for (int i = 1; i <= m; i++) {
            // Taking input for an undirected graph.
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            b[x][y] = 1;
            b[y][x] = 1;
        }
 
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (b[i][j] == 1) {
                    c++;
                }
            }
            System.out.println(i + " nodes directly connected for i is: " + c);
        }

	}

}
