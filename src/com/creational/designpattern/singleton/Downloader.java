package com.creational.designpattern.singleton;

public class Downloader {
	// eager version
	private static Downloader downloader = new Downloader();

	// we cannot instantiate the class
	private Downloader() {

	}

	// get the only object available
	public static Downloader getInstance() {
		return Downloader.downloader;
	}
	
	public void startDownloading(){
		System.out.println("Start downloading data from the web.");
	}

}
