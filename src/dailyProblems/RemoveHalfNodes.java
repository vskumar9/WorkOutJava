package dailyProblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
	int data;
	Node left, right;
	Node(int d){
		this.data = d;
		left = right = null;
	}
}

class BuildTree{
	
	static Node buildTree(String str) {
		if(str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}
		
		String[] ip = str.split(" ");
		
		Node root = new Node(Integer.parseInt(ip[0]));
		
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root);
		int i = 1;
		
		while(queue.size() > 0 && i < ip.length) {
			Node currNode = queue.peek();
			queue.remove();
			
			String currVal = ip[i];
			
			if(!currVal.equals("N")) {
				currNode.left = new Node(Integer.parseInt(currVal));
				queue.add(currNode.left);
			}
			
			i++;
			
			if(i >= ip.length) break;
			
			currVal = ip[i];
			
			if(!currVal.equals("N")) {
				currNode.right = new Node(Integer.parseInt(currVal));
				queue.add(currNode.right);
			}
			
			i++;
		}
		
		return root;
		
	}
	
	static void printInOrder(Node root) {
		if(root == null) return;
		printInOrder(root.left);
		System.out.print(root.data + " ");
		printInOrder(root.right);
	}
}


public class RemoveHalfNodes {
	
	static Node removeHalfNodes(Node root) {
		
		if(root == null) return null;
		
		root.left = removeHalfNodes(root.left);
		root.right = removeHalfNodes(root.right);
		
		if(root.left != null && root.right == null)
			return root.left;
		if(root.left == null && root.right != null)
			return root.right;
		return root;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		BuildTree build = new BuildTree();
		Node root = build.buildTree(s);
		Node fresh = removeHalfNodes(root);
		build.printInOrder(root);
	}

}
