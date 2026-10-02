/*
In a school, 5th standard is having 2 sections called Rose and Lotus.
Section Rose contains 'm' students and Lotus contains 'n' students.
Each section's students scored marks in the Mathematics exam.
Teacher maintained a record of marks in ascending order of each section.
Now your task is to find out the median of the marks of 2 sections together.

Note: The overall run time complexity should be O(log (m+n)) .

Example 1:
Sample Input=
4  //m                                                                                                     
5  //n                                                                                                    
62 74 81 95         //Rose section marks                                                                                                    
40 59 67 73 84      //Lotus section marks                                                                                                    

Sample Output=
73.0  //median

Explanation: merged marks = [40 59 62 67 73 74 81 84 95] 
and median is 73.0

Example 2:
Sample Input=
4
4
61 71 82 95
42 51 64 83

Sample Output=
67.5

Explanation: merged marks = [42 51 61 64 71 82 83 95] 
and median is (64+71)/2 is 67.5

*/
import java.util.*;
class MedianSortedArrays{
    static double med(int m,int n,int a[],int b[]){
        int k = 0,i=0,j=0;
        int ans[] = new int[m+n];
        while(i<m && j<n){
            if(a[i]>b[j]) 
            {
                ans[k++] = b[j]; j++;
            }
            else{
                ans[k++] = a[i];i++;
            } 
        }
        while(i<m){
            ans[k++] = a[i];
            i++;
        }
        while(j<n){
            ans[k++] = b[j];
            j++;
        }
        if((m+n)%2!=0){
            return ans[(m+n)/2];
        }
        else{
            return (double)(ans[(m+n)/2]+ans[(m+n)/2-1])/2.0;
        }
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int a[] = new int[m];
        for(int i = 0;i<m;i++){
            a[i] = s.nextInt();
        }
        int b[] = new int[n];
        for(int i = 0;i<n;i++){
            b[i] = s.nextInt();
        }
        System.out.println(med(m,n,a,b));
    }
}