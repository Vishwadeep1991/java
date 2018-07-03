import java.util.LinkedList;
class LinkedListFront{

  public static void main(String[] args) {

     LinkedList<String> list = new LinkedList<String>();
     list.add("AA");
     list.add("BB");
     list.add("CC");
     list.add("DD");
     System.out.println("LinkedList Elements:"+list);
     list.offerFirst("NEW Element");
     System.out.println("LinkedList After Addition:"+list);
  }
}