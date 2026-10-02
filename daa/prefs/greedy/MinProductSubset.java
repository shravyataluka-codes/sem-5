/*
Minimum product subset of an array
The minimum product subset of an array refers to a subset of elements from the array such 
that the product of the elements in the subset is minimized.


One common algorithm used to find the minimum product subset of an array is the greedy 
algorithm. The basic idea of this algorithm is to start with the first element of the array and
add the next element to the subset only if it will result in a smaller product. The advantage of 
this algorithm is its simplicity and ease of implementation. However, the greedy algorithm may 
not always produce the optimal solution and can be very slow for large arrays.

A better solution is to use the below facts.  
If there are even number of negative numbers and no zeros, the result is the product of all except 
the largest valued negative number. If there are an odd number of negative numbers and no zeros,
the result is simply the product of all. If there are zeros and positive, no negative, the result is 0. 
The exceptional case is when there is no negative number and all other elements positive then our 
result should be the first minimum positive number.

Input : 
5
-1 -1 -2 4 3
Output : -24
Explanation : Minimum product will be ( -2 * -1 * -1 * 4 * 3 ) = -24

Input :
2
-1 0
Output : -1
Explanation : -1(single element) is minimum product possible

Input : 
3
0 0 0
Output : 0
*/
import java.util.*;
class MinProductSubset{
    public static int minprod(int n, int arr[]){
        int nct=0,minpos=Integer.MAX_VALUE;
        int nmax = Integer.MIN_VALUE;
        boolean zero = false;
        int prod = 1;
        for(int  i=0;i<n;i++){
            if(arr[i]<0){
                nct++;
                nmax = Math.max(nmax,arr[i]);
            }
            else if(arr[i]==0){
                zero = true;
            } 
            else{
                minpos = Math.min(minpos,arr[i]);
            }
        }
        if(nct==0 && !zero){
            // for(int i= 0;i<n;i++){
                
            // }
            return minpos;
        }
        else if(nct==0 && zero){
            return 0;
        }
        else if(nct%2==0){
            for(int i = 0;i<n;i++){
                if(arr[i]==0 || arr[i]==nmax){
                    continue;
                }
                prod*=arr[i];
                
            }
        }
        else{
            for(int i= 0;i<n;i++){
                if(arr[i]!=0){
                    prod*=arr[i];
                }
            }
        }
        return prod;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(minprod(n,arr));
    }
}