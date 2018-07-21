import java.util.Vector;
public class RemoveFromVector{
	public static void main(String[] args){
		Vector<String> vector = new Vector<String>();
		vector.add("Gopal");
		vector.add("Sanjay");
		vector.add("Vinit");
		vector.add("Dharmesh");
		vector.add("Fiona");
		System.out.println("Vector elements before remove(): ");
		for(int i=0; i< vector.size(); i++)
		{
			System.out.println(vector.get(i));
		}
		vector.remove("Sanjay");
		vector.remove("Fiona");
		System.out.println("\nVector elements after remove(): ");
		for(int i=0; i < vector.size(); i++)
		{
			System.out.println(vector.get(i));
		}
	}
}