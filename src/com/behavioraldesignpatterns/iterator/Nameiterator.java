package com.behavioraldesignpatterns.iterator;

public class Nameiterator implements Iterator {
	// 1-D array.
	private String[] names;
	private int index;

	public Nameiterator(String[] names) {
		this.names = names;
	}

	@Override
	public boolean hasNext() {
		return index < this.names.length;
	}

	@Override
	public Object next() {
		if (hasNext())
			return names[index++];
		return null;
	}

}
