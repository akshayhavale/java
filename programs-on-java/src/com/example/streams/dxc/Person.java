package com.example.streams.dxc;

import java.util.List;

public class Person {

	private String name;
	private List<Action> actions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", actions=" + actions + "]";
	}

	public void work() {
		// TODO Auto-generated method stub
		
	}

}
