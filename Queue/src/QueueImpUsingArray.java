
public class QueueImpUsingArray {
	int front,size,rear=0;
	int queue[] = new int[5];
	
	public void enqueue(int data)
	{
		if(rear>4)
		{
			System.out.println("queue is overfull " + data + " can't be inserted");
		}
		else{
		queue[rear]=data;
		rear++;
		size++;
		}
	}
	public void show()
	{
		for(int n : queue)
		{
			System.out.print(" " + n );
		}
	}
	/*public void size()
	{
		System.out.println("size of the queue is " + rear++);
	}*/
	public void dequeue(){
		if(front>rear)
		{
			System.out.println("queue is empty");
		}
		else
		{
		System.out.println("poped value is " +queue [front]);
		queue[front]=0;
		front++;
		size--;
		}
	}
	

}
