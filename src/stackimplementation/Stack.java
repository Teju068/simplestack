package stackimplementation;
import static  stackimplementation.Utils.printf;

/**
 * 
 * @author tvishwakarma
 * <p>
 * Stack Class to handle push, pop
 */
public class Stack {
	
	Node start = null;
	int size = 0;
	
	/**
	 * constructor
	 */
	Stack(){
		
	}

	/**
	 * 
	 * @param data
	 * Data to push to stack
	 */
	public void push(int data) {
		size++;
		Node node = new Node(data,null);
		if(start == null) {
			start = node;
		}else {
			node.setNext(start);
			start = node;
		}
	}
	
	/**
	 * 
	 * @return top item and remove from stack
	 */
	public int pop() {
		size--;
		int topItem;
		topItem = start.getData();
		printf("Items removed" + topItem);
		start = start.getNext();
		return topItem;
	}
	
	/**
	 * 
	 * @return top item, without remove
	 */
	public int peek() {
		int topItem;
		topItem = start.getData();
		return topItem;
	}
	
	/**
	 * Traverse the stack
	 */
	public void traverse() {
		Node traversePtr;
		traversePtr = start;
		while(traversePtr.getNext() != null) {
			printf(traversePtr.getData()+"");
			traversePtr = traversePtr.getNext();
		}
		printf(traversePtr.getData()+"");
	}
	
	/**
	 * get size of Stack
	 * @return size of stack
	 */
	public int size() {
		return size;
	}
}
