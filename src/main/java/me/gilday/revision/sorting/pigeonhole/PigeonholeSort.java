package me.gilday.revision.sorting.pigeonhole;

public class PigeonholeSort {

	public static void sort(Entry[] entries) {
		
		//set up an auxiliary array of empty pigeon holes 
		Hole[] holes = new Hole[65535];
				
		//going over original array put each value into a pigeon hole corresponding to the key
		for (int i = 0; i < entries.length; i++) {
			
			Entry entry = entries[i];
			int holeIndex = Character.getNumericValue(entry.getKey());
			if(null == holes[holeIndex]) {
				holes[holeIndex] = new Hole(entry);
			} else {
				Hole hole = holes[holeIndex];
				while(hole.next != null) {
					hole = hole.getNext();
				}
				
				hole.setNext(new Hole(entry));
			}
			
		}
		
		//iterate over pigeonhole array in order and put elements in non-empty pigeonholes back into original
		for (int i = 0, j=0; i < holes.length; i++) {
			if(holes[i] != null) {
				Hole hole = holes[i];
				do {
					entries[j++] = hole.getEntry();
				} while ((hole = hole.getNext()) != null);
 			}
		}
		
	}
	
	public final static class Entry {
		
		private char key;
		private String value;

		public Entry(char key, String value) {
			this.key = key;
			this.value = value;
		}
		
		public char getKey() {
			return key;
		}
		
		public String getValue() {
			return value;
		}
		
		@Override
		public String toString() {
			return String.format("Key: %s, Value: %s", key, value);
		}
		
	}
	
	private final static class Hole {
		
		private Entry entry;
		private Hole next;
		
		public Hole(Entry entry) {
			this.entry = entry;
		}
		
		public Entry getEntry() {
			return this.entry;
		}		
		
		public Hole getNext() {
			return this.next;
		};
		
		public void setNext(Hole next) {
			this.next = next;
		}
		
	}
	
	
}
