//Use of Collections.ncopies
import java.util.*;

public class Details {
   public static void main(String args[]) {
	   ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(15, 10));
	  System.out.println("ArrayList items: "+intlist);
   }
}