

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Explores HashMap & HashSet and how to use the iterator
 * @author Nick
 *
 */
public class CollectionsClass {
	 
	/**
	 * Removes elements that fall within the given range (inclusive)
	 * @param list of integers to remove the elements from
	 * @param minimum value for the range
	 * @param maximum value for the range
	 */
	public static void removeRange(ArrayList<Integer> list, int min, int max) {
		//Create iterator and iterate over the list, removing the elements 
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			
			if(next >= min && next <= max) {
				iterator.remove();
			}
		}
	}	
	
	/**
	 * Takes an ArrayList and modifies it to place a "*" inbetween each element, 
	 * and at the beginning and end. 
	 * @param list of the values to add the stars to
	 */
	public static void addStars(ArrayList<String> list) {
		//Copy all values in ArrayList to array
		String[] array = list.toArray(new String[list.size()]);
		
		//empty the original list
		list.removeAll(Arrays.asList(array));
	
		//add stars and string values back into the original list
		list.add("*");
		for(String s : array) {
			list.add(s);
			list.add("*");
		}
	}
	
	/**
	 * Takes a given array of strings and returns a map of keys (each unique string element), 
	 * and a value of their occurrences
	 * @param string to count
	 * @return map of word counts, where key is unique string value and value is occurence value
	 */
	public static Map<String, Integer> countWordOccurrences(ArrayList<String> strings) {
		//Creates a new HashMap (has no order)
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//Iterate over each string from the given array
		for(String str : strings) {
			//If the given string does not exist in the map, then add it.
			if(!map.containsKey(str)) {
				map.put(str, 1);//default count of 1 for the new key.
			}else {
				//the map already contains the key, so increment the value.
				map.replace(str, map.get(str) + 1);
			}
		}
		
		return map;
	} 
	
	/**
	 * Provides the amount of unique values from the given ArrayList 
	 * Case-Sensitive. eg. Hello and hello are different.
	 * @param list of strings
	 * @return amount of unique strings in the list
	 */
	public static int countUniqueWords(ArrayList<String> strings) {
		//create hashset (has no order) of unique words in given ArrayList. Repeated elements will not be added to the HashSet
		Set<String> uniqueWordsHashSet = new HashSet<String>(strings);
		
		//return the count of the unique elements in the given array
		return uniqueWordsHashSet.size();
	}
	
	/**
	 * The entry point for the program.
	 * @param args
	 */
	public static void main(String[] args) {
		//Remove Range of values	
		//Create array of integers (not primitive)
		Integer[] myArray = {1, 7, 4, 6, 8, 4, 0, 9, 10, 3, 6, 7 };
		
		//Convert array to list.
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(myArray));
		
		//Print out the list's elements before removing the elements 
		System.out.println(list);
		
		int min = 5; 
		int max = 7;
		
		//remove numbers 5 to 7 (inclusive)
		CollectionsClass.removeRange(list, min, max);

		//Print out the list's elements after removing the elements
		System.out.println(list);
		System.out.println();//blank line
		//Stars
		//Create array of strings
		String[] starArray = { "she", "sells", "sea", "shells", "by", "the", "sea", "shore" };
		
		//Convert array to list.
		ArrayList<String> starsList = new ArrayList<String>();
		starsList.addAll(Arrays.asList(starArray));
		
		//Print out the list's elements before adding the stars
		System.out.println(starsList);
	
		//add the star elements
		CollectionsClass.addStars(starsList);
	
		//Print out the list's elements after adding the stars
		System.out.println(starsList);
		System.out.println();//blank line
		
		//Unique Occurrences
		//Create array of strings
		String[] uniqueValuesArray = { "how", "much", "wood", "would", "a", "woodchuck", "chuck", "if", "a", "woodchuck", "could", "chuck", "wood"};
	
		//Convert array to list. This conversion is only used to quickly print the List
		ArrayList<String> uniqueValuesList = new ArrayList<String>();
		uniqueValuesList.addAll(Arrays.asList(uniqueValuesArray));
	
		//Print out the list's elements
		System.out.println(uniqueValuesList);
		
		//Count the unique values in the array and return a Map 
		Map<String, Integer> wordCountMap = CollectionsClass.countWordOccurrences(uniqueValuesList);

		//Print out the map's unique words and their occurrence counts
		System.out.println(wordCountMap);
		System.out.println();//blank line
		
		//Amount of Unique Occurrences
		//Print out the amount of strings
		System.out.println("Total: " + uniqueValuesList.size());
		
		//Get the amount of unique values in the list
		int uniqueValueAmt = CollectionsClass.countUniqueWords(uniqueValuesList);
		
		//Print out the amount of unique strings
		System.out.println("Unique: " + uniqueValueAmt);
				
		
	}
}
