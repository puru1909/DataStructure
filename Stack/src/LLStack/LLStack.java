package LLStack;

public class LLStack {
	StackNode top;
	
	public void push(int data)
	{
		StackNode sn = new StackNode();
		sn.data=data;
		sn.next=null;
		
		if (top==null)
		{
			 top = sn;
		}
		else
		{
			sn.next=top;
			top = sn;
		}
	}
	
	public void pop()
	{
		
		if(top==null)
		{
			System.out.println("stack is underflow");
		}
		else
		{
			System.out.println("poped value is" + top.data);
			StackNode n;
			n=top.next;
			top=n;
		}
	
	}
	public void peek()
	{
		System.out.println("peeked value is" +top.data);
	}
	public void size(){
		int size=0;
		StackNode n=top;
		while(n.next!=null)
		{
			size++;
			n=n.next;
		}
		size++;
		System.out.println("size of the stack is " + size);
	}
	
	public void show(){
		if(top==null)
		{
			System.out.println("stack is empty");
		}
		else{
		StackNode n=top;
		while(n.next!=null){
			System.out.println(n.data);
			n=n.next;	
		}
		System.out.println(n.data);
	}
	}

}
