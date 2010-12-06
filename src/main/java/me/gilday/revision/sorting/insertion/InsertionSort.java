package me.gilday.revision.sorting.insertion;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertionSort {
	
	private static Logger logger = LoggerFactory.getLogger(InsertionSort.class);
		
	public static void sort(int[] values) {
		
		logger.trace("==Sorting==");
		logger.trace(Arrays.toString(values));
	
		for (int j = 1; j < values.length; j++) {	
			int insert = values[j];
			int i = j - 1;
			
			while (i >= 0 && values[i] > insert) {
				values[i+1] = values[i];
				i = i - 1;
				logger.trace(Arrays.toString(values));
			}
			values[i + 1] = insert;
			logger.trace(Arrays.toString(values));
		}	
		
	}	

	
	public static void sortAlternative(int[] values) {
		
		logger.trace("==Sorting==");
		logger.trace(Arrays.toString(values));
	
		for (int i = 1; i < values.length; i++) {
			
			int insert = values[i];
			int j = i - 1;
			boolean done = false;
			do {
				if (values[j] > insert) {
					values[j+1] = values[j];
					j = j - 1;					
				} else {
					done = true;
				}

				logger.trace(Arrays.toString(values));
				
			} while (!done && j >= 0);
						
			values[j + 1] = insert;
			logger.trace(Arrays.toString(values));
		}		
		
	}

}
