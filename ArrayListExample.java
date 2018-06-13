//ArrayList 
import java.util.*;

public class ArrayListExample {
   public static void main(String args[]) {
      
	  ArrayList<String> obj = new ArrayList<String>();

	  obj.add("Varun");
	  obj.add("Sameer");
	  obj.add("Chaitanya");
	  obj.add("Sonu");
	  obj.add("Anuj");

	   System.out.println("Currently the array list has following elements:"+obj);

	  obj.add(0, "Rahul");
	  obj.add(1, "Vishal");

	   obj.remove("Chaitanya");
	  obj.remove("Sonu");

	  System.out.println("Current array list is:"+obj);

	  obj.remove(1);

	  System.out.println("Current array list is:"+obj);
   }
}