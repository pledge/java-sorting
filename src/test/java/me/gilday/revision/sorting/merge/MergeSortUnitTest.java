package me.gilday.revision.sorting.merge;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MergeSortUnitTest {
	
	@Test
	public void mustReturnSameListWhenSizeIsZero() {
		
		int[] empty = new int[0];		
		assertThat(MergeSort.sort(empty), is(sameInstance(empty)));
		
	}
	
	@Test
	public void mustReturnSameListWhenSizeIsOne() {
		
		int[] oneElement = new int[] { 1 };		
		assertThat(MergeSort.sort(oneElement), is(sameInstance(oneElement)));
		
	}

	@Test
	public void mustSortListInAscendingOrder() {

		int[] unsorted = new int[] { 6, 3, 12, 66, 23, 10 };
		int[] actual = MergeSort.sort(unsorted);
		assertThat(actual, is(new int[] { 3, 6, 10, 12, 23, 66 }));

	}
		
	@Test
	public void mustBeAbleToDealWithAnOddNumberOfItems() {

		int[] unsorted = new int[] { 6, 3, 12, 66, 23};
		int[] actual = MergeSort.sort(unsorted);
		assertThat(actual, is(new int[] { 3, 6, 12, 23, 66 }));

	}
	
	@Test
	public void mustDealWithLargerListWithRepeatingItmes() {
		
		int[] unsorted = new int[] {66,66,102,55,12,1001,12,1,9000,123,987,414,66};
		int[] expected = new int[] {1, 12, 12, 55, 66, 66, 66, 102, 123, 414, 987, 1001, 9000};
		
		int[] actual = MergeSort.sort(unsorted);
		assertThat(actual, is(expected));
		
	}

}
