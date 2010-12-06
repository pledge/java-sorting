package me.gilday.revision.sorting.quicksort;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Quicksort {
	
	private static Logger logger = LoggerFactory.getLogger(Quicksort.class);
	
	public static void sort(int[] values) {
		logger.trace("===Sorting: {}", Arrays.toString(values));
		sort(values, 0, values.length - 1);
	}
	
	private static void sort(int[] values, int left, int right) {
		
		int index = partition(values, left, right);
		logger.trace(Arrays.toString(values));
		if(left < index - 1) {
			sort(values, left, index - 1);
		} 
		if(index < right) {
			sort(values, index, right);
		}
		
	}
	
	private static int partition(int[] values, int left, int right) {
		
		int i=left, j=right;
		int tmp;
		int pivot = values[(left+right) / 2];
		
		while (i<=j) {
			while (values[i] < pivot) {
				i++;
			}
			while(values[j] > pivot) {
				j--;
			}
			if(i<=j) {
				tmp = values[i];
				logger.trace("Swapping {} and {}", values[i], values[j]);
				values[i] = values[j]; 
				values[j] = tmp;
				i++;
				j--;
			}			
		}
		
		return i;
		
	}

}
