package me.gilday.revision.sorting.insertion;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class InsertionSortUnitTest {

	@Test
	public void mustSortListInAscendingOrder() {

		int[] values = { 5, 3, 1, 2 };
		InsertionSort.sort(values);
		assertThat(values, is(new int[] { 1, 2, 3, 5 }));

	}

	@Test
	public void mustDealWithDuplicates() {

		int[] values = { 5, 1, 4, 2, 8, 5, 1, 4, 2, 8, 5, 1, 4, 2, 8 };
		InsertionSort.sort(values);
		assertThat(values, is(new int[] { 1, 1, 1, 2, 2, 2, 4, 4, 4, 5, 5, 5,
				8, 8, 8 }));

	}

	@Test
	public void mustSortListInAscendingOrderAlternative() {

		int[] values = { 5, 3, 1, 2 };
		InsertionSort.sortAlternative(values);
		assertThat(values, is(new int[] { 1, 2, 3, 5 }));

	}

	@Test
	public void mustDealWithDuplicatesAlternative() {

		int[] values = { 5, 1, 4, 2, 8, 5, 1, 4, 2, 8, 5, 1, 4, 2, 8 };
		InsertionSort.sortAlternative(values);
		assertThat(values, is(new int[] { 1, 1, 1, 2, 2, 2, 4, 4, 4, 5, 5, 5,
				8, 8, 8 }));

	}

}
