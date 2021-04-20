package br.com.teste2;

public class Banheiro {

	private Integer gavetas;

	public Integer getGavetas() {
		return gavetas;
	}

	public void setGavetas(Integer gavetas) {
		this.gavetas = gavetas;
	}
	
	public static Banheiro criarBanheiro() {
		return new Banheiro();
	}

	@Override
	public String toString() {
		return "Banheiro [gavetas=" + gavetas + "]";
	}
	
}
