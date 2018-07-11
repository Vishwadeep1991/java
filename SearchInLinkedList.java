import java.util.LinkedList;
public class SearchInLinkedList{
 
  public static void main(String[] args){
     LinkedList<String> linkedlist = new LinkedList<String>();
     linkedlist.add("Swapnaja");
     linkedlist.add("Tanmay");
     linkedlist.add("Urvashi");
     linkedlist.add("Swapnaja");
     linkedlist.add("Rohit");
     linkedlist.add("Swapnaja");
     int firstIndex = linkedlist.indexOf("Swapnaja");
     System.out.println("First Occurrence: " + firstIndex);
     int lastIndex = linkedlist.lastIndexOf("Swapnaja");
     System.out.println("Last Occurrence: " + lastIndex);
  }
}
