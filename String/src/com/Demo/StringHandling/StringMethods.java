package com.Demo.StringHandling;

public class StringMethods {
	public static void main(String[] args) {
		String greeting = "Good Morning";
		System.out.println("Length of the String is i.e. number of characters in the String is:" + greeting.length());
		greeting = greeting.concat(" students");
		System.out.println("New String is: " + greeting);

		String star = " star ";
		String starPlus = star + " plus";
		star = starPlus;
		System.out.println("New String will be: " + star);

		// convert string into upperCase

		star = star.toUpperCase();
		System.out.println("After converting String into Uppercase: " + star);

		// replace a characters

		star = star.replace('S', 'A');
		System.out.println("After replacing S with A, new String will be: " + star);

		String s = "   Core Java   ";
		s = s.replace("Core", "Advance");
		System.out.println("After Replacing Core with Advance new String will be:" + s);

		// String equality

		String productFeature = "Coming Soon...";
		String productFeature1 = "Coming Soon...";

		System.out.println("productFeature and productFeature1 are equal: " + productFeature.equals(productFeature1));

		String firstName = "Ganesh";
		String lastName = "ganesh";

		System.out.println("FirstName and LastName are equal with ignore case:" + firstName.equalsIgnoreCase(lastName));

		System.out.println("Is First Name starts with Ga ? :" + firstName.startsWith("Ga"));
		System.out.println("Is Last Name ends with sh ?: " + lastName.endsWith("sh"));

		char[] arr = firstName.toCharArray();
		
		System.out.print("Fetching character of String using charAt():[");
		for (int i = 0; i < firstName.length(); i++) {
			System.out.print(firstName.charAt(i)+"\t");
		}
		System.out.print("]");
	}
}
