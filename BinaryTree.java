

public class BinaryTree {

    private Node root;

    public BinaryTree(){
        root = null;
    }

    public void insert(int value){
       root = insert(root, value);
    }

    private Node insert(Node node, int value){
        if(node==null){
            node = new Node();
            node.value = value;
            node.left = null;
            node.right = null;
            return node;
        }

        if( value <= node.value){
            node.left =  insert(node.left, value);
        }else if(value > node.value){
            node.right =  insert(node.right, value);
        }
        return node;
    }

    public void display(){
        if(root != null){
            traverse(root);
        }else{
            System.out.println("No elements existed");
        }
    }
    
    private void traverse(Node node){
        if(node!=null){
            traverse(node.left);
            System.out.println(node.value);
            traverse(node.right);
        }
    }
}
