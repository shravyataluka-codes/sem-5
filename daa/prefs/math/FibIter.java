/*
Program to find nth fibonacci number using iteration
Assume Fibonacci Series as 0 1 1 2 3 5 8 13 21 34 55 ......

Sample Input and Output:
input=8
output=13

input=4
output=2
*/
import java.util.*;
class FibIter{
    static int fibo(int n){
        if(n<3) return n-1;
        int a  =0,b=1,c=0;
        for(int i =3;i<=n;i++){
            c = a+b;
           a = b;
           b = c;
        }
        return c;
    }
    
    public static void main(String args[]){
        
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibo(n));
    }
}