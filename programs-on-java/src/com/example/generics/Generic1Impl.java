package com.example.generics;

public class Generic1Impl<T, U> implements GenericInterface1<T, U> {

	@Override
	public Double apply(T t, U u) {
		return sum(t, u);
	}

	public Double sum(T t, U u) {
		Double d1 = (double) t;
		Double d2 = (double) u;

		return d1 + d2;
	}

}
