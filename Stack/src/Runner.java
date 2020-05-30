
public class Runner {
	public static void main(String args[])
	{
		StackImplementation_FixedArray st = new StackImplementation_FixedArray();
		/*DStack ds = new DStack();
		 ds.push(2);
		 ds.push(3);
		 ds.push(4);
		 ds.push(5);
		 ds.push(6);
		 ds.pop();
		 ds.pop();
		 ds.pop();
		 ds.pop();
		 ds.show();*/
		 
		     //  System.out.println("Empty = "+st.isEmpty());
				st.push(4);
				st.push(5);
				st.push(6);
				st.push(9);
				
				//System.out.println("Empty = "+st.isEmpty());
				//System.out.println("peeked value is" +st.peek());
				//System.out.println("poped value is" +st.pop());
				//System.out.println("Empty = "+st.isEmpty());
				st.push(12);
				st.show();
				/*System.out.println("size is "+st.size());
				System.out.println("poped value is" +st.pop());
				System.out.println("poped value is" +st.pop());
				System.out.println("poped value is" +st.pop());
				System.out.println("poped value is" +st.pop());
				System.out.println("poped value is" +st.pop());
				System.out.println("poped value is" +st.pop());
				
				//System.out.println("Empty = "+st.isEmpty());
			    
			    System.out.println("size is "+st.size());*/
		        
			}
}
