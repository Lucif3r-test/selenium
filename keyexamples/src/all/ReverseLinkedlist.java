package all;

import java.util.LinkedList;

public class ReverseLinkedlist {

	public static void main(String[] args) 
	{
		// Reverse Linkedlist
		LinkedList l=new LinkedList();
		l.add(1);
		l.add(23);
		l.add(324);
		l.add(42);
		l.add(9);
		System.out.println(l);
		LinkedList l1=new LinkedList();
		for(int i=l.size()-1;i>=0;i--)
		{
			l1.add(l.get(i));
		}
		System.out.println(l1);

	}

}
