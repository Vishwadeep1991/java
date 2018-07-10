import java.util.LinkedList;

public class GetElementExample{
 public static void main(String[] args){
    LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.add("AA");
    linkedlist.add("BB");
    linkedlist.add("CC");
    linkedlist.add("DD");
    linkedlist.add("EE");
    System.out.println("LinkedList Elements : ");
    for(int i=0; i < linkedlist.size(); i++){
      System.out.println("Element at index "+i+" is: "+linkedlist.get(i));
    } 
 }
}