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
class Maze{
    public static int n;
    static int arr[][] = new int[n][n];
    static int r = 0,val = 0;
    public static boolean visit[] = new boolean[n];
    public static void  dfs(int v){
        // if(arr[0][0]==0 || arr[n-1][n-1]==0) return false;
        // return true;
        // boolean visit[]  = new boolean[n];
        // int r =0,c =0;
        // visit[v] = true;
        for(int i =0;i<n;i++){
           if(arr[v][i]==1 && !visit[i]){
             visit[i]=true;
             val = i;
               dfs(i);
               r++;
               
               
           }
        }
    }
    
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        int arr[][] = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }
        dfs(0);
        if(arr[0][0]==0 || arr[n-1][n-1]==0) {
            System.out.println(false);
            return;
        }
    //   if(val==(n-1)) {
    //       System.out.println(true);
    //   }
    //   else{
           System.out.println(true);
    //   }
        
    }
}