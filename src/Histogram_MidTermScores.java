import java.io.*;
import java.util.*;
import acm.program.*;

public class Histogram_MidTermScores {
	private static Scanner input = new Scanner(System.in);
	private static int[] scores = new int[11];
	private static String userInput;
	private static File file;
	private static FileReader fr;
	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		System.out.println("Enter file name of test scores: ");
		userInput = input.nextLine();
		file = new File(userInput);

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException ex) {
			System.out.println("Image file not found.");
		} catch (IOException ex) {
			System.out.println("User error.");
		}

		assignScoreRange();
		printStars(scores);
		br.close();
	}

	private static void assignScoreRange() {
		String temp1;	
		try {
			while (true) {
				temp1 = br.readLine();
				if(temp1 == null) break;
				temp1 = temp1.trim();
				int temp = Integer.parseInt(temp1);
				 
				if(temp > 0  && temp  <10)
					scores[0] ++;
				if(temp > 10 && temp  <20)
					scores[1] ++;
				if(temp > 20 && temp  <30)
					scores[2] ++;
				if(temp > 30 && temp  <40)
					scores[3] ++;
				if(temp > 40 && temp  <50)
					scores[4] ++;
				if(temp > 50 && temp  <60)
					scores[5] ++;
				if(temp > 60 && temp  <70)
					scores[6] ++;
				if(temp > 70 && temp  <80)
					scores[7] ++; 
				if(temp > 80 && temp  <90)
					scores[8] +=1;
				if(temp > 90 && temp <100)
					scores[9] +=1;
				if(temp == 100 )
					scores[10]++;
				
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	private static void printStars(int[] arr) {
		for(int i = 0; i < arr.length; i ++) {
			int stars = arr[i];
			if(i == 0)
				System.out.println("00-09:  ");
			else if (i == 10) 
				System.out.print(" 100 : ");
			else 
				System.out.print((i * 10) + "-" + ((i * 10) + 9) + ": ");
			for(int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}
}
