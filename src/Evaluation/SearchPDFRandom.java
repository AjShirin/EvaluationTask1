package Evaluation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class SearchPDFRandom {
	public static void PDFRandomSearchFunction() throws IOException {

		 String file = "C:\\Users\\user020\\Downloads\\API.pdf";
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the word you want to search for: ");
		 String searchWord1 = sc.nextLine(); 
		 PDDocument document = PDDocument.load(new File(file)); 
		 PDFTextStripper stripper = new PDFTextStripper(); 
		 String text = stripper.getText(document); 
		 if (text.contains(searchWord1)) {
			 System.out.println("The word was found in the PDF document!");
		 } else {
			 System.out.println("The word was not found in the PDF document."); }
		 document.close();
		 Path temp = Files.copy(Paths.get("C:\\Users\\user020\\Downloads\\API.pdf"),Paths.get("C:\\Users\\user020\\Desktop\\Eclipse\\EvaluationTask1//APISearchWords.pdf"));
		 if (temp !=null) {
			 System.out.println("Congratz File has been moved successfully!!.");
		 }
	}
}