package hello;

public class Test {

	public String getWord() {
		return word;
	}

	public boolean isPalindrome() {
		return palindrome;
	}

	public boolean isAnagramOfPalindrome() {
		return anagramOfPalindrome;
	}

	public Test(String word, boolean palindrome, boolean anagramOfPalindrome) {
		super();
		this.word = word;
		this.palindrome = palindrome;
		this.anagramOfPalindrome = anagramOfPalindrome;
	}

	private final String word;
    private final boolean palindrome;
   
    private final boolean anagramOfPalindrome;
    

}
