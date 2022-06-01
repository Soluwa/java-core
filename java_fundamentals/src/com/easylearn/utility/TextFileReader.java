package com.easylearn.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.MessageFormat;

/**
 * Class contains method that reads and returns text in a file as string
 */
public class TextFileReader{
	
	public String ReadFile(String pathToFile) {
		
		String fileContent = "";
		String content = "";
		File file = new File(pathToFile);
		
		  try(BufferedReader br = new BufferedReader(new FileReader(file));)
		  {
		      while((fileContent = br.readLine())!= null) {
		    	  content = MessageFormat.format("{0} \n",content+=fileContent);
 		     }
		  } 
		  catch(Exception e) {
			  System.out.println("An Error occure while trying to read content from the specified file location");
			  e.printStackTrace(); 
		  }
		  return content;
	}
}
