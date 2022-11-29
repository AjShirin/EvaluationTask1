package Evaluation;

import java.util.Scanner;


public class MainRunE {
	

	static void choicesFunction() {
		
		System.out.println("***************************");
		System.out.println("Welcome...Please Select one of the following options:");
		System.out.println("1. Fetch API And Save in File");
		System.out.println("2. Search from file");
		System.out.println("3. Exit the system ");
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
				System.out.println("Exiting The System Bye See you Again :)!....");
				System.exit(0);
				
				
				break;
				
			}

		} while (true);
	}

}
