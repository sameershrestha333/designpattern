package com.behavioraldesignpatterns.iterator;

public interface Iterator {
	/**
	 * 
	 * @return false if we have visited all the item
	 */
	public boolean hasNext();
	
	/**
	 * 
	 * @return next item
	 */
	public Object next();
	
}
