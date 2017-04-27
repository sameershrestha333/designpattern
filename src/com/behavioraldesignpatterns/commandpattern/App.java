package com.behavioraldesignpatterns.commandpattern;

public class App {

	public static void main(String[] args) {

		// invoker
		Switcher switcher = new Switcher();

		Light light = new Light();
		// command
		TurnOnCommand turnOnCommand = new TurnOnCommand(light);
		TurnOffCommand turnOffCommand = new TurnOffCommand(light);

		switcher.addCommand(turnOnCommand);
		switcher.addCommand(turnOffCommand);
		
		switcher.executeCommands();

	}

}
