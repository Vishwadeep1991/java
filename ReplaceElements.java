import java.util.Vector;

public class ReplaceElements{
	public static void main(String[] args){
	Vector<String> vector = new Vector<String>();
	vector.add("Amit");
	vector.add("Omkar");
	vector.add("Gopal");
	vector.add("Suresh");
	vector.add("Fiza");
	vector.add("Dhammapriya");
	vector.add("Tushar");
	vector.add("Dilip");
	vector.add("Vicky");
	vector.add("Palash");
	vector.add("Hemant");
	vector.add("Anushree");
	vector.add("Sameer");
	vector.add("Kajal");
	vector.add("Yash");
	System.out.println("Vector elements before replacement: ");
	for(int i=0; i < vector.size(); i++)
	{
		System.out.println(vector.get(i));
	}
	vector.set(3,"Vrushali");
	vector.set(7,"Subramanian");
	vector.set(8,"Tamanna");
	vector.set(10,"Ileana");
	vector.set(14,"Kunal");
	System.out.println("Vector elements after replacement:");
	for(int i=0; i < vector.size(); i++)
	{
		System.out.println(vector.get(i));
	}
	}
}