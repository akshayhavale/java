package com.example.streams.dxc;

import java.util.List;

public class Registry {

	private String registryName;
	private List<Action> actions;
	private Person person;

	public String getRegistryName() {
		return registryName;
	}

	public void setRegistryName(String registryName) {
		this.registryName = registryName;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Registry [registryName=" + registryName + ", actions=" + actions + ", person=" + person + "]";
	}

}
