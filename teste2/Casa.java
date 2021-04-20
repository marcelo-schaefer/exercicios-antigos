package br.com.teste2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Casa {

	private Quarto quarto;
	private List<Banheiro> banheiros;
	private Sala sala;
	private Cozinha cozinha;

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Cozinha getCozinha() {
		return cozinha;
	}

	public void setCozinha(Cozinha cozinha) {
		this.cozinha = cozinha;
	}

	public List<Banheiro> getBanheiros() {
		return banheiros;
	}

	public void setBanheiros(List<Banheiro> banheiros) {
		this.banheiros = banheiros;
	}
	
	public static Casa criarCasaPelada() {
		return new Casa();
	}
	
	public static Casa criarCasaPronta() {
		Casa casa = new Casa();
		Quarto quarto = Quarto.criarQuarto();
		quarto.setTamanhoCama("queen");
		Banheiro banheiro = Banheiro.criarBanheiro();
		banheiro.setGavetas(5);
		Sala sala = Sala.criarSala(2, 40);
		Cozinha cozinha = Cozinha.criarCozinha();
		cozinha.setQuantidadeBocasFogao(4);
		Banheiro banheiro2 = Banheiro.criarBanheiro();
		banheiro2.setGavetas(2);
		Banheiro banheiro3 = Banheiro.criarBanheiro();
		banheiro3.setGavetas(7);
		
		casa.setBanheiros(Arrays.asList(banheiro, banheiro2, banheiro3));
		casa.setCozinha(cozinha);
		casa.setSala(sala);
		casa.setQuarto(quarto);
		
		return casa;
	}

	@Override
	public String toString() {
		return "Casa [quarto=" + quarto + ", banheiros=" + banheiros + ", sala=" + sala + ", cozinha=" + cozinha + "]";
	}
	
}
