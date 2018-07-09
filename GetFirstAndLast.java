import java.util.LinkedList;
public class GetFirstAndLast{
  public static void main(String[] args){
    LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.add("Item1");
    linkedlist.add("Item2");
    linkedlist.add("Item3");
    linkedlist.add("Item4");
    linkedlist.add("Item5");
    linkedlist.add("Item6");
    Object firstElement = linkedlist.getFirst();
    System.out.println("First Element is: "+firstElement);
    Object lastElement = linkedlist.getLast();
    System.out.println("Last Element is: "+lastElement);
 }
}