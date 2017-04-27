package com.behavioraldesignpatterns.commandpattern.queue;

public class Task {

	private int id;

	public Task(int id) {
		super();
		this.id = id;
	}
	
	public void solveProblem(){
		System.out.println("Solving the problem with Id :"+id);
	}
}
