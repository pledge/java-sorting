package me.gilday.revision.sorting.merge;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MergeSort {
	
	private static Logger logger = LoggerFactory.getLogger(MergeSort.class);
	
	public static int[] sort(int[] values) {
		
		logger.trace("Sorting {}", Arrays.toString(values));
		
		if(values.length <= 1) {
			return values;
		}
		
		int elementsInLeft = values.length / 2;
		int elementsInRight = values.length - elementsInLeft;
		int[] left, right;
		left = new int[elementsInLeft];
		right = new int[elementsInRight];
		
		logger.trace("Left {} and Right {}", Arrays.toString(left), Arrays.toString(right));
		
		for (int i = 0; i < elementsInLeft; i++) {
			left[i] = values[i];
		}
		
		for (int i = elementsInLeft; i <values.length; i++) {
			right[i - elementsInLeft] = values[i];
		}
		
		logger.trace("Left {} and Right {}", Arrays.toString(left), Arrays.toString(right));
		
		left = sort(left);
		right = sort(right);
				
		return merge(left, right);
		
	}

	private static int[] merge(int[] left, int[] right) {
		
		logger.trace("Merging {} with {}", Arrays.toString(left), Arrays.toString(right));
		
		int[] result = new int[left.length + right.length];
		
		int i=0, l=0, r=0;
		while(l != left.length && r != right.length) {
			if(left[l] < right[r]) {
				result[i++] = left[l++];
			} else {
				result[i++] = right[r++];
			}
		}
		
		while(l != left.length) {
			result[i++] = left[l++];
		}
		
		while(r != right.length) {
			result[i++] = right[r++];
		}
		
		logger.trace("Merge result: {}", Arrays.toString(result));
		
		return result;
	}
	

}
