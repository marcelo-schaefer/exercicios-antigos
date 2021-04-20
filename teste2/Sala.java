package br.com.teste2;

public class Sala {

	private Integer quantidadeSofas;
	private Integer polegadasTv;

	public Integer getQuantidadeSofas() {
		return quantidadeSofas;
	}

	public void setQuantidadeSofas(Integer quantidadeSofas) {
		this.quantidadeSofas = quantidadeSofas;
	}

	public Integer getPolegadasTv() {
		return polegadasTv;
	}

	public void setPolegadasTv(Integer polegadasTv) {
		this.polegadasTv = polegadasTv;
	}

	public Sala(Integer quantidadeSofas, Integer polegadasTv) {
		this.quantidadeSofas = quantidadeSofas;
		this.polegadasTv = polegadasTv;
	}

	public static Sala criarSala(Integer quantidadeSofas, Integer polegadasTv) {
		return new Sala(quantidadeSofas, polegadasTv);
	}

	@Override
	public String toString() {
		return "Sala [quantidadeSofas=" + quantidadeSofas + ", polegadasTv=" + polegadasTv + "]";
	}

}
