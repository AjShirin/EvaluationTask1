package Evaluation;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class PDFReader {
	public static void pdfReaderFunction() throws IOException {
		try {
			PDDocument document = PDDocument.load(new File("C:\\Users\\user020\\Downloads\\API.pdf"));
			
			PDFTextStripper pdfText = new  PDFTextStripper();
			
			String pdftextdata = pdfText.getText(document);
			System.out.println(pdftextdata);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
