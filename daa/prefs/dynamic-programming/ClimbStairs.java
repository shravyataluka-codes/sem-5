/*
Program to count the number of ways to climb n steps using recursion
Given n stairs, a person can climb either 1 or 2 steps at a time. 
Find the total number of ways to reach the top.

Sample Input and Output:
input=8
output=34

input=4
output=5

*/
import java.util.*;
class ClimbStairs{
    static int climb(int n){
        if(n<=2) return n;
        return climb(n-2)+climb(n-1);
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(climb(n));
    }
}