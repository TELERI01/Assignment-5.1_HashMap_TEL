/*
 * CS215
 * @tylerlericos
 * Johnson
 * Hashmap Assignment 5.1
 */
import java.util.*;
import java.io.*;

public class application {

	public static void main(String[] args) throws IOException {
		HashMap<String, String> dictionary = new HashMap<String, String>();
		 // Specify the path to your text file
        String filePath = "/Users/tylerlericos/eclipse-workspace/Assignment 5_1_HashMap_TEL/src/dictionary.txt";
		//Prints the List
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		 String line;
            // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Split the line based on a character, in this case a space is what is used
                String[] parts = line.split("\\s+");
                
                // Ensure the line has the expected format
                if (parts.length == 2) {
                    // Adds the trimmed line to the hashmap
                    dictionary.put(parts[0].trim(), parts[1].trim());
                }



		/*
		 * For loop to print the keys and their values from the dictionary
		 */
		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
		/*
		 * Printing five words and their values using get
		 */
		System.out.println("==================");
		System.out.println("Printing out five keys!");
		System.out.println("Key: Let: " + dictionary.get("let"));
		System.out.println("Key: moil: " + dictionary.get("moil"));
		System.out.println("Key: asunder: " + dictionary.get("asunder"));
		System.out.println("Key: venery: " + dictionary.get("venery"));
		System.out.println("Key: glabriety: " + dictionary.get("glabriety"));

		
	
	}

	}
}
