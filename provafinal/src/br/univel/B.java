package br.univel;

public class B extends A {
	@Override
	public void show(Integer num) {
		super.show(num + 1000);
	}
}
