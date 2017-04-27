package com.behavioraldesignpatterns.commandpattern.queue;

public class TaskSolverCommand implements Command {
	/**
	 * Every single taskSolver is associated with the Task
	 */

	private Task task;

	public TaskSolverCommand(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void execute() {
		this.task.solveProblem();
	}

}
