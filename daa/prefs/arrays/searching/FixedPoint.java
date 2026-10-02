/*
There are n cubes printed a number on each of  them,
The cubes are placed in a row indexed from 0 to n-1, 
in ascending order of numbers printed on them.

Your task is to find the smallest index  I of the row, 
where index I equals to the number printed on the cube.

If no such index found, print -1.

NOTE: use a method/function  to find the smallest index I of the row.
and use binary search approach.

Input Format:
-------------
Line-1: An integer n, number of cubes.
Line-2: n space separated integers, numbers printed on the cubes in the row.

Output Format:
--------------
Print an integer, smallest index possible.


Sample Input-1:
---------------
5
-10 -5 0 3 4

Sample Output-1:
----------------
3

Explanation:
------------
Cubes in the row, row[0] = -10, row[1] = -5, row[2] = 0, row[3] = 3, row[4]=4.
There are 2 indices possible 3 and 4, but you need to find the smallest index, 
so answer is 3


Sample Input-2:
---------------
5
0 2 4 5 7

Sample Output-2:
----------------
0
*/