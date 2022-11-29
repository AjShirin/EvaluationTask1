package Evaluation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Search {

	public static void searchWord() throws IOException {
	    System.out.println("Please Enter the Word you would like to search for: ");
	    Scanner userSc = new Scanner(System.in);
	    String name = userSc.nextLine();

	    List<String> lineFromFiles = Files.readAllLines(Paths.get("dogBreedAPI.txt"));
	    for (String lineVariable : lineFromFiles) {
	        if (lineVariable.contains(name)) {
	        	System.out.println("Word : " + name + "  is Available yaay!!! :)"); 
	            System.out.println(lineVariable);
	        }
	        else {
	        	System.out.println("Word not available :(");
	        }
	    }
	}
}