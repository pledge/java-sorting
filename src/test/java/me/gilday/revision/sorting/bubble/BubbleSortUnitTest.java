package me.gilday.revision.sorting.bubble;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BubbleSortUnitTest {

	@Test
	public void mustSortListInAscendingOrder() {

		int[] values = { 5, 1, 4, 2, 8 };
		BubbleSort.sort(values);
		assertThat(values, is(new int[] { 1, 2, 4, 5, 8 }));

	}

	@Test
	public void mustDealWithDuplicates() {

		int[] values = { 5, 1, 4, 2, 8, 5, 1, 4, 2, 8, 5, 1, 4, 2, 8 };
		BubbleSort.sort(values);
		assertThat(values, is(new int[] { 1, 1, 1, 2, 2, 2, 4, 4, 4, 5, 5, 5,
				8, 8, 8 }));

	}
	
	@Test
	public void makesOnlyOnePassIfAlreadySorted() {

		int[] values = new int[] { 1, 1, 1, 2, 2, 2, 4, 4, 4, 5, 5, 5,
				8, 8, 8 };

		BubbleSort.sort(values);

		assertThat(values, is(new int[] { 1, 1, 1, 2, 2, 2, 4, 4, 4, 5, 5, 5,
				8, 8, 8 }));
		assertThat(BubbleSort.getPasses(), is(1));		

	}
	
	
	@Test
	public void mustSortListInAscendingOrderWithFixedPasses() {

		int[] values = { 5, 1, 4, 2, 8 };
		BubbleSort.sortFixedPasses(values);
		assertThat(values, is(new int[] { 1, 2, 4, 5, 8 }));

	}

	@Test
	public void mustDealWithDuplicatesWithFixedPasses() {

		int[] values = { 5, 1, 4, 2, 8, 5, 1, 4, 2, 8, 5, 1, 4, 2, 8 };
		BubbleSort.sortFixedPasses(values);
		assertThat(values, is(new int[] { 1, 1, 1, 2, 2, 2, 4, 4, 4, 5, 5, 5,
				8, 8, 8 }));

	}
	
	@Test
	public void makesOnlyOnePassIfAlreadySortedWithFixedPasses() {

		int[] values = new int[] { 1, 1, 1, 2, 2, 2, 4, 4, 4, 5, 5, 5,
				8, 8, 8 };
		BubbleSort.sortFixedPasses(values);
		assertThat(values, is(new int[] { 1, 1, 1, 2, 2, 2, 4, 4, 4, 5, 5, 5,
				8, 8, 8 }));
	
	}

}
