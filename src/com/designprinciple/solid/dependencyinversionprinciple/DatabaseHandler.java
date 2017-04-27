package com.designprinciple.solid.dependencyinversionprinciple;

public class DatabaseHandler {

	private IDatabase iDatabase;
	
	public  DatabaseHandler(IDatabase iDatabase){
		this.iDatabase= iDatabase;
	}
	
	public void connect(){
		this.iDatabase.connect();
	}
	
	public void disconnect(){
		this.iDatabase.disconnect();
	}
}
