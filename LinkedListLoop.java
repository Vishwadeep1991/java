package loop.com;
import java.util.*;

public class LinkedListLoop{

   public static void main(String args[]) {
      LinkedList<String> linkedlist=new LinkedList<String>();
      linkedlist.add("Apple");
      linkedlist.add("Orange");
      linkedlist.add("Mango");
      System.out.println("**For loop**");
      for(int num=0; num<linkedlist.size(); num++)
      {
    	  System.out.println(linkedlist.get(num));
      }
      System.out.println("**Advanced For loop**");
      for(String str: linkedlist)
      {
    	  System.out.println(str);
      }
      System.out.println("**Iterator**");
      Iterator i = linkedlist.iterator();
      while (i.hasNext()) {
	  System.out.println(i.next());
      }
      System.out.println("**While Loop**");
      int num = 0;
      while (linkedlist.size() > num) {
	  System.out.println(linkedlist.get(num));
	  num++;
      }

   }
}