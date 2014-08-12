package com.snayani.sortedarray;

import java.util.List;

/**
 * Search sorted array and find the count of given number in the array.
 * 
 * @author Sreekar Nayani
 *
 */
public class SearchSortedArray {
	
	/**
	 * Find number count in the array. 
	 * 
	 * Total complexity - O(log n + k) [assuming k is the subset of n]
	 * 
	 * @param array
	 * @param findValue
	 * @return count of given value in array
	 */
	public static int findNumberCountInAnArray(List<Integer> array,
			Integer findValue) {
		// Search Index
		Integer searchIndex = findIndex(array, findValue, 0);
		// Find Count
		return countArray(array, searchIndex);
	}
	
	
	/**
	 * Search index of value in the array.
	 * 
	 * Time complexity - Big O(log n)
	 * 
	 * @param array
	 * @param findValue
	 * @param offset
	 * @return Location of given value in array
	 */
	private static Integer findIndex(List<Integer> array, Integer findValue,
			int offset) {
		if (array.size() == 0) {
			return null;
		}
		if (findValue < array.get(array.size() / 2)) {
			return findIndex(array.subList(0, array.size() / 2), findValue, 0);
		} else if (findValue > array.get(array.size() / 2)) {
			offset = offset + array.size() / 2;
			return findIndex(array.subList(array.size() / 2, array.size()),
					findValue, offset);
		}
		return array.size() / 2 + offset;
	}

	// Find count. Complexity = O(k) [assuming k is the subset of n]
	private static int countArray(List<Integer> array, Integer searchIndex) {
		if (null == searchIndex) {
			return 0;
		}
		Integer searchValue = array.get(searchIndex);
		Integer searchIndexStore = searchIndex;
		int count = 0;
		while (searchIndex < array.size()
				&& searchValue == array.get(searchIndex)) {
			count++;
			searchIndex++;
		}
		searchIndex = searchIndexStore;
		while (searchIndex > 0 && searchValue == array.get(searchIndex - 1)) {
			count++;
			searchIndex--;
		}
		return count;
	}
}
