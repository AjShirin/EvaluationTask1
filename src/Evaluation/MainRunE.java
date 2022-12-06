package Evaluation;

import java.util.Scanner;


public class MainRunE {
	

	static void choicesFunction() {
		
		System.out.println("***************************");
		System.out.println("Welcome...Please Select one of the following options:");
		System.out.println("1. Fetch API And Save it in TXT and PDF File");
		System.out.println("2. Search from TXT file");
		System.out.println("3. Search from PDF file");
		System.out.println("4. Find Duplicates and Unique words "); // This option dosent work 
		System.out.println("5. Exit the system ");
	}
		
		

	public static void main(String[] args) throws Throwable {
		Scanner userSc = new Scanner(System.in);
		choicesFunction();
		
		do {

			int userInput = userSc.nextInt();
			switch (userInput) {
			case 1:
				
				GetRequest GetRequestObject = new GetRequest();
				GetRequestObject.apiRequestFunction();
				choicesFunction();
				
				break;
				
			case 2:
				
				Search SearchObject = new Search();
				SearchObject.searchWord();
				
				choicesFunction();
				
				
				break;
				
			case 3: 
				SearchPDF SearchPDFObject = new SearchPDF();
				SearchPDFObject.searchWordPDF();
				choicesFunction();
				
				
				break;
				
			case 4: // this case dosent work should check again
				Search SearchObjectUD = new Search();
				SearchObjectUD.duplicateWordFind();
				choicesFunction();
								
				break;
				

			case 5:
				System.out.println("Exiting The System Bye See you Again :)!....");
				System.exit(0);
				
				
				break;
				

				
			}

		} while (true);
	}

}
