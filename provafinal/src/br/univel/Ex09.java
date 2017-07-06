package br.univel;

public class Ex09 {

	public static void execute(Integer ii) {
		int idx = ii % 2;
		Valid v;
		if(idx == 0)
			v = Valid.A;
		else
			v = Valid.B;
		v.calcular(ii);
	}

}
