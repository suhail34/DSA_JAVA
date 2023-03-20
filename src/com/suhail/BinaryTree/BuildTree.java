package com.suhail.BinaryTree;

import java.util.*;

public class BuildTree {
    public static Node build(Node root){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Data : ");
        int data = sc.nextInt();
        root=new Node(data);
        if(data==-1){
            return null;
        }
        System.out.println("Enter Data for inserting in left of : "+ data);
        root.left=build(root.left);
        System.out.println("Enter Data for inserting in right of : "+data);
        root.right=build(root.right);
        return root;
    }

    public static void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void postorder(Node node){
        if(node==null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }

    public static void inorder(Node node){
        if(node==null){
            return;
        }

        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    public static List<List<Integer>> levelorder(Node root){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();
        if(root==null){
            return wrapList;
        }
        queue.offer(root);
//        System.out.println(queue.toArray());
        while (!queue.isEmpty()){
            int levelNum = queue.size();
//            System.out.println(levelNum);
            List<Integer> subList = new LinkedList<>();
            for (int idx=0;idx<levelNum;idx++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().data);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }

    public static void iterPreorder(Node node){
        if(node==null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            node = stack.pop();
            System.out.print(node.data+" ");
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
    }

    public static void iterInorder(Node node) {
        if (node==null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        while (true) {
            if(node!=null) {
                stack.push(node);
                node = node.left;
            }else {
                if(stack.isEmpty()){
                    break;
                }
                node=stack.pop();
                System.out.print(node.data+" ");
                node=node.right;
            }
        }
    }

    public static void iterPostorder1Stack(Node node) {
        if(node==null){
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(node);
        while (!stack1.isEmpty()){
            node=stack1.pop();
            stack2.add(node);
            if(node.left!=null){
                stack1.push(node.left);
            }
            if(node.right!=null){
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()){
            System.out.print(stack2.pop().data+" ");
        }
    }

    public static int height(Node node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);

        return 1+Math.max(left,right);
    }

    public static int diameter(Node node) {
        if (node == null) {
            return 0;
        }

        int leftdia = diameter(node.left);
        int rightdia = diameter(node.right);
        int height = height(node.left)+height(node.right)+1;

        return Math.max(leftdia,Math.max(rightdia,height));
    }

    public static void main(String[] args) {
        Node root=null;
        root=build(root);

        System.out.println("Recursive Pre Order Traversal of Binary Tree");
        preorder(root);
        System.out.println();
        System.out.println("Iterative Pre order Traversal of Binary Tree");
        iterPreorder(root);
        System.out.println();
        System.out.println("Recursive Post Order Traversal of Binary Tree");
        postorder(root);
        System.out.println();
        System.out.println("Iterative Post Order Traversal of Binary Tree");
        iterPostorder1Stack(root);
        System.out.println();
        System.out.println("Recursive In Order Traversal of Binary Tree");
        inorder(root);
        System.out.println();
        System.out.println("Iterative In Order Traversal of Binary Tree");
        iterInorder(root);
        System.out.println();
        System.out.println("Level Order Traversal");
        System.out.println(levelorder(root));
        System.out.println();
        System.out.println("Height of binary tree is : "+height(root));
        System.out.println();
        System.out.println("Diameter of binary tree : "+diameter(root));
    }
}
