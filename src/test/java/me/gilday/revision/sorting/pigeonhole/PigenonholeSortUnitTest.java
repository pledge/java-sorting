package me.gilday.revision.sorting.pigeonhole;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import me.gilday.revision.sorting.pigeonhole.PigeonholeSort.Entry;

import org.junit.Test;

public class PigenonholeSortUnitTest {
	
	@Test
	public void mustSortArrayByIncreasingKey() {
		
		Entry cat = new Entry('c', "Cat");
		Entry dog = new Entry('d', "Dog");
		Entry apple = new Entry('a', "Apple");			
		Entry[] entries = {
			cat, dog, apple
		};
		
		PigeonholeSort.sort(entries);
		
		assertThat(entries[0], is(apple));
		assertThat(entries[1], is(cat));
		assertThat(entries[2], is(dog));
		
	}
	
	@Test
	public void mustDealWithDuplicateKeysAndBeStable() {
		
		Entry cat = new Entry('c', "Cat");
		Entry dog2 = new Entry('d', "Dog 2");
		Entry dog = new Entry('d', "Dog");
		Entry apple = new Entry('a', "Apple");			
		Entry[] entries = {
			cat, dog2, apple, dog
		};
		
		PigeonholeSort.sort(entries);
		
		assertThat(entries[0], is(apple));
		assertThat(entries[1], is(cat));
		assertThat(entries[2], is(dog2));
		assertThat(entries[3], is(dog));
		
		
	}
	
}
