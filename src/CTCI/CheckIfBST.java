/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }
*/
    ArrayList<Integer> alist=new ArrayList<Integer>();
    boolean checkBST(Node root){
    if(root==null)
    {
    return true;
    }
    getList(root);
    for(int i=1;i<alist.size();i++)
    {
    if(alist.get(i-1)>=alist.get(i))
    {
    return false;
    }
    }
    return true;
    }
    void getList(Node root)
    {
    if(root==null)
    {
    return;
    }
    getList(root.left);
    alist.add(root.data);
    getList(root.right);
    }
