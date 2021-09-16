package com.example.streams.dxc;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RegistryTester {
	public static void main(String[] args) {

		Action a1 = new Action();
		a1.setActionName("I1");
		Action a2 = new Action();
		a2.setActionName("I2");
		Action a3 = new Action();
		a3.setActionName("A1");
		Action a4 = new Action();
		a4.setActionName("B1");
		Action a5 = new Action();
		a5.setActionName("C1");
		List<Action> actions1 = Arrays.asList(a1, a2, a3, a4, a5);

		Action a6 = new Action();
		a6.setActionName("I3");
		Action a7 = new Action();
		a7.setActionName("I4");
		Action a8 = new Action();
		a8.setActionName("A2");
		Action a9 = new Action();
		a9.setActionName("B2");
		Action a10 = new Action();
		a10.setActionName("C2");
		List<Action> actions2 = Arrays.asList(a6, a7, a8, a9, a10);

		Person p1 = new Person();
		p1.setName("P1");
		p1.setActions(actions2);

		Person p2 = new Person();
		p2.setName("P2");
		p2.setActions(actions1);

		Registry r1 = new Registry();
		r1.setRegistryName("R1");
		r1.setPerson(p1);
		r1.setActions(actions1);
		Registry r2 = new Registry();
		r2.setRegistryName("R2");
		r2.setPerson(p2);
		r2.setActions(actions2);

		List<Registry> registries = Arrays.asList(r1, r2);

		/**
		 * Only Need Actions
		 */
		List<Action> actions = registries.stream().map(Registry::getActions).flatMap(Collection::stream)
				.filter(action -> action.getActionName().startsWith("I")).collect(Collectors.toList());

		actions.stream().forEach(System.out::println);

		List<Action> actionsSecWay = registries.stream().map(Registry::getPerson).map(Person::getActions)
				.flatMap(Collection::stream).filter(action -> action.getActionName().startsWith("A"))
				.collect(Collectors.toList());

		actionsSecWay.stream().forEach(System.out::println);

		System.out.println("*****************");

		/**
		 * Grouping based Action Names
		 */

		Map<String, List<Action>> collect = registries.stream().map(Registry::getActions).flatMap(Collection::stream)
				.collect(Collectors.groupingBy(Action::getActionName));
		
		collect.entrySet().stream().forEach(map -> System.out.println("Key = "+map.getKey()+" Value = "+map.getValue()));
		

		System.out.println("*****************");
		
		/**
		 * Grouping based Action Names
		 */

		Map<String, List<Action>> collect1 = registries.stream().map(Registry::getActions).flatMap(Collection::stream)
				.collect(Collectors.toMap(null, null));
		
		collect.entrySet().stream().forEach(map -> System.out.println("Key = "+map.getKey()+" Value = "+map.getValue()));
	}

}
