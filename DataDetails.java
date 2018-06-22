//Arraylists of string type
import java.util.*;
public class DataDetails  {

	public static void main(String args[]){
	   ArrayList<String> listofcountries = new ArrayList<String>();
	   listofcountries.add("India");
	   listofcountries.add("Russia");
	   listofcountries.add("America");
	   listofcountries.add("China");

	   System.out.println("Before Sorting:");
	   for(String counter: listofcountries){
           System.out.println(counter);
		}

	   Collections.sort(listofcountries);
	   System.out.println("After Sorting:");
	   for(String counter: listofcountries){
           System.out.println(counter);
		}
	}
}