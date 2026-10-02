/* 
Sum of First n natural numbers using Iteration

Sample Input and Output:
input=4
output=10

input=9
output=45

input=16
output=136

*/
import java.util.*;
class SumNIter{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int sum =0;
        for(int i = 1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}