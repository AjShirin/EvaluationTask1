package Evaluation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Search {
	static Set<String> hashSearchUnique = new HashSet<String>();
	static List<String> listDuplicateSearch = new ArrayList<>();

	public static void searchWord() throws IOException {

		/* with modification */
		Scanner userNumberSc = new Scanner(System.in);

		System.out.println("Enter the number of words you want to search:");
		Integer numberOfWords = userNumberSc.nextInt();

		System.out.println("++++++++++++++++");
		System.out.println("the search will be done one by one.");
		System.out.println("++++++++++++++++");

		for (int i = 0; i < numberOfWords; i++) {
			System.out.println("Please Enter the Word you would like to search for: ");
			Scanner userSc = new Scanner(System.in);
			String name = userSc.nextLine();

			listDuplicateSearch.add(name);
			hashSearchUnique.add(name);

			List<String> lineFromFiles = Files.readAllLines(Paths.get("dogBreedAPI.txt"));
			for (String lineVariable : lineFromFiles) {
				if (lineVariable.contains(name)) {
					System.out.println("Word : " + name + "  is Available yaay!!! :)");
					System.out.println("++++++++++++++++");
					System.out.println(lineVariable);
					System.out.println("++++++++++++++++");
				} else {

					System.out.println(name + "  " + "Word not available :(");

				}

			}

		}
		
		System.out.println("The Unique search is " + " " + hashSearchUnique);

		for (String search : listDuplicateSearch) {
			if (hashSearchUnique.add(search) == false) {
				System.out.println("The Deplicate search are: " + " " + search);
				

			}

		}

	}
}
