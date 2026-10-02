/* 
Sum of First n natural numbers using recursion

Sample Input and Output:
input=4
output=10

input=9
output=45

input=16
output=136

*/
import java.util.*;
class SumN{
    public static int rsum(int n){
        if(n==1) return n;
        return n+rsum(n-1);
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(rsum(n));
    }
}