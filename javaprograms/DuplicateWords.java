package javaprograms;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateWords {

	public static void main(String[] args) {
		// Given String containing duplicate words
	      String input =  "Welcome to TestLeaf software to learn selenium software" ;
	      // Converting given String to lowerCase
	      input = input.toLowerCase();
	     //split the string
	      String[] arr1 = input.split(" ");
	      //List - repeated words
	     ArrayList<String> words = new ArrayList<>();
	      HashSet<String> uniqueWords = new HashSet<>();
	      for(String str : arr1)
	      {
	          if (!uniqueWords.add(str))
	        	  words.add(str);
	      }
	      System.out.println(words);

	}

}
