package dailyProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Node1{
	int data;
	Node1 left, right;
	
	public Node1(int d) {
		data = d;
		left = right = null;
	}
}

public class MergeTwoBST {

	static Node1 buildTree(String str) {
		if(str.length() == 0 || str.equals('N')) return null;
		String[] s = str.split(" ");
		
		Node1 root = new Node1(Integer.parseInt(s[0]));
		Queue<Node1> q = new LinkedList<Node1>();
		q.add(root);
		int i =1;
		while(!q.isEmpty() && i < s.length) {
			Node1 currNode1 = q.remove();
			String currVal = s[i];
			
			if(!currVal.equals("N")) {
				currNode1.left = new Node1(Integer.parseInt(currVal));
				q.add(currNode1.left);
			}
			
			i++;
			if(i >= s.length) break;
			currVal = s[i];
			
			if(!currVal.equals("N")) {
				currNode1.right = new Node1(Integer.parseInt(currVal));
				q.add(currNode1.right);
			}
			i++;
		}
		return root;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		Node1 root1 = buildTree(s);
		
		s = sc.nextLine();
		Node1 root2 = buildTree(s);
		
		List<Integer> ans = merge(root1, root2);
		for(int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
		System.out.println();

	}


	private static List<Integer> merge(Node1 root1, Node1 root2) {
		// TODO Auto-generated method stub
		List<Integer> list1 = inOrderTravesal(root1);
		List<Integer> list2 = inOrderTravesal(root2);
		return mergedSortedList(list1, list2);
	}

	private static List<Integer> inOrderTravesal(Node1 root) {
		// TODO Auto-generated method stub
		List<Integer> result = new ArrayList<Integer>();
		Stack<Node1> stack = new Stack<Node1>();
		Node1 current = root;
		
		while(current != null || !stack.isEmpty()) {
			while(current != null) {
				stack.push(current);
				current = current.left;
			}
			
			current = stack.pop();
			result.add(current.data);
			current = current.right;
			
		}
		return result;
	}

	private static List<Integer> mergedSortedList(List<Integer> list1, List<Integer> list2) {
		// TODO Auto-generated method stub
		List<Integer> mergedList = new ArrayList<Integer>();
		
		int i = 0, j = 0;
		
		while(i < list1.size() && j < list2.size()) {
			if(list1.get(i) <= list2.get(j)) {
				mergedList.add(list1.get(i));
				i++;
			}
			else {
				mergedList.add(list2.get(j));
				j++;
			}
		}
		
		while(i < list1.size()) {
			mergedList.add(list1.get(i));
			i++;
		}
		while(j < list2.size()) {
			mergedList.add(list2.get(j));
			j++;
		}
			
		return mergedList;
	}



}
