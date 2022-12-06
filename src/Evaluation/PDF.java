//package Evaluation;
//
//import com.itextpdf.text.pdf.PdfWriter;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
//
///**
// * First iText example: Hello World.
// */
//public class PDF {
//
//    /** Path to the resulting PDF file. */
//    public static final String RESULT
//        = "C:\\Users\\user020\\Desktop\\Eclipse\\EvaluationTask1\\test.pdf";
//
//    /**
//     * Creates a PDF file: hello.pdf
//     * @param    args    no arguments needed
//     */
//    public static void main(String[] args)
//        throws DocumentException, IOException {
//        new PDF().createPdf(RESULT);
//    }
//
//    /**
//     * Creates a PDF document.
//     * @param filename the path to the new PDF document
//     * @throws    DocumentException 
//     * @throws    IOException 
//     */
//    public void createPdf(String filename)
//    throws DocumentException, IOException {
//        // step 1
//        Document document = new Document();
//        // step 2
//        PdfWriter.getInstance(document, new FileOutputStream(filename));
//        // step 3
//        document.open();
//        // step 4
//        document.add(new Paragraph("Hello World!"));
//        // step 5
//        document.close();
//    }
//}
//
//
////public class PDF {
////	
////	// Creating a PdfWriter 
////	String file = "C:\\Users\\user020\\Desktop\\Eclipse\\EvaluationTask1\\dogBreedAPI.pdf"; 
////	PdfWriter writer = new PdfWriter();
////
////}
//	
//
//
//
