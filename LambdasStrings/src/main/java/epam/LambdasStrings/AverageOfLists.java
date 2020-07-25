package epam.LambdasStrings;

import java.util.*;
import java.util.function.Predicate;

public class AverageOfLists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Enter the number of elements in the list");
		int n = sc.nextInt();
		System.out.println("Enter the integer values of list");
		for(int i = 0; i < n; i++) {
			numbers.add(sc.nextInt());
		}
		double average = averageOfLists(numbers, (Integer integer) -> integer != 0);
		System.out.println("Average of list of integers is = " + average);	
	}

	public static double averageOfLists(List<Integer> numbers, Predicate<Integer> predicate) {
		double result = 0;
		for(Integer n : numbers) {
			if(predicate.test(n)) {
				result = result + n;
			}
		} return result / numbers.size();
	}

}