package com.behavioraldesignpatterns.commandpattern;

import java.util.ArrayList;
import java.util.List;
//invoker
//this know how to execute the command but know nothing about concreate implementaion.it knows about
//about the command interface.

public class Switcher {
	public List<Command> commands;

	public Switcher() {
		super();
		this.commands = new ArrayList<>();
	}

	public void addCommand(Command command) {
		commands.add(command);
	}

	public void executeCommands() {
		for (Command cmd : commands) {
			//invoker know cmd has execute method and delegate execute method
			cmd.execute();
		}
	}
}
