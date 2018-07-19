import java.util.Vector;
public class SearchVector{
  public static void main(String[] args){ 
     Vector<String> vector = new Vector<String>();
     vector.add("Kunal");
     vector.add("Pankaj");
     vector.add("Chetan");
     vector.add("Kaal");
     vector.add("Pankaj");
     vector.add("Mohan");
     vector.add("Pankaj");
     int first_index = vector.indexOf("Pankaj");
     System.out.println("First Occurrence of Pankaj at index: "+first_index);
     int last_index = vector.lastIndexOf("Pankaj");
     System.out.println("Last Occurrence of Pankaj at index: "+last_index);
     int after_index = vector.indexOf("Pankaj", 2);
     System.out.println("Occurrence after index 2: "+after_index);
     int before_index = vector.lastIndexOf("Pankaj", 6);
     System.out.println("Occurrence before index 6: "+before_index);
  } 
}