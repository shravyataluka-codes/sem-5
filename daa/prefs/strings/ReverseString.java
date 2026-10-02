/*
Java Program to Reverse a string using iteration.
Sample Input and Output:
input=reverse
output=esrever

input=Data Science
output=ecneicS ataD
*/
import java.util.*;
class ReverseString{
    static String rev(String str){
        String a ="";
        for(int i=str.length()-1;i>=0;i--){
            a+=str.charAt(i);
        }
        return a;
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(rev(str));
    }
}