package com.snayani.sortedarray;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

/**
 * Test SortedArray search
 * 
 * @author Sreekar Nayani
 *
 */
public class SearchSortedArrayTest {
 	
	@Test
	public void testFindNumberCountInSortedArrayShouldSucceed() {
		Integer[] sample1 = {1, 1, 1, 2, 3, 4, 4, 4, 4, 5, 5, 5};
		ArrayList<Integer> arraySample1 = new ArrayList<Integer>(Arrays.asList(sample1));
		// # of times 5 is repeated in the array? Answer 3
        assertEquals(3, SearchSortedArray.findNumberCountInAnArray(arraySample1, 5));
        
		Integer[] sample2 = {1, 1, 2, 3, 3, 4, 5, 8, 8, 9, 9, 10, 10, 14, 18};
		ArrayList<Integer> arraySample2 = new ArrayList<Integer>(Arrays.asList(sample2));
		// # of times 10 is repeated in the array? Answer 2
        assertEquals(2, SearchSortedArray.findNumberCountInAnArray(arraySample2, 10));
	}
}
