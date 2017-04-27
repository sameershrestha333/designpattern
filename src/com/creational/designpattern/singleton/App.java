package com.creational.designpattern.singleton;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Downloader object1=Downloader.getInstance();
		object1.startDownloading();
		
		Downloader object2=Downloader.getInstance();
		object2.startDownloading();
		
		if(object1.equals(object2))
			 System.out.println("They are same..");
		
		
	}

}
