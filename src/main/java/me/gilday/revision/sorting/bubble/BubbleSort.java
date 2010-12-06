package me.gilday.revision.sorting.bubble;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BubbleSort {

	private static Logger logger = LoggerFactory.getLogger(BubbleSort.class);

	private static int passes = 0;

	public static void sort(int[] values) {
		logger.trace("Sorting: {}", values);
		boolean swapped = false;
		passes = 0;
		do {
			passes++;
			swapped = false;
			for (int i = 0; i < values.length - 1; i++) {
				if (values[i] > values[i + 1]) {
					int temp = values[i];
					values[i] = values[i + 1];
					values[i + 1] = temp;
					swapped = true;
				}
			}
			logger.trace("Aftet pass {} : {}", passes, Arrays.toString(values));
		} while (swapped);
	}

	public static void sortFixedPasses(int[] values) {
		int n = values.length;

		for (int pass = 1; pass < n; pass++) {
			for (int i = 0; i < n - pass; i++) {
				if (values[i] > values[i + 1]) {
					int temp = values[i];
					values[i] = values[i + 1];
					values[i + 1] = temp;
				}
			}
		}
	}

	public static int getPasses() {
		return passes;
	}
}
