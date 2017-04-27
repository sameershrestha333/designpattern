package com.behavioraldesignpatterns.nullobjectpattern;

public class NullCustomer extends AbstractCustomer {

	public NullCustomer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public String getCustomer() {
		// TODO Auto-generated method stub
		return "Not available in database...";
	}

}
