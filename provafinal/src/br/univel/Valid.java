package br.univel;

public enum Valid {

	A {
		@Override
		void calcular(int i) {
			System.out.println(i / 2);
		}
	},
	B {
		@Override
		void calcular(int i) {
			System.out.println(i / 3);
		}
	};
	abstract void calcular(int i);
}
