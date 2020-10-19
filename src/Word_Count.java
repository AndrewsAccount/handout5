import java.io.*;
import java.util.*;

public class Word_Count {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int wordCounter = 0;
		int lineCounter = 0;
		int charCounter = 0;
		String temp;
		
		System.out.println("Please enter a file name.");
		String file = input.nextLine();
		File fileName = new File (file);
		
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader bf = new BufferedReader(fr);
		
			while (true) {
				temp = bf.readLine();
				if(temp == null)  {
					break;
				}
				else {
				temp.trim();
				charCounter += temp.length();
				String[] countThisLine = temp.split("( )|(')");
				wordCounter += countThisLine.length;
				lineCounter++;
				}
			}
			input.close();
			bf.close();
		}
		catch(FileNotFoundException error) {
			System.out.println("File name not found.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Word counter: " + wordCounter);
		System.out.println("Line counter: " + lineCounter);
		System.out.println("Character counter: " + charCounter);
	}
}
//Count words in a txt file
//counter
//user enter file name
//exception in case name does not exist
//array to hold the words in the file
//read through file line by line
//store each word in a dynamic arraylist
//loop through list to count the words
//do not count empty spaces at the end of sentences

//filereader
//bufferedreader

//variables
//counter
//file holder
