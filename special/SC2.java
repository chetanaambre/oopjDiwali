/*Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, or only the first letter is capitalized.
//Ex: Given the following strings...
"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true  */
/*package whatever //do not write package name here */

import java.io.*;

class SC2 {

// Function to check if the
// character c is in lowercase or not
static boolean isLower(char c)
{

	return c >= 'a' && c <= 'z';
}

// Function to check if the
// character c is in uppercase or not
static boolean isUpper(char c)
{

	return c >= 'A' && c <= 'Z';
}

// Utility function to check if uppercase
// characters are used correctly or not
static boolean detectUppercaseUseUtil(String S)
{
	// Length of string
	int N = S.length();

	int i;

	// If the first character is in lowercase
	if (isLower(S.charAt(0))) {
	i = 1;
	while (i<N && isLower(S.charAt(i)))
		++i;
	return i == N ? true : false;
	}

	// Otherwise
	else {
	i = 1;

	// Check if all characters
	// are in uppercase or not
	while (i<N && isUpper(S.charAt(i)))
		++i;

	// If all characters are
	// in uppercase
	if (i == N)
		return true;
	else if (i > 1)
		return false;

	// Check if all characters except
	// the first are in lowercase
	while (i<N && isLower(S.charAt(i)))
		++i;
	return i == N ? true : false;
	}
}

// Function to check if uppercase
// characters are used correctly or not
static void detectUppercaseUse(String S)
{
	
	// Stores whether the use of uppercase
	// characters are correct or not
	boolean check = detectUppercaseUseUtil(S);

	// If correct
	if (check)
	System.out.println("Yes");

	// Otherwise
	else
	System.out.println("No");
}

// Driver Code
public static void main (String[] args)
{
	// Given string
	String S = "GeeKs";

	// Function call to check if use of
	// uppercase characters is correct or not
	detectUppercaseUse(S);
}
}

// This code is contributed by subhamsingh10
