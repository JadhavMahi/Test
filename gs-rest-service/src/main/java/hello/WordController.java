package hello;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/word")
public class WordController {
	
//@GetMapping(value="/word",produces=MediaType.APPLICATION_JSON_VALUE)
   private class Word{
    	private String word;
    	static final int NO_OF_CHARS = 256; 
    	//private boolean palindrome;
    	//private boolean anagramOfPalindrome;
		public Word(String word) {
			super();
			this.word = word;
			
		}
		public String getWord() {
			return word;
		}
		public void setWord(String word) {
			this.word = word;
		}
		public void myfunction()
		{
			List<String> words = Arrays.asList("kayak", "sagas", "solos", "eve", "anna");
			for(int i=0;i<words.size();i++){
				System.out.println(words.get(i));
			}
		}
		public boolean canFormPalindrome(String str) 
	    { 
	        // Create a count array and initialize 
	        // all values as 0 
	        int[] count = new int[NO_OF_CHARS]; 
	  
	         
	         
	        // count array 
	        for (int i = 0; i < str.length(); i++) 
	            count[str.charAt(i)]++; 
	  
	        // Count odd occurring characters 
	        int odd = 0; 
	        for (int i = 0; i < NO_OF_CHARS; i++) { 
	            if ((count[i] & 1) != 0) 
	                odd++; 
	  
	            if (odd > 1) 
	                return false; 
	        } 
	  
	        
	        return true; 
	    } 
    	
    }
    
    public boolean Anagramdemo(String str)
    { 
    	//String str1, str2;
    	int len1, len2, i, j, found=0, not_found=0;
    	
    	StringBuilder strtemp = new StringBuilder(); 
    	strtemp.append(str);
    	StringBuilder strrev=strtemp.reverse();
    	len1 = strtemp.length();
    	len2 = strrev.length();
	
    	for(i=0; i<len1; i++)
		{
			found = 0;
			for(j=0; j<len1; j++)
			{
				if(strtemp.charAt(i) == strrev.charAt(j))
				{
					found = 1;
					break;
				}
			}
			if(found == 0)
			{
				not_found = 1;
				break;
			}
		}
		if(not_found == 1)
		{
			
			return false;
		}
		else
		{
			
			return true;
		}
    }
}


