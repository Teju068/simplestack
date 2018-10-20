package stackimplementation;

import static  stackimplementation.Utils.printf;

import java.util.Scanner;
/**
 * 
 * @author tvishwakarma
 * Stack Implementation using Integers
 */
public class JStack {

	public static void main(String[] args) {

		printf("*********Welcome to JStack******");
		Scanner scanner = new Scanner(System.in);
		Stack stack = new Stack();
		do {
		
		printf("Enter your choice");
		printf("Enter 1 for push ==>");
		printf("Enter 2 for pop ==>");
		printf("Enter 3 for traverse ==>");
		switch(scanner.nextInt()) {
		case 1:
			printf("Enter the value you want to push");
			int value = scanner.nextInt();
			stack.push(value);
			break;
		case 2:
			stack.pop();
			break;
		case 3:
			printf("Size :" + stack.size());
			stack.traverse();
			break;
		}
	  }while(true);
	}
}
