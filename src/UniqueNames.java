import java.util.*;

public class UniqueNames {
	static Scanner input = new Scanner(System.in);
	static ArrayList<String> nameList = new ArrayList<String>();
	static String name;

	public static void main(String[] args) {

		while (true)  {
			System.out.println("Enter a name: ");
			name = input.nextLine();
			name = name.toLowerCase();
		
			
			if (!(nameList.contains(name))) {
				nameList.add(name);
			}
			if (name.equals(""))
			break;
		}	
		printMethod();
	} 
	private static void printMethod() {
		System.out.println("Unique name list:");
		for(int i = 0; i < nameList.size(); i ++) {
			System.out.println(nameList.get(i));
		}
	}
}


//as long as the name is not blank, continue to ask to enter a name
//prompt + read input
//as long as the list of names does not have this current name, add this current name to the list of names
//run through the list of names, printing them, one to a line