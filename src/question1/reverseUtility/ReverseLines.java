package question1.reverseUtility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



public class ReverseLines {
	
	/*
	 * Method takes a file name and reads the file and stores the contents of the
	 * file into a Map with key as the line number and value an array of words.
	 * Parameter: File name
	 * Returns: Map of the given strings in the file 
	 * with the format
	 */
	public Map<Integer, ArrayList<String>> readFile(String pathname) throws IOException, ParseException {
		
	    BufferedReader br = new BufferedReader(new FileReader(pathname));
	    Map<Integer, ArrayList<String>> finalList = new HashMap<Integer, ArrayList<String>>( );
	    try {
	    	int count = 0;
	    	String line = null;
	    	while ((line = br.readLine()) != null) {
	    		ArrayList<String> words = new ArrayList<String>(Arrays.asList(line.split(" ")));
	        	count ++;
	        	Collections.reverse(words);
	        	finalList.put(count, words);
	        }
	        return finalList;
	    } finally {
	        br.close();
	    }
	}
	

}
