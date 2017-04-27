package com.behavioraldesignpatterns.commandpattern;

public class TurnOnCommand implements Command {
	
	//composition
	private Light light;
	
	//to delegate constructor is needed.
	public TurnOnCommand(Light light) {
		super();
		this.light = light;
	}



	@Override
	public void execute() {
		this.light.turnOn();
	}

}
