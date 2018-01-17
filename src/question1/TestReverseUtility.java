package question1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Map;

import question1.reverseUtility.ReverseLines;

public class TestReverseUtility {

	public static void main(String[] args) {
		
		ReverseLines revLine = new ReverseLines();
		
		System.out.println("Preparing file and print writer...");
		try {
			PrintWriter out = new PrintWriter(new FileWriter(new File("Output.txt"), true));
			System.out.println("Reading file..");
			Map<Integer, ArrayList<String>> output = revLine.readFile("test.txt");
			System.out.println("Writing to file..");
			for (Map.Entry<Integer, ArrayList<String>> entry : output.entrySet()) {
			    int key = entry.getKey().intValue();
			    ArrayList<String> words = entry.getValue();
			    for (String word : words) {
			    	out.print(word + " ");
			    }
			    if(key < output.size()) {
			    	out.println();
			    }
			}
			System.out.println("Process complete..");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
