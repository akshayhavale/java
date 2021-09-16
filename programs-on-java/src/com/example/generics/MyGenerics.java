package com.example.generics;

public class MyGenerics<T1, T2, T3> {

	private T1 t1;
	private T2 t2;
	private T3 t3;

	public T1 getObject1() {
		return t1;
	}

	public void setObject1(T1 t1) {
		this.t1 = t1;
	}

	public T2 getObject2() {
		return t2;
	}

	public void setObject2(T2 t2) {
		this.t2 = t2;
	}

	public T3 getObject3() {
		return t3;
	}

	public void setObject3(T3 t3) {
		this.t3 = t3;
	}

}
