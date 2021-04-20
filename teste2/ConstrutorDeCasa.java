package br.com.teste2;

import java.util.Arrays;
import java.util.List;

public class ConstrutorDeCasa {

	public Casa criarCasa(boolean temBanheiro, boolean temCozinha, boolean temQuarto, boolean temSala) {
		Casa casa = new Casa();

		if (temBanheiro) {
			casa.setBanheiros(Arrays.asList(new Banheiro()));
		}

		if (temCozinha) {
			casa.setCozinha(new Cozinha());
		}

		if (temQuarto) {
			casa.setQuarto(new Quarto());
		}

		if (temSala) {
			casa.setSala(new Sala(3, 50));
		}

		return casa;
	}

	public void validarCasa() {
		Casa cazinha = criarCasa(true, true, false, false);
		Casa cazinha2 = criarCasa(false, false, true, true);

		List<Casa> casas = Arrays.asList(cazinha, cazinha2);

		for (Casa casa : casas) {
			if (casa.getQuarto() != null) {
				System.out.println();
			}
		}
	}
}
