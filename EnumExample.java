/*How to iterate arraylist elements using 
 *Enumeration interface
 */
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Collections;
 
public class EnumExample {
 
   public static void main(String[] args) {
      //create an ArrayList object
      ArrayList<String> arrayList = new ArrayList<String>();
 
      //Add elements to ArrayList
      arrayList.add("C");
      arrayList.add("C++");
      arrayList.add("Java");
      arrayList.add("Php");
      arrayList.add("Python");
 
      // Get the Enumeration object
      Enumeration<String> e = Collections.enumeration(arrayList);
 
      // Enumerate through the ArrayList elements
      System.out.println("ArrayList elements: ");
      while(e.hasMoreElements())
      System.out.println(e.nextElement());
   }
}