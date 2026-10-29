/*
This question is not present in the toofan/prefs but discussed in the class


Problem: Return the elements at each alternate levels

		

*/

import java.util.*;

class BinaryTreeNode
{
	public int data; 
	public BinaryTreeNode left, right; 
	public BinaryTreeNode(int data){
		this.data = data; 
		left = null; 
		right = null; 
	}
}

class Solution 
{
	public static List<List<Integer>> evenlevel(BinaryTreeNode root) 
	{
	    List<List<Integer>> lst = new ArrayList<>();
	    Queue<BinaryTreeNode> q = new ArrayDeque<>();
	    q.offer(root);
		int ct = 0;
	    while(!q.isEmpty()){
	        double size = (double)q.size();
	        // if(ct%2==0){
               List<Integer> l = new ArrayList<>();
			// }
	        for(int i =0;i<size;i++){
	            BinaryTreeNode n = q.poll();
	              
	            if(n.left!=null &&  n.left.data!=-1) q.offer(n.left);
	            if(n.right!=null && n.right.data!=-1){
	                q.offer(n.right);
	            }
	            if(ct%2==0){
	                if(n.data!=-1){
						l.add(n.data);
					}
	            }
	           // avg += n.data;
	        }
	        if(ct%2==0){
	        lst.add(l);
			}
			ct++;
	    }
	    return lst;
	}
}

public class EvenLevelTraversal
{
	static BinaryTreeNode root;
	void insert(BinaryTreeNode temp, int key)
    { 
        if (temp == null) 
		{
            temp = new BinaryTreeNode(key);
            return;
        }
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(temp);
 
        // Do level order traversal until we find an empty place.
        while (!q.isEmpty()) {
            temp = q.remove();
 
            if (temp.left == null) {
                temp.left = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.left);
 
            if (temp.right == null) {
                temp.right = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.right);
        }
    }

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		EvenLevelTraversal ln=new EvenLevelTraversal();
		Solution sol= new Solution();
		
		String str[]=sc.nextLine().split(" ");
		root=new BinaryTreeNode(Integer.parseInt(str[0]));
		for(int i=1; i<str.length; i++)
			ln.insert(root,Integer.parseInt(str[i]));

		System.out.println(sol.evenlevel(root));
	}
}
