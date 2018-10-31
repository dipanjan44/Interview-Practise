package Tree;

public class BSTImpl {

    TreeNode root;

    public BSTImpl()
    {
        this.root=null;
    }

    public TreeNode insertNode(TreeNode root, int data)
    {

        if (root == null)
        {
            TreeNode newNode = new TreeNode(data);
            root=newNode;
            return root;
        }

        if (root.data < data)
        {
            root.right= insertNode(root.right,data);
        }

        if( root.data >=data)
        {
            root.left=insertNode(root.left,data);
        }

        return root;

    }


    public boolean isPresent(TreeNode root, int value)
    {

        if (root == null || root.data == value)
        {
            return true;
        }

        if (root.data < value)
          return isPresent(root.right,value);

        else
            return isPresent(root.left,value);

    }
}
