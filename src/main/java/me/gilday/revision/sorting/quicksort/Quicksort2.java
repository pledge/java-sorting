package me.gilday.revision.sorting.quicksort;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quicksort2 {
	
	private static Logger logger = LoggerFactory.getLogger(Quicksort2.class);

	public static void sort(int[] values) {
		sort(values, 0, values.length - 1);
	}

	private static void sort(int values[], int lo, int hi) {
		int h, l, pivot, temp;

		logger.trace("-- New sort ---------");
		logger.trace("lo={}, high={}", lo, hi);		
		logger.trace(Arrays.toString(values));
		if (lo < hi) {
			l = lo;
			h = hi;
			pivot = values[hi];
			System.out.println("pivot is " + pivot);

			do {
				while ((l < h) && (values[l] <= pivot)) {
					logger.trace("Increasing l to {}", l + 1);
					l = l + 1;
				}
				while ((h > l) && (values[h] >= pivot)) {
					logger.trace("Reducing h to {}", h - 1);
					h = h - 1;
				}
				if (l < h) {
					logger.trace("l={},h={},Swapping {} and {}", new Object[]{ l,h, values[l], values[h]});
					temp = values[l];
					values[l] = values[h];
					values[h] = temp;					
				}
			} while (l < h);
			
			logger.trace("Values after loop {}", Arrays.toString(values));

			values[hi] = values[l];
			logger.trace("Values after loop b {}", Arrays.toString(values));
			values[l] = pivot;
			logger.trace("Values after loop c {}", Arrays.toString(values));
			
			sort(values, lo, l - 1);
			sort(values, l + 1, hi);
		} else {
			logger.trace("Not entering loop!");
		}
	}

}
