/* 
Factorial of first n natural numbers using iteration

Sample Input and Output:
input=4
output=24

input=9
output=362880

input=16
output=20922789888000
*/
import java.util.*;
class FactIter{
    static long fact(int n){
        long pro = 1;
        for(int i = 1;i<=n;i++){
            pro*=i;
        }
        return pro;
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fact(n));
    }
}