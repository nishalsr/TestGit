package assignm1;

import java.util.Arrays;

public class MyStringUtil {
	String str;
	
	public MyStringUtil(String str) {
		this.str = str;
	}
	
	public void setStr(String s) {
		this.str = s;
	}
	
	public String getStr() {
		return this.str;
	}
	
	public int size() {
		return str.length();
	}
	
	public String toUpperCase() {
		return str.toUpperCase();
	}
	
	public void printOneByOne() {
		for(int i=0; i<size(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public String reverse() {
		String reverseString = "";
		for(int i = size()-1; i>=0; i--) {
			reverseString += str.charAt(i);
		}
		return reverseString;
	}

	
	public boolean isPolindrome() {
		String revString = reverse();
		return str.equals(revString);
	}
	
	public char getMaxChar() {
		char maxChar = 0;
		for(int i=0; i<size(); i++) {
			if(str.charAt(i)>maxChar) {
				maxChar = str.charAt(i);
			}
		}
		return maxChar;
	}
	
	public String reverseEachWord() {
		String[] words = str.split(" ");
		StringBuilder reversedString = new StringBuilder();
		for(String word : words) {
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			reversedString.append(reversedWord).append(" ");
		}
		return reversedString.toString().trim();
		}
	
	public String sub(int first, int end) {
		return str.substring(first, end);
	}
	
	public int[] countEachWordLength() {
		String[] wordCount = str.split("\\s");
		int[] countWord = new int[wordCount.length];
		for(int i=0; i<wordCount.length; i++) {
			countWord[i] = wordCount[i].length();
		}
		return countWord;
	}
	
	public String prefix(String prefix) {
		return prefix + this.str;
	}
	
	public String suffix(String suffix) {
		return this.str + suffix;
	}
	
	public String reverseCase() {
		char[] revChar = str.toCharArray();
		for(int i =0; i<revChar.length; i++) {
			if(revChar[i]>='A' && revChar[i]<='Z') {
				revChar[i] = (char) (revChar[i]+32);
			}else if (revChar[i]>='a' && revChar[i]<='z'){
				revChar[i] = (char) (revChar[i]-32);
			}
			
		}
		return new String(revChar);
	}
	
	public static String findLargestPalindrome(String str) {
        String largestPalindrome = "";
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                String substr = str.substring(i, j);
                MyStringUtil printlargePolindrome = new MyStringUtil(substr);
                if(printlargePolindrome.isPolindrome() && substr.length() > largestPalindrome.length()) {
                    largestPalindrome = substr;
                }
            }
        }
        return largestPalindrome;
    }
	
	public static void main(String[] args) {
		MyStringUtil myString = new MyStringUtil("world");
		MyStringUtil polindromeString = new MyStringUtil("malayalam");
		MyStringUtil polindromeStrin2 = new MyStringUtil("kannada");
		MyStringUtil maxCharVal = new MyStringUtil("tarun");
		MyStringUtil eachWord = new MyStringUtil("hello my lovely lady");
		MyStringUtil reverseCharacter = new MyStringUtil("HelLo");
				
		System.out.println("Given String is : " +myString.getStr());
		 
		myString.setStr("hello");
		System.out.println("Given String after changing by setter : " +myString.getStr());
		
		System.out.println("String in Upper Case : " +myString.toUpperCase());
		
		System.out.println("String one character per line : ");
		myString.printOneByOne();
		
		System.out.println("Reversed String : " +myString.reverse());
		
		System.out.printf("'%s' is polindrome? %b \n", polindromeString.getStr(), polindromeString.isPolindrome());
		System.out.printf("'%s' is polindrome? %b \n", polindromeStrin2.getStr(), polindromeStrin2.isPolindrome());
		
		System.out.printf("Max char value of '%s' is : '%c' \n",myString.getStr(), myString.getMaxChar());
		System.out.printf("Max char value of '%s' is : '%c' \n",maxCharVal.getStr(), maxCharVal.getMaxChar());
		

		System.out.println("Atfer reversing each string : " +eachWord.reverseEachWord());
		
		
		int firstIndex = 1;
		int secIndex = 4;
		System.out.println("Substring : " +myString.sub(firstIndex, secIndex));
		
		int[] countWordd = eachWord.countEachWordLength();
		System.out.println("Count of each word : " +Arrays.toString(countWordd));

		String prefixWord = myString.prefix("say ");
		System.out.println("String after adding prefix : " +prefixWord);
		
		String suffixWord = myString.suffix(" say");
		System.out.println("Strinf after adding suffix : " +suffixWord);
		
		System.out.println("Reverse of given Character : " +reverseCharacter.reverseCase());
		
		String str = "abcbadefgoplevelpo";
		String largestPalindrome = MyStringUtil.findLargestPalindrome(str);
		System.out.println("The largest palindrome in" +str +" is " + largestPalindrome);

	}

}
