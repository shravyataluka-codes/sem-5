/*
You are entering into a maze N*N grid consist of(0's and 1's)
Initially you will start from (0,0) position in the maze, 
Your target is to reach the end position (N-1, N-1).

Among the four directions available(top, down, left, right),
you can move in two directions only, right and down.

In the maze, '0' indicates dead end and '1' indicates open way. 
You can travel through only open way.

For Example:-
Given Maze of size N=4 , starting position is (0, 0),
1 0 0 0
1 1 0 1
0 1 0 0
1 1 1 1

You can reach the (3, 3) position in the following way.
1 0 0 0
1 1 0 0
0 1 0 0
0 1 1 1

Return true, if you can reach the end position(N-1, N-1).
otherwise return false.

Input Format:
-------------
Line-1 -> An integer N, size of square board.
Next N lines -> N space separated integers 

Output Format:
--------------
Print a boolean value.

Sample Input-1:
---------------
3
1 1 1
1 0 1
0 1 1

Sample Output-2:
----------------
true

Sample Input-2:
---------------
4
1 0 0 0
1 1 0 1
0 1 0 0
1 1 0 1

Sample Output-1:
----------------
false
*/
import java.util.*;
class Maze_Using_stack{
    public static boolean dfs(int v,int n,int arr[][]){
        if(arr[0][0]==0) return false;
        Stack<int[]> stack = new Stack<>();
        boolean visited[][] = new boolean[n][n];
        stack.add(new int[]{0,0});
        while(!stack.isEmpty()){
            int[] val = stack.pop();
            int r = val[0];
            int c = val[1];
            // System.out.println(val);
            if(r==n-1 && c==n-1) return true;
            if(visited[r][c]==true) continue;
            visited[r][c] = true;
            // for(int  i= n-1;i>=0;i--){
                if(c+1<n && arr[r][c+1]==1 && visited[r][c+1]==false){
                    stack.add(new int[]{r,c+1});
                }
                if(r+1<n && arr[r+1][c]==1 && visited[r+1][c]==false){
                    stack.add(new int[]{r+1,c});
                }
            // }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j= 0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println(dfs(0,n,arr));
    }
}