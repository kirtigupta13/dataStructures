import java.util.Stack;
import java.util.Iterator;

public class SortStack {

	/**
	 * @param args
	 */

	public void insert(Stack<Integer> stack, int data) {
		if (stack.isEmpty()) {
			stack.push(data);
			return;

		} else {
			if (data > stack.peek()) {
				int topElement = stack.pop();
				insert(stack, data);
				stack.push(topElement);
			} else {
				stack.push(data);
			}

		}
	}

	public Stack meth(Stack<Integer> stack, int data) {
		 sortStack(stack);
//		insert(stack, data);
		return stack;
	}

	public void sortStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int data = stack.pop();
		sortStack(stack);
		insert(stack, data);

	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		SortStack obj = new SortStack();
		for (int i = 0; i < 10; i++) {
			stack.push(((int) (Math.random() * 10)) + 1);
		}
		System.out.println("Original Stack ");
		Iterator it = stack.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		Stack stk = obj.meth(stack, 1);
		System.out.println("Sorted Stack");
		Iterator it2 = stk.iterator();
		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}
	}

}
