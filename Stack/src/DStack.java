
public class DStack {
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;

	public void push(int data) {
		if (size() == capacity)
			expand();
		stack[top] = data;
		top++;
	}

	public int size() {
		return top;
	}

	public void expand() {
		capacity *= 2;
		int new_stack[] = new int[capacity];
		System.arraycopy(stack, 0, new_stack, 0, top);
		stack = new_stack;
	}

	public void show() {
		for (int n : stack)
			System.out.println(n);
	}

	public void pop() {
		if (size() <= (capacity / 2) / 2)
			shrink();
		top--;
		stack[top] = 0;
	}

	public void shrink() {
		capacity = capacity / 2;
		int new_stack[] = new int[capacity];
		System.arraycopy(stack, 0, new_stack, 0, top);
		stack = new_stack;
	}
}
