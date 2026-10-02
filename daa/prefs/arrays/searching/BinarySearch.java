/*
Program to implement Binary Search using Iteration

Sample Input and Output:
input=
7
2 4 6 8 10 12 14
8
output=
Element found at position 4

input=
6
5 15 25 35 45 55
20
output=
Element not found

*/
import java.util.*;
class BinarySearch{
    static int binsearch(int n,int arr[],int t){
        int l = 0,u = arr.length-1;
        while(l<=u){
            int mid = l+(u-l)/2;
            if(arr[mid]==t){
                return mid+1;
            }
            else if(arr[mid]<t){
                l = mid+1;
            }
            else{
                u = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int t = s.nextInt();
        int v = binsearch(n,arr,t);
        if(v==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position "+v);
        }
        
    }
}