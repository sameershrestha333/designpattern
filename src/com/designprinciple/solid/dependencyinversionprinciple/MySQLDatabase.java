package com.designprinciple.solid.dependencyinversionprinciple;

public class MySQLDatabase implements IDatabase{
	
	@Override
	public void connect(){
		System.out.println("Connecting to database..");
	}
	
	@Override
	public void disconnect(){
		System.out.println("Disconnecting to database..");
	}

}
