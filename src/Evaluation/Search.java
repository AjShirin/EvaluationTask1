package Evaluation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Search {
	
	public static void searchWordFunction ()throws IOException, InterruptedException{
		 
	boolean Exit = true;
	File directoryVariable = new File("C:\\Users\\user020\\Desktop\\Eclipse\\Solo_Project_School_System-M");
	FilenameFilter textFilter = new FilenameFilter() {
           public boolean accept(File dir,String name){
        	   return name.toLowerCase().endsWith(".txt");
           }
	};
           
	File[] files = directoryVariable.listFiles(textFilter);//error
	for(File file:files)
	{
		if (file.isDirectory()) {
			System.out.print("directory:");
		} else {
			System.out.print("     file:");
		}
		System.out.println(file.getCanonicalPath());
	}

	File firstFile = new File("C:\\Users\\user020\\Desktop\\Eclipse\\Solo_Project_School_System-M\\src\\RandomUserAPI\\APIDocumentation.txt"); // Creation of File Descriptor for input
																				// file
	String[] words = null; // Intialize the word Array
	FileReader fileReaderVariable = new FileReader(firstFile); // Creation of File Reader object
	BufferedReader bufferReaderVariable = new BufferedReader(fileReaderVariable); // Creation of BufferedReader object
	String normalString;
	System.out.println("Please Write word to be Search :");
	
	Scanner userScanner = new Scanner(System.in);
	String input = userScanner.next(); // Input word to be searched
	int countWord = 0; // Intialize the word to zero
	while((normalString=bufferReaderVariable.readLine())!=null) // Reading Content from the file
	{
		words = normalString.split(" "); // Split the word using space

		for (File fileVariableC : files) {
			for (String wordVariable : words) {
				if (wordVariable.equals(input)) // Search for the given word
				{
					System.out.println("The Word is : \t" + input + "\t the file is :\t " + fileVariableC);

					countWord++;
					File filefrom = new File (fileVariableC.getPath());
					File fileto = new File ("C:\\Users\\user020\\Desktop\\Eclipse\\FileSearch\\"+fileVariableC.getName());
					Files.copy(filefrom.toPath(), fileto.toPath(),StandardCopyOption.REPLACE_EXISTING);
							

				}
			}
		}
	}

	if(countWord!=0) // Check for count not equal to zero
	{
		System.out.println("The given word is there for " + countWord + " Times in the file");

	}else
	{
		System.out.println("The given word is not available in the file");
	}


fileReaderVariable.close();
	 }
}



