package me.gilday.revision.sorting.quicksort;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class QuicksortUnitTest {

	// @Test
	// public void mustSortValuesInAscedingOrder() {
	//
	// int[] values = { 5,9,2,5,3,3,1,12 };
	// Quicksort.sort(values);
	// assertThat(values, is(new int[]{1,2,3,3,5,5,9,12}));
	//
	// }

	@Test
	public void mustSortValuesInAscedingOrder() {

		int[] values = { 1, 12, 5, 26, 7, 14, 3, 7, 2 };
		Quicksort.sort(values);
		assertThat(values, is(new int[] { 1, 2, 3, 5, 7, 7, 12, 14, 26 }));

	}

	// @Test
	// public void mustSortWhenOddNumverOfValues() {
	// int[] values = { 5,9,2,5,17,3,3,1,12 };
	// Quicksort.sort(values);
	// assertThat(values, is(new int[]{1,2,3,3,5,5,9,12,17}));
	// System.out.println(Arrays.toString(values));
	// }

}
