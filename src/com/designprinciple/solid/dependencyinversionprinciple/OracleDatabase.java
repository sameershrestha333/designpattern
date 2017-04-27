package com.designprinciple.solid.dependencyinversionprinciple;

public class OracleDatabase implements IDatabase{
	
	@Override
	public void connect(){
		System.out.println("Connecting to Oracle database..");
	}
	
	@Override
	public void disconnect(){
		System.out.println("Disconnecting to Oracle database..");
	}

}
