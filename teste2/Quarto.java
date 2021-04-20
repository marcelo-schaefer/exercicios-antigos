package br.com.teste2;

public class Quarto {

	private String tamanhoCama;

	public String getTamanhoCama() {
		return tamanhoCama;
	}

	public void setTamanhoCama(String tamanhoCama) {
		this.tamanhoCama = tamanhoCama;
	}
	
	public static Quarto criarQuarto() {
		return new Quarto();
	}

	@Override
	public String toString() {
		return "Quarto [tamanhoCama=" + tamanhoCama + "]";
	}
	
}
