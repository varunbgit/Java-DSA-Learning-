package com.varun;

public class ConvertbinaryTreetoDLL {
    static class Node {
        int key;
        Node left;
        Node right;

        Node(int k) {
            key = k;
            left = right = null;
        }
    }
    public static void main(String args[])
        {
            Node root=new Node(10);
            root.left=new Node(5);
            root.right=new Node(20);
            root.right.left=new Node(30);
            root.right.right=new Node(35);

            Node head=BTToDLL(root);
            printlist(head);
        }
        static Node prev = null;

        private static Node BTToDLL(Node root) {
            if(root == null){
                return null;
            }
            Node head = BTToDLL(root.left);
            if(prev==null){
                head = root;
            }
            else{
                 prev.right = root ;
                 root.left = prev;
            }
            BTToDLL(root.right);
            prev = root;
            return head;
        }


        public static void printlist(Node head){
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.key+" ");
                curr=curr.right;
            }
        }
}
