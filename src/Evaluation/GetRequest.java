package Evaluation;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;






public class GetRequest {
	public static void apiRequestFunction()throws IOException, InterruptedException{


        HttpClient apiClient = HttpClient.newHttpClient();
        HttpRequest apiRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://dog.ceo/api/breeds/image/random")) 
                .build();// fetching the API

        HttpResponse<String> fetchAPI = apiClient.send(apiRequest,
                HttpResponse.BodyHandlers.ofString());

        System.out.println("The JSON of the API is :" +fetchAPI.body());
        
               
        /*Write file*/
        String writeToFile = fetchAPI.body();
        
        try {
	         FileWriter fileTxt = new FileWriter("dogBreedAPI.txt");
	         FileWriter filePDF = new FileWriter("dogBreedAPI.pdf");
	         fileTxt.write(writeToFile.toString());
	         filePDF.write(writeToFile.toString());
	         fileTxt.close();
	         filePDF.close();
	         
	      } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      System.out.println("JSON file hase been Saved Successfully! :)");
	}
}