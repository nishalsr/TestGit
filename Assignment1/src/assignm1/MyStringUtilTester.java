package assignm1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class MyStringUtilTester {

	@Test
	public void toUpperCaseest() {
		MyStringUtil assignm1 = new MyStringUtil("good");
		assertEquals("GOOD", assignm1.toUpperCase());
		
		assertEquals("MORNING", new MyStringUtil("morniNG").toUpperCase());
		
		assertEquals("SUNDAY", new MyStringUtil("sundAY").toUpperCase());
		
		assertEquals("GREAT", new MyStringUtil("gReaT").toUpperCase());
		
		assertEquals("JULY", new MyStringUtil("JuLy").toUpperCase());
		
		assertEquals("SUNDAY", new MyStringUtil("sunday").toUpperCase());
	}
	
	@Test
	public void printOneByOneTest() {
	
		MyStringUtil ass1 = new MyStringUtil("computer");
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    ass1.printOneByOne();
	    
	    assertEquals("c\no\nm\np\nu\nt\ne\nr",outContent.toString().replaceAll("\\r", "").trim());
	    
	    MyStringUtil assSec = new MyStringUtil("elevator");
	    ByteArrayOutputStream outContentSec = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContentSec));
	    
	    assSec.printOneByOne();
	    
	    assertEquals("e\nl\ne\nv\na\nt\no\nr",outContentSec.toString().replaceAll("\\r", "").trim());
	}
		

	@Test
	public void reverseTest() {
		MyStringUtil ass1 = new MyStringUtil("sunday");
		assertEquals("yadnus", ass1.reverse().toLowerCase());
		
		assertEquals("gnihtemos", new MyStringUtil("Something").reverse().toLowerCase());
		
		assertEquals("great", new MyStringUtil("taeRG").reverse().toLowerCase());
		
		assertEquals("esirnus", new MyStringUtil("SunRise").reverse().toLowerCase());
		
		assertEquals("gninrom doog", new MyStringUtil("good morning").reverse().toLowerCase());
		
		assertEquals("laptop", new MyStringUtil("PoTpaL").reverse().toLowerCase());
		
		assertEquals("esuom", new MyStringUtil("mouse").reverse().toLowerCase());
	}
	
	@Test
	public void isPolindromeTest() {
		MyStringUtil ass1 = new MyStringUtil("madam");
		assertEquals(true, ass1.isPolindrome());
		
		assertEquals(true, new MyStringUtil("malayalam").isPolindrome());
		
		assertEquals(false, new MyStringUtil("kannada").isPolindrome());
		
		assertEquals(true, new MyStringUtil("refer").isPolindrome());
		
		assertEquals(true, new MyStringUtil("level").isPolindrome());
		
		assertEquals(false, new MyStringUtil("stRing").isPolindrome());
	}
	
	@Test
	public void getMaxCharTest() {
		MyStringUtil ass1 = new MyStringUtil("hello");
		assertEquals('o', ass1.getMaxChar());
		
		assertEquals('t', new MyStringUtil("tree").getMaxChar());
		
		assertEquals('y', new MyStringUtil("february").getMaxChar());
		
		assertEquals('z', new MyStringUtil("zibra").getMaxChar());
		
		assertEquals('x', new MyStringUtil("xerox").getMaxChar());
		
		assertEquals(' ', new MyStringUtil(" ").getMaxChar());
	}
	
	@Test
	public void reverseEachWordTest() {
		MyStringUtil ass1 = new MyStringUtil("hello how are you");
		assertEquals("olleh woh era uoy", ass1.reverseEachWord().toLowerCase());
		
		assertEquals("emoc ereh", new MyStringUtil("coMe here").reverseEachWord().toLowerCase());
		
		assertEquals("emoc ereh", new MyStringUtil("coMe here").reverseEachWord().toLowerCase());
		
		assertEquals("ereh dna ereht", new MyStringUtil("Here and there").reverseEachWord().toLowerCase());
		
		assertEquals("computer keyboard", new MyStringUtil("retupmoc draobyek").reverseEachWord().toLowerCase());
		
		assertEquals("cinortcele ecived", new MyStringUtil("electronic device").reverseEachWord().toLowerCase());
		
		
	}
	
	@Test
	public void subStringTest(){
		MyStringUtil ass1 = new MyStringUtil("hello how are you");
		assertEquals("hello", ass1.sub(0, 5));
		
		assertEquals(" how ", ass1.sub(5, 10));
		
		assertEquals("w are", ass1.sub(8, 13));
		
		assertEquals("w are you", ass1.sub(8, 17));
		
		assertEquals("ou", ass1.sub(15, 17));
		
	}
	
	@Test
	public void countEachWordLengthTest() {
		MyStringUtil ass1 = new MyStringUtil("hello world hi");
		int[] expected = {5, 5, 2};
		assertArrayEquals(expected, ass1.countEachWordLength());
		
		MyStringUtil assTwo = new MyStringUtil(" ");
		int[] emptyExpected = {};
		assertArrayEquals(emptyExpected, assTwo.countEachWordLength());
		
		MyStringUtil assThree = new MyStringUtil("Program");
		int[] singleExpected = {7};
		assertArrayEquals(singleExpected, assThree.countEachWordLength());
	}
	
	@Test
	public void prefixTest() {
		MyStringUtil ass1 = new MyStringUtil("world");
		assertEquals("hello world", ass1.prefix("hello ").toLowerCase());
		
		assertEquals("bye world", new MyStringUtil("world").prefix("Bye ").toLowerCase());
		
		assertEquals("speed car", new MyStringUtil("car").prefix("SPeED ").toLowerCase());
		
		assertEquals("motor bike", new MyStringUtil("Bike").prefix("motor ").toLowerCase());
		
		assertEquals("mobile phone", new MyStringUtil("phone").prefix("mobile ").toLowerCase());
		
		assertEquals(" world", new MyStringUtil("world").prefix(" ").toLowerCase());
	}
	
	@Test
	public void sufixTest() {
		MyStringUtil ass1 = new MyStringUtil("world");
		
		assertEquals("world hello", ass1.suffix(" hello").toLowerCase());
		
		assertEquals("good bye", new MyStringUtil("good").suffix(" Bye").toLowerCase());
		
		assertEquals("gas cylinder", new MyStringUtil("gas").suffix(" CyLindeR").toLowerCase());
		
		assertEquals("motor bike", new MyStringUtil("Motor").suffix(" bike").toLowerCase());
		
		assertEquals("tall building", new MyStringUtil("tall").suffix(" building").toLowerCase());
		
		assertEquals("world ", new MyStringUtil("world").suffix(" ").toLowerCase());
	}
	
	@Test
	public void reverseCaseTest() {
		MyStringUtil ass1 = new MyStringUtil("gOOd");
		assertEquals("GooD", ass1.reverseCase());
		
		assertEquals("beAUtiFuL", new MyStringUtil("BEauTIfUl").reverseCase());
		
		assertEquals("NamaSTHE", new MyStringUtil("nAMAsthe").reverseCase());
		
		assertEquals("MeTrO tRaIn", new MyStringUtil("mEtRo TrAiN").reverseCase());
		
		assertEquals(" ", new MyStringUtil(" ").reverseCase());
		
	}
	
	@Test
	public void findLargestPolindromeTest() {

		assertEquals("madam", MyStringUtil.findLargestPalindrome("teachermadam"));
		
		assertEquals("malayalam", MyStringUtil.findLargestPalindrome("languagemalayalam"));
		
		assertEquals("level", MyStringUtil.findLargestPalindrome("levelup"));
		
		assertEquals("radar", MyStringUtil.findLargestPalindrome("radarsignal"));
		
		assertEquals("", MyStringUtil.findLargestPalindrome(""));
	}
}
