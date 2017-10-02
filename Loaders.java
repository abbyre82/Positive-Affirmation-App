import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Loaders {
	
	
	
	public static void LoadQuoteFromFile(String filename){
		Scanner input = null;
		try{
		File file = new File(filename);
		input = new Scanner(file);
		}
		catch(FileNotFoundException e){
			//file not found
		}
		catch(IOException e){
			//handle exception
		}
		while(input.hasNextLine()){
			String line = input.nextLine();
			String[] parts = line.split("\"");
			String text = parts[0];
			String[] parts1 = parts[1].split("@");
			String[] parts2 = parts1[1].split("$");
			String author = parts2[0].trim();
			String category = parts2[1].trim();
			Quote quote = new Quote(text,author,category);
 		}
	}
}
