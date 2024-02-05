package assignm0;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class BasicsTest {
	
	@Test
	public void largerNumberTest() {
		Basics assignm0 = new Basics();
		assertEquals(2, assignm0.getLargerNumber(1, 2));

		assignm0 = new Basics();
		assertEquals(-1, assignm0.getLargerNumber(-1, -3));

		assignm0 = new Basics();
		assertEquals(3, assignm0.getLargerNumber(0, 3));
		
		assignm0 = new Basics();
		assertEquals(9, assignm0.getLargerNumber(9, 3));
		
		assignm0 = new Basics();
		assertEquals(7, assignm0.getLargerNumber(2, 7));
		
		assignm0 = new Basics();
		assertEquals(10, assignm0.getLargerNumber(10, 5));
		
		assignm0 = new Basics();
		assertEquals(50, assignm0.getLargerNumber(50, 33));
	}

	@Test
	public void largestNumberTest() {
		Basics assignm0 = new Basics();
		assertEquals(3, assignm0.largestNumber(1, 2, 3));

		assertEquals(3, assignm0.largestNumber(1, 3, 2));

		assertEquals(3, assignm0.largestNumber(2, 1, 3));

		assertEquals(3, assignm0.largestNumber(2, 3, 1));

		assertEquals(3, assignm0.largestNumber(3, 1, 2));

		assertEquals(3, assignm0.largestNumber(3, 2, 1));
		
		assertEquals(0, assignm0.largestNumber(-5, 0, -1000));
	}

	@Test
	public void sumOfArrayElementsTest() {

		Basics assignm0 = new Basics();
		assertEquals(10, assignm0.getSumOfArrayElements(new int[] { 0, 1, 2, 3, 4 },5));

		assertEquals(-2, assignm0.getSumOfArrayElements(new int[] { -1, 1, -2 }, 3));
		
		assertEquals(4, assignm0.getSumOfArrayElements(new int[] { -5, 7, 2 }, 3));
		
		assertEquals(21, assignm0.getSumOfArrayElements(new int[] { 5, 6, 2, 8 }, 4));
		
		assertEquals(35, assignm0.getSumOfArrayElements(new int[] { 9, 8, 7, 6, 5}, 5));
		
		assertEquals(8, assignm0.getSumOfArrayElements(new int[] { -1, 11, -2 }, 3));
	}

	@Test
	public void primeTest() {
		Basics assignm0 = new Basics();

		assertTrue(assignm0.isPrime(5));

		assertFalse(assignm0.isPrime(10));
		
		assertFalse(assignm0.isPrime(0));

		assertFalse(assignm0.isPrime(1));
		
		assertTrue(assignm0.isPrime(13));
		
		assertTrue(assignm0.isPrime(61));


	}

	@Test
	public void numbersInARangeTest() {
		Basics assignm0 = new Basics();
		assertArrayEquals(new int[] { 3, 4, 5, 6, 7, 8, 9 },

		assignm0.getArrayOfRangeOfNumbers(3, 9));

		assertArrayEquals(new int[] { -3, -2, -1 },

		assignm0.getArrayOfRangeOfNumbers(-3, -1));

		assertArrayEquals(new int[] { -3, -2, -1, 0, 1 },

		assignm0.getArrayOfRangeOfNumbers(-3, 1));
		
		assertArrayEquals(new int[] { 5, 6, 7, 8, 9, 10, 11 },

		assignm0.getArrayOfRangeOfNumbers(5, 11));
	}

	@Test
	public void primeNumbersInARangeTest() {
		Basics assignm0 = new Basics();
		assertArrayEquals(new int[] { 2, 3, 5, 7 }, assignm0.primeNumbersInARange( 0,9));

		assertArrayEquals(new int[] { 3, 5, 7 }, assignm0.primeNumbersInARange( 3,9));
		assignm0.primeNumbersInARange( 0,2000000);
		
		assertArrayEquals(new int[] { 61, 67, 71, 73, 79 }, assignm0.primeNumbersInARange( 60,80));
		
		assertArrayEquals(new int[] { 41, 43, 47 }, assignm0.primeNumbersInARange( 40,50));
		
		assertArrayEquals(new int[] { 2, 3, 5, 7 }, assignm0.primeNumbersInARange( 0,9));
		
		assertArrayEquals(new int[] { 11, 13, 17, 19 }, assignm0.primeNumbersInARange( 11,20));
	}

	@Test
	public void sumTest() {
		Basics assignm0 = new Basics();
		assertEquals(12, assignm0.getSum(3, 9));

		assertEquals(6, assignm0.getSum(-3, 9));

		assertEquals(-12, assignm0.getSum(-3, -9));
		
		assertEquals(15, assignm0.getSum(12, 3));
		
		assertEquals(14, assignm0.getSum(7, 7));
		
		assertEquals(14, assignm0.getSum(5, 9));
	}

	@Test
	public void reverseDigitsTest() {
		Basics assignm0 = new Basics();
		assertEquals(12, assignm0.reverseDigits(21));

		assertEquals(4321, assignm0.reverseDigits(1234));
		
		assertEquals(1876, assignm0.reverseDigits(6781));
		
		assertEquals(6321, assignm0.reverseDigits(1236));
		
		assertEquals(72, assignm0.reverseDigits(27));
		
		assertEquals(4321, assignm0.reverseDigits(1234));
		
		assertEquals(776, assignm0.reverseDigits(677));
	}

	/*
	 * @Test public void helloWorldTest() { Assignm0 assignm0 = new Assignm0();
	 * }
	 */

	@Test
	public void factorialTest() {
		Basics ass0 = new Basics();
		assertEquals(24, ass0.getFactorial(4));
		
		assertEquals(1, ass0.getFactorial(0));

        assertEquals(1, ass0.getFactorial(1));
        
        assertEquals(120, ass0.getFactorial(5));
        
        assertEquals(720, ass0.getFactorial(6));
        
        assertEquals(2, ass0.getFactorial(2));
	}
	@Test
	public void getFactorialWithoutLoop() {
		Basics ass0 = new Basics();
		assertEquals(6, ass0.getFactorialWithoutLoop(3));
		
		assertEquals(1, ass0.getFactorialWithoutLoop(0));

        assertEquals(1, ass0.getFactorialWithoutLoop(1));
        
        assertEquals(24, ass0.getFactorialWithoutLoop(4));
        
        assertEquals(120, ass0.getFactorialWithoutLoop(5));
		
	}
	@Test
	public void testFindNumberOfOccurences(){
		Basics ass0 = new Basics();
		assertEquals(3, ass0.findNumberOfOccurences(new int[]{1, 1, 1}, 1));

		assertEquals(2, ass0.findNumberOfOccurences(new int[]{1, 2, 1}, 1));
		
		assertEquals(1, ass0.findNumberOfOccurences(new int[]{1, 2, 3}, 1));
		
		assertEquals(0, ass0.findNumberOfOccurences(new int[]{2, 3, 4}, 1));
		
		assertEquals(2, ass0.findNumberOfOccurences(new int[]{2, 2, 4}, 2));
		
		assertEquals(3, ass0.findNumberOfOccurences(new int[]{3, 3, 3}, 3));

	}
	
	@Test
	public void testFindFirstOccurence(){
		Basics ass0 = new Basics();
		
		assertEquals(-1, ass0.findFirstOccurence(new int[]{2, 2, 2}, 1));
		
		assertEquals(0, ass0.findFirstOccurence(new int[]{1, 1, 1}, 1));
		
		assertEquals(2, ass0.findFirstOccurence(new int[]{2, 2, 1}, 1));
		
		assertEquals(2, ass0.findFirstOccurence(new int[]{1, 1, 2}, 2));
		
		assertEquals(1, ass0.findFirstOccurence(new int[]{1, 3, 1}, 3));
		
		assertEquals(0, ass0.findFirstOccurence(new int[]{4, 1, 1}, 4));
		
		assertEquals(-1, ass0.findFirstOccurence(new int[]{1, 1, 1}, 7));


		
	}
	
	@Test
	public void testGetNumberLessThanTenInWords(){
		Basics ass0 = new Basics();
		assertEquals("one", ass0.getNumberLessThanTenInWords(1).toLowerCase());
		
		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
		
		assertEquals("nine", ass0.getNumberLessThanTenInWords(9).toLowerCase());
		
		assertEquals("invalid", ass0.getNumberLessThanTenInWords(0).toLowerCase());
		
		assertEquals("three", ass0.getNumberLessThanTenInWords(3).toLowerCase());
		
		assertEquals("six", ass0.getNumberLessThanTenInWords(6).toLowerCase());

		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
	}
	@Test
	public void testGetNumberInWords(){
		Basics ass0 = new Basics();
		assertEquals("thirty four", ass0.getNumberInWords(34).toLowerCase());
		
//		assertEquals("two hundred thirty four", ass0.getNumberInWords(10005).toLowerCase());
		
//		assertEquals("one thousand two hundred thirty four", ass0.getNumberInWords(1907).toLowerCase());
		
//		assertEquals("forty five thousand six hundred fifty two", ass0.getNumberInWords(101).toLowerCase());

		assertEquals("two hundred and nine", ass0.getNumberInWords(209).toLowerCase());
		
		assertEquals("one thousand five", ass0.getNumberInWords(1005).toLowerCase());
		
		assertEquals("thirty five thousand seven hundred and four", ass0.getNumberInWords(35704).toLowerCase());

		assertEquals("five lakh fifty  thousand four hundred and ninety two", ass0.getNumberInWords(550492).toLowerCase());

	}
	
	@Test
	public void printTrianglePointingRightTest() {
	
		Basics ass0 = new Basics();
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    ass0.printTrianglePointingRight(5);
	    
	    assertEquals("* \n* * \n* * * \n* * * * \n* * * * *",outContent.toString().replaceAll("\\r", "").trim());
	    
	    
	    Basics assZeroTwo = new Basics();
	    ByteArrayOutputStream outContentTwo = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContentTwo));
	    
	    assZeroTwo.printTrianglePointingRight(3);
	    
	    assertEquals("* \n* * \n* * *",outContentTwo.toString().replaceAll("\\r", "").trim());
	}
	
}
