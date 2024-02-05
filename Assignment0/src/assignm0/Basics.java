package assignm0;

import java.util.Arrays;

public class Basics {

	// Read System.out.println()
	public void printHelloWorld() {
		System.out.println("Hello World");
	}

	public int getSum(int first, int second) {
		return first + second;

	}

	// Read if-else construct
	public int getLargerNumber(int first, int second) {
		return (first > second) ? first : second;
	}

	// Read nested if-else construct
	public int largestNumber(int first, int second, int third) {

		int large = first;
		large = (large<second) ? second : large;
		large = (large<third) ? third : large;
		return large;
	}

	// Go through arrays in java and simple for loop and enhanced for loop
	public void printArray(int array[]) {
		for (int i=0; i<array.length-1; i++) {
			System.out.print(array[i]);
		}
		System.out.println();

	}

	public int getSumOfArrayElements(int array[], int n) {
		int sum = 0;
		for (int i=0; i<n; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public boolean isPrime(int number) {
		boolean anything = true;
		if(number<=1) {
			anything=false;
		}
		for(int i=2; i*i<=number; i++) {
			if(number % i == 0) {
				anything = false;
				break;
			}
		}
		return anything;
	}

	// Say, first = 5 and second = 10, this function should print "5 6 7 8 9 10"
	public int[] getArrayOfRangeOfNumbers(int first, int second) {
			int size = second - first + 1;
			int[] result = new int[size];
			for (int i=0; i<size; i++) {
				result[i] = first + i;
			}
			return result;
	}

	public int getFactorial(int n) {
		int fact = 1;
		if (n == 0 || n == 1) {
			fact = 1;
		}
		
		for (int i=2; i<=n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public int getFactorialWithoutLoop(int n) {
		return (n == 0 || n == 1) ? 1 : n * getFactorialWithoutLoop(n - 1);
			
	}

	// 1234 should give 4321
	public int reverseDigits(int n) {
		int result = 0;
		while (n != 0) {
			int rem = n % 10;
			result = result * 10 + rem;
			n = n / 10;
		}
		return result;
	}

	// In between 1 to 10, the prime numbers are 1, 2, 3, 5, 7
	public int[] primeNumbersInARange(int lowerLimit, int upperLimit) {
		lowerLimit = Math.max(lowerLimit, 2);

		int count = (upperLimit-lowerLimit+1);


		int[] primes = new int[count];
		int index = 0;

		for (int i=lowerLimit; i<=upperLimit; i++) {
			if (isPrimeNo(i)) {
				primes[index++] = i;
			}
		}

		return Arrays.copyOf(primes, index);
	}

	private boolean isPrimeNo(int number) {
		boolean anything = true;
		if (number < 2) {
			anything = false;
		}

		for (int i=2; i*i<=number; i++) {
			if (number % i == 0) {
				anything = false;
				break;
			}
		}
		return anything;
	}

	public int findNumberOfOccurences(int[] array, int n) {
		int count = 0;
		for (int number : array) {
			if (number == n) {
				count = count + 1;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		Basics bs = new Basics();
		bs.printHelloWorld();

		int sum = bs.getSum(10, 20);
		System.out.println(" Sum is : " + sum);

		int largeNum = bs.getLargerNumber(4, 6);
		System.out.println("Largest number is : " + largeNum);

		int largeNumber = bs.largestNumber(533, 111, 61);
		System.out.println("Largest in 3 : " + largeNumber);

		int array[] = { 1, 2, 3, 4, 4, 5 };
		System.out.println("Array elements are : ");
		bs.printArray(array);

		int sumArray = bs.getSumOfArrayElements(array, array.length);
		System.out.println("Sum of Array elements : " + sumArray);

		boolean prime = bs.isPrime(6);
		System.out.println("Is prime? " + prime);

		int rangePrimeNumber[] = bs.getArrayOfRangeOfNumbers(5, 10);
		System.out.println("Range of numbers in an array : " + Arrays.toString(rangePrimeNumber));

		int factNum = bs.getFactorial(5);
		System.out.println("Factorial is : " + factNum);

		int factWithoutLoop = bs.getFactorialWithoutLoop(5);
		System.out.println("Factorial without loop : " + factWithoutLoop);

		int reverse = bs.reverseDigits(123);
		System.out.println("Reverse of the digit : " + reverse);

		int primeInRange[] = bs.primeNumbersInARange(10, 30);
		System.out.println(" Prime numbers in the range : " + Arrays.toString(primeInRange));

		int occurence = bs.findNumberOfOccurences(array, 4);
		System.out.println("Number of occurence : " + occurence);

		int firstOccurence = bs.findFirstOccurence(array, 6);
		System.out.println("First occurence of the number is : " + firstOccurence);
		
		String wordLessTen = bs.getNumberLessThanTenInWords(6);
		System.out.println("Numbers in words less than 10 : " +wordLessTen);
		
		String numberToWords = bs.getNumberInWords(100);
		System.out.println("Numbers to word : " +numberToWords);
		
		System.out.println("Triangle pointing right : ");
		bs.printTrianglePointingRight(5);
		
		System.out.println("Rhombus structure : ");
		bs.printRhombus(5);
		
		System.out.println("Numbered Pyramid : ");
		bs.printNumPyramid(50);

	}

	public int findFirstOccurence(int[] array, int number) {
		int pos = -1;
		for (int i=0; i<array.length; i++) {
			if(array[i] == number) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	
	public void printRhombus(int size) {
		printRhombus(size, 0, size-1 );
	}
	private void printRhombus(int size, int rows, int space) {
		if(rows==size) {
			return;
		}
		for(int i=1; i<=space; i++) {
			System.out.print(" ");
		}
		for(int i=1; i<=size-1; i++) {
			System.out.print("* ");
		}
		System.out.println();
		
		printRhombus(size, rows+1, space-1);
	}


	public String getNumberLessThanTenInWords(int number) {
		return (number<1 || number>9) ? "Invalid" : new String[] {"one","two","three","four","five", "six","seven","eight","nine"}[number-1];
	}

	public String getNumberInWords(int number) {
		int tensFirstDig = number/10;
		int tensSecDig = number%10;
		int hundFirstDig = number/100;
		int hundSecDig = number%100;
		int thousFirstDig = number/1000;
		int thousSecDig = number%1000;
		int lakhFirstDig = number/100000;
		int lakhSecDig = number%100000;
		int croreFirstDIg = number/10000000;
		int croresSecDig = number%10000000;
		
		String[] oneToNinteen = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		String hundred = "hundred";
		String thousand = "thousand";
		String lakh = "lakh";
		String crore = "crore";
		
		String stringNumber = "";
		
		stringNumber = (number==0) ? "zero"
				: (number < 20) ? "" +oneToNinteen[number]
				: (number >= 20 && number<100) ? "" +tens[tensFirstDig] +" " +oneToNinteen[tensSecDig]
				: (number >= 100 && number < 1000) ? "" +oneToNinteen[hundFirstDig] +" " +hundred  +" " +(hundSecDig == 0 ? " " : "and " +getNumberInWords(hundSecDig))
				: (number >= 1000 && number < 100000) ? getNumberInWords(thousFirstDig) +" " +thousand +" " +(thousSecDig == 0 ? " " : getNumberInWords(thousSecDig))
				: (number >= 100000 && number < 10000000) ? getNumberInWords(lakhFirstDig) +" " +lakh +" " +(lakhSecDig == 0 ? " " : getNumberInWords(lakhSecDig))
				: (number >= 10000000 && number < 1000000000) ? getNumberInWords(croreFirstDIg) +" " +crore +" " +(croresSecDig == 0 ? " " : getNumberInWords(croresSecDig))
				: "Out of Range" ;
				return stringNumber;
	}

	public void printTrianglePointingRight(int size) {
		int i, j;
		for (i=0; i<size; i++) {
			for (j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
    public void printNumPyramid(int number) {
        StringBuilder numbers = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            numbers.append(i);
        }
        
        int rows = (int) Math.ceil(-1 + Math.sqrt(1 + 8 * numbers.length())/2);
        int index = 0;
        
        for (int i = 1; i <= rows; i++) {
			int space = rows - i;
			for (int j = 1; j <= i + space; j++) {
				if (j <= space) {
					System.out.print(" ");
				} else {
					if (index < numbers.length()) {
						System.out.print(numbers.charAt(index) + " ");
						index++;
					}
				}

			}
			System.out.println();
		}
    }


}