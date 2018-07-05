import java.util.LinkedList;
public class RemoveFromLinkedList{
 
 public static void main(String[] args){
    LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.add("Swift");
    linkedlist.add("AngularJS");
    linkedlist.add("Python");
    linkedlist.add("CoreJava");
    linkedlist.add("AdvanceJava");
    System.out.println("LinkedList Elements:");
    for(String str: linkedlist){
       System.out.println(str);
    }
    Object e1 = linkedlist.remove(2);
    System.out.println("\nElement "+ e1+ " removed from the list\n");
    System.out.println("After removal:");
    for(String str2: linkedlist){
       System.out.println(str2);
    }
 }
}