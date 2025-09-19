/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int depth(TreeNode root,int x,int d)
    {
        if(root==null)
        return -1;
        if(root.val==x)
        {
            return d;
        }
        int l=depth(root.left,x,d+1);
        if(l!=-1)
        {
            return l;
        }
        return depth(root.right,x,d+1);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        List<Integer> path1=new ArrayList<>();
        List<Integer> path2=new ArrayList<>();
        getPath(root,x,path1);
        getPath(root,y,path2);
        int h1=depth(root,x,0);
        int h2=depth(root,y,0);
        if(h1!=h2)
        {
            return false;
        }
        int p1=-1;
        int p2=-1;
        for(int i=1;i<path1.size();i++)
        {
            if(path1.get(i)==x)
            {
                p1=path1.get(i-1);
                break;
            }
        }
        for(int i=1;i<path2.size();i++)
        {
            if(path2.get(i)==y)
            {
                p2=path2.get(i-1);
                break;
            }
        }
        if(p1!=p2 && h1==h2)
        {
            return true;
        }
        return false;
    }
    public boolean getPath(TreeNode root,int x,List<Integer> path)
       {
           if(root==null)
           {
            return false;
           }
           path.add(root.val);
           if(root.val==x)
           {
            return true;
           }
           boolean fl=getPath(root.left,x,path);
           boolean fr=getPath(root.right,x,path);
           if(fl || fr)
           {
            return true;
           }
           path.remove(path.size()-1);
           return false;
       }
}