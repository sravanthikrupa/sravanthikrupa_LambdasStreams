package epam.LambdasStrings;

import java.util.*;
import java.util.function.Predicate;

class Palindrome {
	public static boolean isPalindrome(String str) {
		StringBuilder s = new StringBuilder(str);
		s.reverse();
		return s.toString().equals(str);
	}
}

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> strings  = new ArrayList<String>();
		System.out.println("Enter the number of elements in the list");
		int n = sc.nextInt();
		System.out.println("Enter the string values");
		for(int i = 0; i < n; i++) {
			strings.add(sc.next());
		}
		List<String> palindrome = PalindromeCheck.filterChecks(strings, Palindrome::isPalindrome);
		System.out.println("Palindrome strings are : " + palindrome);	
	}

	public static List<String> filterChecks(List<String> strings, Predicate<String> palindromePredicate) {
		List<String> palindromeList = new ArrayList<String>();
		for(String str:strings) {
			if(palindromePredicate.test(str)) {
				palindromeList.add(str);
			}
		} return palindromeList;
	}
}