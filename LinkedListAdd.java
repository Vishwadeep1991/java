import java.util.LinkedList;
class LinkedListAdd{

  public static void main(String[] args) {

     LinkedList<String> list = new LinkedList<String>();
     list.add("Sushil");
     list.add("Abhishek");
     list.add("Tushar");
     list.add("Vishal");
     System.out.println("LinkedList elements: "+list);
     list.add("Keshav");
     System.out.println("LinkedList elements: "+list);
  }
}