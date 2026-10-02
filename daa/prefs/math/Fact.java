/* 
Factorial of first n natural numbers using recursion

Sample Input and Output:
input=4
output=24

input=9
output=362880

input=16
output=20922789888000
*/
import java.util.*;
class Fact{
    static long fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();
        System.out.println(fact(n));
    }
}