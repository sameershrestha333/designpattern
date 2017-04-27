package com.behavioraldesignpatterns.iterator;

public class App {
	public static void main(String[] args) throws InterruptedException {
		NameRepository nameRepository=new NameRepository();
		for(Iterator iter=nameRepository.getIterator();iter.hasNext();){
			String name= (String) iter.next();
			Thread.sleep(1000);
			System.out.println(name);
		}
	}

}
