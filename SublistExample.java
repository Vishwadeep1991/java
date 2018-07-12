import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
public class SublistExample{
  public static void main(String[] args) {
    LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.add("Item1");
    linkedlist.add("Item2");
    linkedlist.add("Item3");
    linkedlist.add("Item4");
    linkedlist.add("Item5");
    linkedlist.add("Item6");
    linkedlist.add("Item7");
    System.out.println("LinkedList elements:");
    Iterator it= linkedlist.iterator();
    while(it.hasNext()){
       System.out.println(it.next());
    }
    List sublist = linkedlist.subList(2,5);
    System.out.println("\nSub List elements:");
    Iterator subit= sublist.iterator();
    while(subit.hasNext()){
       System.out.println(subit.next());
    }
    sublist.remove("Item4");
    System.out.println("\nLinkedList elements After remove:");
    Iterator it2= linkedlist.iterator();
    while(it2.hasNext()){
       System.out.println(it2.next());
    }
 }
}