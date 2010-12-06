package me.gilday.revision.sorting.counting;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CountingSortUnitTest {

	@Test
	public void mustSortIntoAscendingOrder() {

		int[] values = new int[] { 4, 6, 2, 1 };
		CountingSort.sort(values);
		assertThat(values, is(new int[] { 1, 2, 4, 6 }));

	}
	
}
