/*
Write a java program to implement Breadth First Search of a Graph
Sample Input and Output:
input=
4  //number of vertices
//adjacency matrix
0 1 1 0
1 0 1 1
1 1 0 0
0 1 0 0
1  //source vertex
output= 1 2 3 4  //breadth first search of the graph
*/
import java.util.*;
public class BFSFirst{
    
    public static void bfs(int v, int g[][], int src){
        Queue<Integer> q = new ArrayDeque<>();
        boolean visited[]  = new boolean[v];
        q.offer(src);
        visited[src]= true;
        System.out.println(src+1);
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i = 0;i<v;i++){
                if(g[node][i]==1 && !visited[i]){
                    System.out.println(i+1);
                    q.offer(i);
                    visited[i] = true;
                }
            }

        }

    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int g[][] = new int[v][v];
        for(int i=0;i<v;i++){
            for(int j =0;j<v;j++){
                g[i][j] = s.nextInt();
            }
        }
        int src = s.nextInt()-1;// mistake 1 
        bfs(v,g,src);

    }

}