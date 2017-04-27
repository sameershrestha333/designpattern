package com.behavioraldesignpatterns.iterator;

public class NameRepository {
	private String[] names={"Adam","Joe","John","Sarah"};
	
	public Iterator getIterator(){
		return  new Nameiterator(names);
	}
}
