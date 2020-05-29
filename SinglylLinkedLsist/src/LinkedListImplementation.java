
public class LinkedListImplementation {
	
	Node head;
	
	public void insert(int data)
	{
		Node n= new Node();
		n.data=data;
		n.next=null;
		
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node new_node=head;
			while(new_node.next!=null)
			{
				new_node=new_node.next;
			}
			new_node.next=n;
		}	
	}
	
	public void insertAtStart(int data)
	{
		Node new_node= new Node();
		new_node.data=data;
		new_node.next=head;
		
		head=new_node;
	}
	
	public void insertAfter(int x,int data)
	{
		Node new_node=new Node();
		new_node.data=data;
		new_node.next=null;
		
		Node n=head;
		while(n.next!=null)
		{
			if(n.data==x)
			{
				new_node.next=n.next;
				n.next=new_node;	
			}
			n=n.next;
		}
		if(n.data==x)
		{
			n.next=new_node;
		}
		else{
	   	System.out.println("didn;t found the element");
		}
		
	}
	
	public void insertAtIndex(int index,int data)
	{
		Node new_node=new Node();
		new_node.data=data;
		new_node.next=null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else{
		Node n=head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
	
		new_node.next=n.next;
		n.next=new_node;
		}
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		
		else
		{
			Node n=head;
			Node n1=null;
			
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			
		}
	}
 public void show()
 {
	 Node new_node=head;
		while(new_node.next!=null)
		{	
			System.out.println(new_node.data);
			new_node=new_node.next;
		} 
		System.out.println(new_node.data);
 }
 
 public void FindMiddleElement1(){
	 
	 int flag=0;
		
		Node new_node=head;
		while(new_node.next!=null)
		{
			new_node=new_node.next;
			flag++;
		}
		//System.out.println(flag+1);
		int mid=(flag+1)/2;
		
		Node temp=head;
		for(int i=0;i<mid;i++)
		{
			temp=temp.next;
		}
		System.out.println("middle elenent is"+temp.data);
		
	}
 public void FindMiddleElement2(){
	 Node temp=head;
	 Node temp2=head;
	 while(temp2.next!=null)
		{
		 temp2=temp2.next.next;
		 temp=temp.next;
		}
	 System.out.println("middle elenent is"+temp.data);
 }
 public void CircularLinkedList(){
	 Node temp=head;
	 while(temp.next!=null)
	 {
		 System.out.println(temp.data);
		 temp=temp.next; 
	 }
	 System.out.println(temp.data);
	   temp.next=head.next.next;
	 /*  while(temp.next!=null)
		 {
			 System.out.println(temp.data);
			 temp=temp.next; 
		 }
		 System.out.println(temp.data);*/
	   
	   temp=temp.next;
	   System.out.println(temp.data);	
	   temp=temp.next;
	   System.out.println(temp.data);
	   temp=temp.next;
	   System.out.println(temp.data);
	 //temp.next=head;
	// temp=temp.next;
	 
	// System.out.println(temp.data);	 
 }


public void CircularLinkedList2(){
	 Node temp=head;
	 while(temp.next!=null)
	 {
		 System.out.println(temp.data);
		 temp=temp.next; 
	 }
	 System.out.println(temp.data);
	   temp.next=head.next.next;
	 /*  while(temp.next!=null)
		 {
			 System.out.println(temp.data);
			 temp=temp.next; 
		 }
		 System.out.println(temp.data);*/
	   
	   temp=temp.next;
	   System.out.println(temp.data);	
	   temp=temp.next;
	   System.out.println(temp.data);
	   temp=temp.next;
	   System.out.println(temp.data);
	 //temp.next=head;
	// temp=temp.next;
	 
	// System.out.println(temp.data);	
	   
	Node tmp=head;
	Node tmp2=head.next;
	while(tmp!=tmp2)
	 {
		//if(tmp==tmp2)
			//System.out.println("there is a loop");
		
		//else{
		 tmp=tmp.next;
		 tmp2=tmp2.next.next;
		//}
		 
	 }
	System.out.println("loop is there at"+tmp.data);
	
	   
}

}

