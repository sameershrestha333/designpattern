package com.behavioraldesignpatterns.commandpattern;

public class TurnOffCommand implements Command {

	// composition
	private Light light;

	// to delegate constructor is needed.
	public TurnOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.turnOff();
	}

}
