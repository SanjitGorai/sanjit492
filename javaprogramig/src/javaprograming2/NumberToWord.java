package javaprograming2;

import java.util.Scanner;

public class NumberToWord {

	   private static final String[] units = {
		        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
		        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
		    };

		    private static final String[] tens = {
		        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
		    };

		    public static String convertToWords(int number) {
		        if (number < 20) {
		            return units[number];
		        } else if (number < 100) {
		            return tens[number / 10] + " " + units[number % 10];
		        } else if (number < 1000) {
		            return units[number / 100] + " Hundred " + convertToWords(number % 100);
		        } else if (number < 1000000) {
		            return convertToWords(number / 1000) + " Thousand " + convertToWords(number % 1000);
		        } else if (number < 1000000000) {
		            return convertToWords(number / 1000000) + " Million " + convertToWords(number % 1000000);
		        } else {
		            return "Number is too large to convert.";
		        }
		    }

		    public static void main(String[] args) {
		    	String s = "1,11,111,1111";
		    	String[] s1 = s.split(",");
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		    //    int number = scanner.nextInt();
              for (int i = 0; i < s1.length; i++) {
				
			
		        if (Integer.parseInt(s1[i]) < 0) {
		            System.out.println("Please enter a non-negative number.");
		        } else {
		            String words = convertToWords(Integer.parseInt(s1[i]));
		            System.out.println("In words: " + words);
		        }

		        scanner.close();
              }
		    }

}
