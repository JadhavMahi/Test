package hello;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
	
	
	@RequestMapping(value = "/words/{word}", method = RequestMethod.GET, produces = "application/json")
	public Map checkIsPallendrom(@PathVariable("word") String word) {
		boolean flag = true;
		for (int i = 0, cnt = word.length() - 1; i < word.length(); i++, cnt--) {
			if (word.charAt(i) != word.charAt(cnt)) {
				flag = false;
				break;
			}
		}
		Map json = new HashMap();
		json.put("word", word);
		json.put("palindrome", flag);
		json.put("anagramOfPalindrome", is_AnagramPalindrome(word));
		return json;
	}
    
	/**
	 * Check String Is Anagram Palindrome
	 * @param word
	 * @return
	 */
	private static boolean is_AnagramPalindrome(String word) {
		int oddOccur = 0;
		int[] count = new int[256];
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			count[ch]++;
		}

		for (int cnt : count) {
			if (oddOccur > 1) {
				return false;
			}
			if (cnt % 2 == 1) {
				oddOccur++;
			}
		}
		return true;
	}
    
}
