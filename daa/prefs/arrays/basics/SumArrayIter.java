/*
Program to find find the sum of the elements of an array using Iteration

Sample Input and Output:
input=5
1 2 3 4 5
output=15

input=4
7 8 9 10
output=34

*/
import java.util.*;
class SumArrayIter{
    static int sum(int n,int arr[]){
        int val = 0;
        for(int i =0;i<n;i++){
            val+=arr[i];
        }
        return val;
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(sum(n,arr));
    }
}
