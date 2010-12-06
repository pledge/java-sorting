package me.gilday.revision.sorting.counting;

public class CountingSort {

	public static void sort(int[] a) {

		int min = a[0], max = a[0];
		for (int x : a) {
			min = Math.min(x, min);
			max = Math.max(x, max);
		}
		int size = max - min + 1;
		int[] holes = new int[size];

		for (int x : a) {
			holes[x - min]++;
		}

		int i = 0;
		for (int count = 0; count < size; count++) {
			while (holes[count]-- > 0) {
				a[i++] = count + min;
			}
		}
	}
	
}
