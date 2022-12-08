package Evaluation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SearchPDF {
	static Set<String> hashSearchUnique = new HashSet<String>();
	static List<String> listDuplicateSearch = new ArrayList<>();

	public static void searchWordPDF() throws IOException {

		/* with modification */
		Scanner sc = new Scanner(System.in);
		String[] words = null;
		int count=0;

//		System.out.println("Enter the number of words you want to search:");
//		Integer numberOfWords = sc.nextInt();

		// list
		ArrayList<String> wordList = new ArrayList<>(); // all words inside

		boolean findwordsList = true;
		while (findwordsList) {
			System.out.println("Please Enter the Word you would like to search for: ");
			String word = sc.next();
			wordList.add(word);
			System.out.println("Press 1 To Add New word , Press 0 To Go Out Of The Option");
			int exitInput = sc.nextInt();
			if (exitInput == 0) {

				findwordsList = false;
			}
		}

		//System.out.println("The words in array list is:  " + "  " + wordList); // This line has been done just for Checking

		for (String ws : wordList) { // iterate ion each word in the list
			List<String> lineFromFiles = Files.readAllLines(Paths.get("dogBreedAPI.pdf")); // go to the file
			for (String lineVariable : lineFromFiles) {
				if (lineVariable.contains(ws)) {
					System.out.println("Word : " + ws + "  is Available yaay!!! :)");

				} else {

					System.out.println(ws + "  " + "Word not available :( Try another word");
				}

			}
			if (count!=0){ // check for count not equal to zero
				System.out.println("The given word is present for" +count+ " Times in the file");
			}
			else {
				System.out.println("the word is not available in file");
			}

		}

	}

	public static void duplicateWordFind() throws IOException {
		System.out.println("The Unique search is " + " " + hashSearchUnique);

		for (String search : listDuplicateSearch) {
			if (hashSearchUnique.add(search) == false) {
				System.out.println("The Deplicate search are: " + " " + search);

			}

		}
	}
}
